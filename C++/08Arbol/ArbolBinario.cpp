#include <iostream>
#include <conio.h>
#include <stdlib.h>

using namespace std;

struct Nodo{
	int dato;
	Nodo *der;
	Nodo *izq;
	Nodo *padre;
};

//Prototipos
void menu();
Nodo *crearNodo(int, Nodo *);
void insertarNodo(Nodo *&, int, Nodo *);
void mostrarArbol(Nodo *, int);
bool busqueda(Nodo *, int);
void preOrden(Nodo *);
void inOrden(Nodo *);
void postOrden(Nodo *);
void eliminar(Nodo *, int);
void eliminarNodo(Nodo *);
Nodo *minimo(Nodo *);
void reemplazar(Nodo *, Nodo *);
void destruirNodo(Nodo *);

Nodo *arbol=NULL;

int main(){
	menu();
	
	getch();
	return 0;
}

//Funcion de menu
void menu(){
	int dato, opcion, contador=0;
	
	do{
		cout<<"\n\t\t.:MENU:."<<endl;
		cout<<"\t1. Insertar Nuevo Nodo"<<endl;
		cout<<"\t2. Mostrar el Arbol Completo"<<endl;
		cout<<"\t3. Buscar Elemento en el Arbol"<<endl;
		cout<<"\t4. Recorrer Arbol en PreOrden"<<endl;
		cout<<"\t5. Recorrer Arbol en InOrden"<<endl;
		cout<<"\t6. Recorrer Arbol en PosOrden"<<endl;
		cout<<"\t7. Eliminar Nodo del Arbol"<<endl;
		cout<<"\t8. Salir"<<endl;
		cout<<"\tOpcion:. ";
		cin>>opcion;
		
		switch(opcion){
			case 1:
				cout<<"\n\tDigite un Numero: ";
				cin>>dato;
				insertarNodo(arbol, dato, NULL);//insertamos un nuevo nodo
				cout<<endl<<"\t";
				system("pause");
			break;
			case 2:
				cout<<"\n\tMostrando el Arbol Completo";
				cout<<endl;cout<<endl;
				mostrarArbol(arbol, contador);
				cout<<endl<<"\t";
				system("pause");
			break;
			case 3:
				cout<<"\n\tDigite el Elemento a Buscar: ";
				cin>>dato;
				if(busqueda(arbol, dato)==true){
					cout<<"\n\tElemento "<<dato<<" a sido encontrado en el arbol";
				}else{
					cout<<"\n\tElemento No Enonctrado";
				}
				cout<<endl<<"\t";
				system("pause");
			break;
			case 4:
				cout<<"\n\tRecorrido en PreOrden: ";
				preOrden(arbol);
				cout<<endl;
				cout<<endl<<"\t";
				system("pause");
			break;
			case 5:
				cout<<"\n\tRecorrido en InOrden: ";
				inOrden(arbol);
				cout<<endl;
				cout<<endl<<"\t";
				system("pause");
			break;
			case 6:
				cout<<"\n\tRecorrido en PosOrden: ";
				postOrden(arbol);
				cout<<endl;
				cout<<endl<<"\t";
				system("pause");
			break;
			case 7:
				cout<<"\n\tDigite el Elemento a Eliminar: ";
				cin>>dato;
				eliminar(arbol, dato);
				cout<<endl<<"\t";
				system("pause");
			break;
		}
		system("cls");
	}while(opcion!=8);
}

//Funcion para crear un nuevo nodo
Nodo *crearNodo(int n, Nodo *padre){
	Nodo *nuevo_nodo=new Nodo();
	
	nuevo_nodo->dato=n;
	nuevo_nodo->der=NULL;
	nuevo_nodo->izq=NULL;
	nuevo_nodo->padre = padre;
	
	return nuevo_nodo;
}

//Funcion para insertar elementos en el arbol
void insertarNodo(Nodo *&arbol, int n, Nodo *padre){
	if(arbol == NULL){ //Si el arbol esta vacio
		Nodo *nuevo_nodo=crearNodo(n, padre);
		arbol=nuevo_nodo;
	}
	else{ //Si el arbol tiene un nodo o mas
		int valorRaiz=arbol->dato; //Obtenemos el valor de la raiz
		if(n < valorRaiz){ //Si el elemento es menor a la raiz, insertamos en izq
			insertarNodo(arbol->izq, n, arbol);
		}else{ //Si el elemento es mayor a la raiz, insertamos en der
			insertarNodo(arbol->der, n, arbol);
		}
	}
}

