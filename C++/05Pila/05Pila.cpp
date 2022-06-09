/*
Vamos a crear un ejemplo de una pila simple, porque quiero que hagan torres de hanoi
*/

#include<iostream>
#include<stdlib.h>//New

using namespace std;

//ejemplo de una pila
struct Nodo{
	int valor;
	Nodo *siguiente;
};

//metodos

void insertarpila(Nodo *&, int);
void mostrarpila(Nodo *&);
void eliminarpila(Nodo *&, int &);

int main(){
	/*
	el primero en entrar es el ultimo en salir
	el ultimo en entrar es el primero en salir
	*/
	int cantidad, i=0, op=1, v;
	
	//declaro la pila
	Nodo *pila = NULL;
	
	//menu
	do{
		cout<<"\n\t***Selecciona Opción Deseada***\n";
		cout<<"\n\t1. Inserta Valor\n";
		cout<<"\t2. Mostrar Valor\n";
		cout<<"\t3. Eliminar Valor\n";
		cout<<"\t4. Salir\n";
		cout<<"\tOpción: ";cin>>op;
		
		switch(op){
			case 1:
				cout<<"\n\tIngresa Cantidad de Valores a Insertar en la Pila: ";
				cin>>cantidad;
				
				while(i<cantidad){
					cout<<"\n\tIngresa Valor: ";
					cin>>v;
					insertarpila(pila, v);
					i++;
				}
			break;
			
			case 2:
				if(pila == NULL){
					cout<<"\n\tPila Vacia\n";
				}else{
					cout<<"\n\tElementos de Pila\n";
					mostrarpila(pila);
					cout<<endl;
				}
			break;
			
			case 3:
				if(pila!=NULL){
					eliminarpila(pila,v);
					cout<<"\n\t"<<v<<" Eliminado| \n"<<endl;
				}else{
					cout<<"\tPila Vacia* \n";
				}
			break;
			
			default:
				cout<<"\n\Hasta Luego\n";
		}
	}while(op!=4);
		
}

//push
void insertarpila(Nodo *&pila, int v){
	Nodo *pushpila = new Nodo();
	pushpila->valor=v;
	pushpila->siguiente=pila;
	pila = pushpila;
}

//mostrar
void mostrarpila(Nodo *&pila){
	//necesito un auxiliar para mostrar
	Nodo *aux= new Nodo();
	aux = pila;
	//imprimir los valores
	while(aux != NULL){
		cout<<"\t"<<aux->valor<<" --> ";
		aux = aux->siguiente;
	}
}

//pop 
void eliminarpila(Nodo *&pila, int &v){
	Nodo *aux = pila;
	v = aux->valor;
	pila = aux->siguiente;
	delete aux;
}
