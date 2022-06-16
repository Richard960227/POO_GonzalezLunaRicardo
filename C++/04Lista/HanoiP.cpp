#include<wchar.h>
#include<locale.h>
#include<iostream>
#include<conio.h>

//la estructura del nodo
struct nodo{
	int nro;
	struct nodo *siguiente, *c;
};

//definir un tipo de estructura
typedef nodo *pila;

using namespace std;


//metodos recordando que tengo 2 pilas

void imprimir1(pila);
void eliminarPila(pila &);
void push(pila &, int);
void unirPilas(pila, pila);
int pop(pila &);
int mover(int, char, char, char);

main(){
	
	setlocale(LC_ALL,"");
	pila p1 = NULL;
	pila p2 = NULL;
	pila p3 = NULL;
	
	int valor, i, opc;
	int n_discos, movimientos;
	
	cout<<"\n\tQuieres Jugar?";
	cout<<"\n\t1. Si";
	cout<<"\n\t2. No\n";
	cin>>opc;
		
	while(opc > 1){
		
		cout<<"\n\tIngresa Numero de Discos: ";
		scanf("%d", &n_discos);
 		movimientos = mover(n_discos, 'A', 'B', 'C');
 		printf("\nmovimientos efectuados: %d\n", movimientos);
	}
		cout<<"Hasta Luego";
	
	return 0;
}

//push
// Función para mover discos de una torre a otra
int mover(int n_discos, char a, char b, char c)
{
 static int movimientos = 0;

 if (n_discos > 0)
 {
 mover(n_discos-1, a, c, b);
 printf("mover disco de %c a %c\n", a, c);
 movimientos++;
 mover(n_discos-1, b, a, c);
 }
 return movimientos;
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
