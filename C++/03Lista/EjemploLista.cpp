#include<iostream>

using namespace std;

//definir la estructura de la lista
struct Nodo{
	
	//los datos de la lista
	int valor;
	Nodo *siguiente;
	Nodo *anterior;
};

//metodo para insertar
void insertarLista(Nodo *&, int);
void mostrarLista(Nodo *);
void eliminarFinal(Nodo *&, int);
void eliminarLista(Nodo *&, int &);


//declarar mi variable de la lista
Nodo *lista = NULL;
	
int main(){
	
	
	
	//variables
	int op = 1, c, i = 0, valores;
	
	cout<<"\t***Trabajando con listas (simples, doblemente enlazadas, circulares y circulares dobles***\n\n";
	while(op!=5){
		cout<<endl<<"\t\tEjemplo de Lista Simple\n";
		cout<<"\t1. Insertar Nuevo Valor en Lista\n";
		cout<<"\t2. Ver Lista\n";
		cout<<"\t3. Eliminar Final\n";
		cout<<"\t4. Eliminar Lista\n";
		cout<<"\t5. Salir\n";
		cout<<"\t";cin>>op;
	
		switch(op){
			case 1:
				cout<<"\n\tIndica Numero de Valores a Insertar\n";
				cout<<"\t";cin>>valores;
				while(i<valores){
					cout<<"\n\t***Valor ["<<i<<"]***\n";
					cout<<"\t";cin>>c;
					//mando a llamar al metodo para insertarlo
					insertarLista(lista, c);
					i++;
				}
				break;
			case 2:
				if(lista == NULL){
					cout<<"\n\tLista Vacia\n";
				}else{
					cout<<"\n\tElementos de Lista\n";
					mostrarLista(lista);
					cout<<endl;
				}
				break;
			case 3:
				if(lista==0){
					cout<<"\n\tLista Vacia\n";
				}else{
					eliminarFinal(lista, c);
				}
				break;
			case 4:
				while(lista != NULL){
					eliminarLista(lista, c);
					cout<<"\t --> ";
				}
				cout<<"\n";
				break;
			default:
				cout<<"\n\t***Gracias x Estar Aqui UwU***";
		}
	}
	
	return 0;
	
}

void insertarLista(Nodo *&lista, int c){
		
		Nodo *inslista = new Nodo();
		inslista->valor = c;
		
		//necisto un auxiliar para encadenar los valores de la lista
		Nodo *aux = lista;
		Nodo *aux2;
		
		//Se meten ordenados los datos
		while((aux!=NULL)&&(aux->valor < c)){
			aux2 = aux;
			aux = aux->siguiente;
		}
		
		if (lista == aux){
			lista = inslista;
		}else{
			aux2->siguiente = inslista;
		}
		
		inslista->siguiente = aux;
		cout<<"\tElemento: "<<c<<" insertado\n";
}

void mostrarLista(Nodo *lista){
	
	Nodo *recurso= new Nodo();
	recurso = lista;
	
	//imprimir los valores
	while(recurso != NULL){
		cout<<"\t"<<recurso->valor<<" --> ";
		recurso = recurso->siguiente;
	}
}

void eliminarFinal(Nodo *&lista, int c){
	
	//Si la lista no esta vacia
	if(lista != NULL){
		Nodo *aux_borrar;
		Nodo *anterior = NULL;
		aux_borrar = lista;
		
		//Recorrer la Lista
		while((aux_borrar != NULL)&&(aux_borrar->valor != c)){
			anterior = aux_borrar;
			aux_borrar = aux_borrar->siguiente;
		}
		
		//El Final ya se Elimino
		if(aux_borrar == NULL){
			cout<<"\tYa Eliminaste el Final\n";
		}//El Dato Final
		else{
			anterior->siguiente = aux_borrar->siguiente;
			delete aux_borrar;
		}
	}
}

void eliminarLista(Nodo *&lista, int &c){
	Nodo *aux = lista;
	c = aux -> valor;
	lista =aux->siguiente;
	delete aux;
}


