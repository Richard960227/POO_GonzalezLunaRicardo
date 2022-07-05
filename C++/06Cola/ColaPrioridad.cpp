/*Vamos a ver una cola que se atiende por prioridades*/

#include<iostream>
#include<stdlib.h>

using namespace std;

//definir el nodo

struct nodo{
	char dato;
	int prioridad;
	struct nodo *siguiente;
};

struct cola{
	nodo *delante;
	nodo *atras;
};

//crear nodo
struct nodo *crearNodo(char x, int pri){
	struct nodo *nuevoNodo = new(struct nodo);
	nuevoNodo->dato = x;
	nuevoNodo->prioridad = pri;
	return nuevoNodo;
}

void encolar(struct cola &q, char valor, int priori){
	//auxiliar para mover el lado
	struct nodo *aux = crearNodo(valor, priori);
	aux->siguiente = NULL;
	
	if(q.delante == NULL){
		//el primero en encolar
		q.delante = aux;
	}else{
		(q.atras)-> siguiente = aux;
	}
	//siempre debe apuntar al ultimo
	q.atras = aux;
}

//mostrar la cola
void mostrarCola(struct cola q){
	struct nodo *aux;
	aux = q.delante;
	cout<<"\n Caracter de Prioridad\n";
	while(aux!=NULL){
		cout<<" "<<aux->dato<<" | "<<aux->prioridad<<endl;
		aux = aux->siguiente;
	}
}

//definir una prioridaad
//criterio 0

void ordenarPrioridad(struct cola &q){
	//metodo de burbuja
	
	//necesito dos aux
	struct nodo *aux1, *aux2;
	int p_aux;
	char c_aux;
	
	//aux1 va a ser mi colita con los datos
	aux1 = q.delante;
	
	while(aux1->siguiente != NULL){
		//comparar aux1 vs aux2
		aux2 = aux1->siguiente;
		
		while(aux2 != NULL){
			
			if(aux1->prioridad > aux2->prioridad){
				p_aux = aux1->prioridad;
				c_aux = aux1->dato;
				
				aux1->prioridad = aux2->prioridad;
				aux1->dato = aux2->dato;
				
				aux2->prioridad = p_aux;
				aux2->dato = c_aux;
			}
			aux2 = aux2->siguiente;
		}
		aux1 = aux1->siguiente;
	}
}

void insertar(struct cola &q, char c, int pri){
	encolar(q,c,pri);
	ordenarPrioridad(q);
}

void menu(){
	cout<<endl<<"________________________";
	cout<<endl<<"| Colas de Prioridad   |";
	cout<<endl<<"|1.Encolar  | 3.Guardar|";  
	cout<<endl<<"|2.Mostrar  | 4.Salir  |";
	cout<<endl<<"--------------- Opcion: ";
}

/*Supongamos que quiero guardar la cola en un archivo txt
void guardar(struct cola &q){
		//primero crear el archivo
		FILE *archivo;
		archivo = fopen("guardar.txt","w");//aqui va el nombre
		//se le conoce como la serializacion del archivo
		//struct cola *c = new (struct cola);
		if(!q){
			cout<<"No hay nada que guardar";
			return;
		}
	//	q = c;
		while(q){
			fprintf(archivo, "%i\n", q->c) //%i enteros %c caracter
			q = q->siguiente;
		}
	cout<<"Archivo Guardado";
	//es importante crrar el flujo del archivo
	fclose(archivo);
	getchar();
}
/*Para cargar es lo mismo
cargar
fprint = fscanf(archivo,"%i\n, &q);
	*/	

int main(){
	struct cola q;
	q.delante = NULL;
	q.atras  = NULL;
	
	//variables
	char c; //caracter a encolar
	int priori; //prioridad
	int op; //opcion menu
	int x; // para la funcion pop
	
	do{
		menu();
		cin>>op;
		
		switch(op){
			case 1:
				cout<<"\nIngrese Caracter: ";
				cin>>c;
				cout<<endl;
				cout<<"Ingrese la Prioridad: ";
				cin>>priori;
				cout<<endl;
				
				insertar(q, c, priori);
				
				cout<<"\nCaracter: "<<c<<" encolado\n";
			break;
			
			case 2:
				cout<<"\nMostrar la Cola\n";
				if(q.delante!=NULL){
					mostrarCola(q);
				}else{
					cout<<"\nCola Vacia\n";
				}
			break;
			
			case 3:
				cout<<"\nGuardar Cola\n";
				//guardar(q);
			
			default:
				cout<<"\nOpcion no Valida\n";
				system("pause");
				exit(0);
		}
		system("pause");
		system("cls");
	}while(op!=3);
	return 0;
}


