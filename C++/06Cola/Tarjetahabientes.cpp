#include<iostream>
#include<stdlib.h>

using namespace std;

//definir el nodo

struct nodo{
	string dato;
	int cuenta;
	int cantidad;
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
	nuevoNodo->cuenta = pri;
	nuevoNodo->cantidad= depo;
	return nuevoNodo;
}

void encolar(struct cola &q, string valor, int cuenta, int cantidad){
	//auxiliar para mover el lado
	struct nodo *aux = crearNodo(valor, cuenta, cantidad);
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
	cout<<"\nFila de Tarjetahabientes\n";
	cout<<"|Tarjetahabiente"<<"|Tipo de Cuenta"<<"|Deposito"<<endl;
	while(aux!=NULL){
		cout<<"|"<<aux->dato<<"|"<<aux->cuenta<<"|$"<<aux->cantidad<<endl;
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
	string c_aux;
	
	//aux1 va a ser mi colita con los datos
	aux1 = q.delante;
	
	while(aux1->siguiente != NULL){
		//comparar aux1 vs aux2
		aux2 = aux1->siguiente;
		
		while(aux2 != NULL){
			
			if(aux1->cuenta > aux2->cuenta){
				p_aux = aux1->cuenta;
				c_aux = aux1->dato;
				
				aux1->cuenta = aux2->cuenta;
				aux1->dato = aux2->dato;
				
				aux2->cuenta = p_aux;
				aux2->dato = c_aux;
			}
			aux2 = aux2->siguiente;
		}
		aux1 = aux1->siguiente;
	}
}

void insertar(struct cola &q, string turno, int cuenta, int cantidad){
	encolar(q,turno,cuenta,cantidad);
	ordenarPrioridad(q);
}

void menu(){
	cout<<endl<<"_____________________________";
	cout<<endl<<"|     Tarjetahabientes      |";
	cout<<endl<<"|---------------------------|";
	cout<<endl<<"|1.Asignar Turno            |";  
	cout<<endl<<"|2.Mostrar Tarjetahabientes |";
	cout<<endl<<"|3.Salir                    |";
	cout<<endl<<"|___________________________|";
	cout<<endl<<"-------------------Opcion: ";
}

int main(){
	struct cola q;
	q.delante = NULL;
	q.atras  = NULL;
	
	//variables
	string turno; //caracter a encolar
	int cuenta, deposito, cantidad; //prioridad
	int op; //opcion menu
	int x; // para la funcion pop
	
	do{
		menu();
		cin>>op;
		
		switch(op){
			case 1:
				cout<<"\n\tNombre: ";
				cin>>turno;
				cout<<endl;
				cout<<"Tipo de Cuenta... \n\t1)VIP\n\t2)Empresarial\n\t3)Normal\n\t4)Sin Cuenta\n";
				cin>>cuenta;
				cout<<endl;
				cout<<"¡Desea Realizar un Deposito?\n\t1)Si\n\t2)No";
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
			
			case 2:
				cout<<"\nMostrar Fila\n";
				if(q.delante!=NULL){
					mostrarCola(q);
				}else{
					cout<<"\nFila Vacia\n";
				}
			break;
			
			default:
				cout<<"\nOpcion no Valida\n";
				system("pause");
				exit(0);
		}
		system("pause");
		system("cls");
	}while(op!=2);
	return 0;
}
