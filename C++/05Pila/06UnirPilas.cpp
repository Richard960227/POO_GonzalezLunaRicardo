/*Ejemplo de dos pilas

El programa consiste en crear 
un menu con 4 opciones para
apilar, ver, unir y salir*/

#include<wchar.h>
#include<locale.h>
#include<iostream>
#include<conio.h>

//la estructura del nodo
struct nodo{
	int nro;
	struct nodo *siguiente;
};

//definir un tipo de estructura
typedef nodo *pila;

using namespace std;


//metodos recordando que tengo 2 pilas

void push(pila &, int);
void unirPilas(pila, pila);
void imprimir1(pila);
void imprimir2(pila);
void imprimir3(pila, pila, pila, pila);
int pop(pila &);

main(){
	
	setlocale(LC_ALL,"");
	pila p1 = NULL;
	pila p2 = NULL;
	pila p3 = NULL;
	pila aux = NULL;
	
	int opc, n, valor, i;
	
	do{
		cout<<"\n\t1.Apilar";
		cout<<"\n\t2.Ver Valores de la Pila";
		cout<<"\n\t3.Unir Pilas";
		cout<<"\n\t4.Eliminar Ultimo";
		cout<<"\n\t5.Eliminar Todo";
		cout<<"\n\t6.Salir";
		cout<<"\n\tOpción: ";
		cin>>opc;
		
		switch(opc){
			case 1:
				cout<<"\n\tIngresa Limite de la Pilas: ";
				cin>>n;
				cout<<"\n\tIngresa los Valores Pila 1\n";
				for(i=0; i<n; i++){
					cout<<"\tElemento: ";
					cin>>valor;
					//meter
					push(p1, valor);
				}
				cout<<"\n\tIngresa los Valores Pila 2\n";
				for(i=0; i<n; i++){
					cout<<"\tElemento: ";
					cin>>valor;
					//meter
					push(p2, valor);
				}
			break;
			
			case 2:
				cout<<"\n\tContenido de la Pila 1\n";
				imprimir1(p1);
				
				cout<<"\n\tContenido de la Pila 2\n";
				imprimir2(p2);
			break;
			
			case 3:
				if(p3 != NULL){
					cout<<"\n\tPilas Unidas\n";
					unirPilas(p1,p2);
					imprimir3(p1, p2, aux, p3);
				}else{
					cout<<"\n\t*Pila Vacia* \n";
				}
				
			break;
			
			case 4:
				if(p3 != NULL){
					pop(p3, n);
					cout<<"\n\t"<<n<<" Eliminado| \n"<<endl;
				}else{
					cout<<"\n\t*Pila Vacia* \n";
				}
			break;
			
			case 5:
				if(p3 != NULL){
					while(p3 == NULL){
					pop(p3, n);
					}
				}else{
					cout<<"\n\t*Pila Vacia* \n";
				}
			break;
			
			default:
				cout<<"\n\tHasta Luego";
			break;
			
		}
	}while(opc!=6);
	
	return 0;
}

//push
void push(pila &p, int n){
	pila q = new(struct nodo);
	q -> nro = n;
	q -> siguiente = p;
	p = q;
}

void unirPilas(pila p1, pila p2){
	pila q = p1;
	while(q -> siguiente != NULL){
		q = q ->siguiente;
		q -> siguiente = p2;
	}
}

void imprimir1(pila p1){
	while(p1!=NULL){
		cout<<"\tValor: "<<p1->nro<<endl;
		p1=p1->siguiente;
	}
}

void imprimir2(pila p2){
	while(p2!=NULL){
		cout<<"\tValor: "<<p2->nro<<endl;
		p2=p2->siguiente;
	}
}

void imprimir3(pila p1, pila p2, pila aux, pila p3){
	if(p1 == NULL || p2 == NULL){
		cout<<"\n\t*Pilas Vacias*";
	}else{
		while(p1 != NULL && p2 != NULL){
			push(aux, p1->nro + p2->nro);
			p1 = p1->siguiente;
			p2 = p2->siguiente;
		}
	}
	while(aux!=NULL){
		push(p3, aux->nro);
		aux = aux->siguiente;
	}
	while(p3!=NULL){
		cout<<"\n\t --> "<<p3->nro<<endl;
		p3 = p3->siguiente;
	}	
}

//pop 
void pop(pila &p3, int n){
	pila aux = p3;
	n = aux->nro;
	p3 = aux->siguiente;
	delete aux;
}
