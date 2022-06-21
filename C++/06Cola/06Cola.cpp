/*Ejemplo de Una Cola
Primera Entradas
Primeras Salidas
PEPS
*/

#include<iostream>

using namespace std;

//estructura
struct nodo{
	int nro; 
	struct nodo *siguiente;
};

//estructura cola
struct cola{
	nodo *delante;
	nodo *atras;
};

//encolar
void encolar(struct cola &q, int valor){
	//lo que hay adentro de la cola
	struct nodo *aux = new(struct nodo);
	
	aux ->nro = valor;
	aux ->siguiente = NULL;
	
	if(q.delante == NULL){
		q.delante = aux; //encolar el primer elemento
	}else{
		(q.atras)->siguiente = aux;
	}
	//el puntero siempre apunta al ultimo
	q.atras = aux;
}

//desencolar
int desencolar(struct cola &q){
	int num;
	struct nodo *aux;
	
	//aux apunte al inicio de la cola
	aux = q.delante;
	num = aux->nro;
	q.delante = (q.delante)->siguiente;
	
	//dale delete a aux
	delete(aux);
	
	return num;
}

//mostrar colita
void muestracola(struct cola q){
	//nodo auxiliar
	struct nodo *aux;
	//siempre el nodo hasta delante
	aux = q.delante;
	//cola vacia
	while(aux!=NULL){
		cout<<"\t --> "<<aux->nro;
		aux = aux->siguiente;
	}
}

//vaciar la cola, eliminar
void vaciarcola(struct cola &q){
	//auxiliar para eliminar cada elemento
	struct nodo *aux;
	//si esta vacia
	while(q.delante != NULL){
		aux = q.delante;
		q.delante = aux->siguiente;
		delete(aux);
	}
	q.delante = NULL;
	q.atras = NULL;
}

void menu(){
	cout<<"\n\t Ejemplo de Colita Kawaii\n";
	cout<<"\t 1. Encolar\n";
	cout<<"\t 2. Desencolar\n";
	cout<<"\t 3. Mostrar\n";
	cout<<"\t 4. Vaciar\n";
	cout<<"\t 5. Salir\n";
}

int main(){
	//primero declaramos la cola
	struct cola q;
	
	//defino la cola con sus apuntadores
	q.delante = NULL;
	q.atras = NULL;
	
	//datos
	int dato;
	int op;
	int x; //funcion de pop a la cola
	
	do{
		menu();
		cout<<"\t"; cin>>op;
		
		switch(op){
			case 1:
				cout<<"\n\t Numero a Encolar: ";
				cout<<"\t"; cin>>dato;
				encolar(q,dato);
				cout<<"\n\t Numero: "<<dato<<" encolado...\n";
			break;
			
			case 2:
				x = desencolar(q);
				cout<<"\n\t Numero: "<<x<<" desencolado...\n";
			break;
			
			case 3:
				cout<<"\n\t Mostrar Cola: \n";
				//saber que no este null
				if(q.delante != NULL) muestracola(q);
				else cout<<"\n\t Cola Vacia...\n";
			break;
			
			case 4:
				vaciarcola(q);
				cout<<"\n\t Colita se Vacio...\n";
			break;
			
		}
	}while(op != 5);
	
	return 0;
}