//Funcion para mostrar el arbol completo
void mostrarArbol(Nodo *arbol, int cont){
	if(arbol == NULL){ //Si el arbol esta vacio
		return;
	}else{
		mostrarArbol(arbol->der, cont+1);
		for(int i=0; i<cont; i++){
			cout<<"  ";
		}
		cout<<arbol->dato<<endl;
		mostrarArbol(arbol->izq, cont+1);
	}
	
}


//Funcion para buscar un elemento en el arbol
bool busqueda(Nodo *arbol, int n){
	if(arbol == NULL){ //Si el arbol esta vacio
		return false;
	}else if(arbol->dato == n){ //Si el nodo es igual al elemento
		return true;
	}else if(n < arbol->dato){
		return busqueda(arbol->izq, n);
	}else{
		return busqueda(arbol->der, n);
	}
}

//Funcion para recorrido en profundidad - PreOrden
void preOrden(Nodo *arbol){
	if(arbol == NULL){
		return;
	}else{
		cout<<arbol->dato<<" - ";
		preOrden(arbol->izq);
		preOrden(arbol->der);
	}
}

//Funcion para recorrido en profundidad - inOrden
void inOrden(Nodo *arbol){
	if(arbol == NULL){
		return;
	}else{
		inOrden(arbol->izq);
		cout<<arbol->dato<<" - ";
		inOrden(arbol->der);
	}
}

//Funcion para recorrido en profundidad - posOrden
void postOrden(Nodo *arbol){
	if(arbol == NULL){
		return;
	}else{
		postOrden(arbol->izq);
		postOrden(arbol->der);
		cout<<arbol->dato<<" - ";
	}
}

//Eliminar un nodo del arbol
void eliminar(Nodo *arbol, int n){
	if(arbol == NULL){ //Si el arbol esta vacio
		return; //No hacer nada
	}else if(n < arbol->dato){ //S el valor es menor
		eliminar(arbol->izq, n); //Buscar por izq
	}else if(n > arbol->dato){ //Si el valor es mayor
		eliminar(arbol->der, n); //Buscar por la der
	}else{ //si encuentra el valor
		eliminarNodo(arbol);
	}
}

//Funcion para determinar el nodo mas izq posible
Nodo *minimo(Nodo *arbol){
	if(arbol == NULL){ //Si el arbol esta vacio
		return NULL; //retornamos nulo
	}
	if(arbol->izq){ //Si tiene hijo izq
		return minimo(arbol->izq); //buscamos la parte mas izq posible
	}else{ //Si no tiene hijo izq
		return arbol; //retornamos el mismo nodo
	}
}

//Funcion para reemplazar dos nodos
void reemplazar(Nodo *arbol, Nodo *nuevoNodo){
	if(arbol->padre){
		//arbol->padre hay que asignarle su nuevo hijo
		if(arbol->dato == arbol->padre->izq->dato){
			arbol->padre->izq = nuevoNodo;
		}
		else if(arbol->dato == arbol->padre->der->dato){
			arbol->padre->der = nuevoNodo;
		}
	}
	if(nuevoNodo){
		//Asigna nuevo padre
		nuevoNodo->padre = arbol->padre;
	}
}

//Funcion para destruir un nodo
void destruirNodo(Nodo *nodo){
	nodo->izq = NULL;
	nodo->der = NULL;
	
	delete nodo;
}

//Funcion para eliminar el nodo encontrado
void eliminarNodo(Nodo *nodoEliminar){
	if(nodoEliminar->izq && nodoEliminar->der){//Si el Nodo tiene hijo izq y der
		Nodo *menor = minimo(nodoEliminar->der);
		nodoEliminar->dato = menor->dato;
		eliminarNodo(menor);
	}else if(nodoEliminar->izq){//Si tiene hijo izq
		reemplazar(nodoEliminar, nodoEliminar->izq);
		destruirNodo(nodoEliminar);
	}else if(nodoEliminar->der){//Si tiene hijo der
		reemplazar(nodoEliminar, nodoEliminar->der);
		destruirNodo(nodoEliminar);
	}
	else{  //No tiene hijos
		reemplazar(nodoEliminar, NULL);
		destruirNodo(nodoEliminar);
	}
}
