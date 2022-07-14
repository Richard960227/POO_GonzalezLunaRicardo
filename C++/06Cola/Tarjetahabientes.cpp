#include<iostream>
#include<stdlib.h>

using namespace std;

struct nodo{
	string dato;
	int prioridad;
	int deposito;
	struct nodo *siguiente;
};

struct cola{
	nodo *delante;
	nodo *atras;
};

//crear nodo
struct nodo *crearNodo(string x, int pri, int depo){
	struct nodo *nuevoNodo = new(struct nodo);
	nuevoNodo->dato = x;
	nuevoNodo->prioridad = pri;
	nuevoNodo->deposito= depo;
	return nuevoNodo;
}

void encolar(struct cola &q, string valor, int priori, int deposito){
	//auxiliar para mover el lado
	struct nodo *aux = crearNodo(valor, priori, deposito);
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
	
	if(aux!=NULL){
		cout<<"\n\tFila de Tarjetahabientes";
		cout<<"\n\tTipo de Cuenta... \n\t1)VIP\n\t2)Empresarial\n\t3)Normal\n\t4)Sin Cuenta";
		cout<<"\n\t|Tarjetahabiente"<<"|Tipo de Cuenta"<<"|Deposito"<<endl;
		while(aux!=NULL){
			cout<<"\t|"<<aux->dato<<"           |"<<aux->prioridad<<"             | $"<<aux->deposito<<endl;
			aux = aux->siguiente;
		}
	}else{
		cout<<"\n\tFila Vacia\n";
	}	
}

//definir una prioridaad
//criterio 0

void ordenarPrioridad(struct cola &q){
	//metodo de burbuja
	
	//necesito dos aux
	struct nodo *aux1, *aux2, *aux3;
	int d_aux;
	int p_aux;
	string c_aux;
	
	//aux1 va a ser mi colita con los datos
	aux1 = q.delante;
	
	while(aux1->siguiente != NULL){
		//comparar aux1 vs aux2
		aux2 = aux1->siguiente;
		
		while(aux2 != NULL){
			
			aux3 = aux2->siguiente;
			
			while(aux3 != NULL){
				if(aux1->prioridad > aux2->prioridad){
				p_aux = aux1->prioridad;
				c_aux = aux1->dato;
				d_aux = aux1->deposito;
				
				aux1->prioridad = aux2->prioridad;
				aux1->dato = aux2->dato;
				aux1->deposito = aux2->deposito;
				
				aux2->prioridad = p_aux;
				aux2->dato = c_aux;
				aux2->deposito = d_aux;
				
				aux3->prioridad = p_aux;
				aux3->dato = c_aux;
				aux3->deposito = d_aux;
				}
				aux3 = aux3->siguiente;
			}
			aux2 = aux2->siguiente;
		}
		aux1 = aux1->siguiente;
	}
}

void insertar(struct cola &q, string c, int cuenta, int pri){
	encolar(q,c,cuenta,pri);
	ordenarPrioridad(q);
}

void menu(){
	cout<<endl<<"\t_____________________________";
	cout<<endl<<"\t|     Tarjetahabientes      |";
	cout<<endl<<"\t|---------------------------|";
	cout<<endl<<"\t|1.Asignar Turno            |";  
	cout<<endl<<"\t|2.Mostrar Tarjetahabientes |";
	cout<<endl<<"\t|3.Salir                    |";
	cout<<endl<<"\t|___________________________|";
	cout<<endl<<"-----------------------Opcion: ";
}

int main(){
	struct cola q;
	q.delante = NULL;
	q.atras  = NULL;
	
	//variables
	string turno; //caracter a encolar
	int cuenta, deposito, cantidad; //prioridad
	char op; //opcion menu
	int x; // para la funcion pop
	
	do{
		menu();
		cin>>op;
		
		switch(op){
			case '1':
				cout<<"\n\tNombre: ";
				cin>>turno;
				cout<<endl;
				cout<<"\tTipo de Cuenta... \n\t1)VIP\n\t2)Empresarial\n\t3)Normal\n\t4)Sin Cuenta\n\tCuenta: ";
				cin>>cuenta;
				cout<<endl;
				cout<<"\n\t¡Desea Realizar un Deposito?\n\t1)Si\n\t2)No\n\tOpcion: ";
				cin>>deposito;
				if(deposito>=2){
					cout<<"\n\t***Sin Deposito***";
				}else{
					cout<<"\n\tCantidad a Depositar: ";
					cin>>cantidad;
				}
				cout<<endl;
				
				insertar(q, turno, cuenta, cantidad);
				
				cout<<"\n\tTarjetahabiente: "<<turno<<" en Fila\n";
			break;
			
			case '2':
				mostrarCola(q);
			break;
			
			default:
				cout<<"\n\tOpcion no Valida\n";
				system("pause");
				exit(0);
			break;
		}
		system("pause");
		system("cls");
	}while(op!='2');
	return 0;
}
