#include <stdio.h>
#include <stdlib.h>
#include <iostream>

int mover(int, char, char, char);
//Numero de discos de la pila

using namespace std;

//declarar la pila
struct pila {
	int item[];
	int final;
};
typedef struct pila TodaPila;

//Funciones de la pila
//int push(TodaPila& p, int e);
int pop(TodaPila& p, int& e);
int stacktop(TodaPila p, int& e);
int empty(TodaPila p);
void iniciapila(TodaPila& p);

//Funciones de la Torre de Hanoi
void TorreHanoi(int n, TodaPila& A, TodaPila& B, TodaPila& C, TodaPila* a, TodaPila* b, TodaPila* c);
void mostrar(TodaPila C);

int main() {
	int n, movimientos;
	
	TodaPila A, B, C;
	iniciapila(A);
	iniciapila(B);
	iniciapila(C);

	//Las posiciones de las torres
	TodaPila* a = &A;
	TodaPila* b = &B;
	TodaPila* c = &C;


	cout<<"\tTORRE DE HANOI\t \n";

	cout<<"\nIngresa la cantidad de discos: \n";
	cin>>n;

	for (int i = n; i > 0; i--)
	//push(A, i);

	TorreHanoi(n, A, B, C, a, b, c);
	
 	cout<<"\nmovimientos efectuados: \n"<<movimientos;
 
	system("pause");
	return 0;
}


//Saca los discos de la Torre
int pop(TodaPila& p, int& e) {
	if (empty(p))
	return 0;
	e = p.item[p.final--];
	return 1;
}

//Función de la Pila
int stacktop(TodaPila p, int& e) {
	if (empty(p))
	return 0;
	e = p.item[p.final];
	return 1;
}

//Saber si la Torre esta vacía
int empty(TodaPila p) {
	if (p.final == -1)
	return 1;
	return 0;
}

//Iniciar la pila
void iniciapila(TodaPila& p) {
	p.final = -1;
}

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

//Movimientos de la Torre de Hanoi
void TorreHanoi(int n, TodaPila& A, TodaPila& B, TodaPila& C, TodaPila* a, TodaPila* b, TodaPila* c) {
	int e;
	char aux, aux1;

	//Aquí se indica de cual Torre se sacan los discos
	if (a == &A)
	aux = 'A';
	else if (b == &A)
	aux = 'B';
	else if (c == &A)
	aux = 'C';

	if (a == &C)
	aux1 = 'A';
	else if (b == &C)
	aux1 = 'B';
	else if (c == &C)
	aux1 = 'C';
	

	//Recursividad de la Torre
	if (n == 1) {
		pop(A, e);
		//push(C, e);
		cout<<"\nDisco "<<n<<" se movio de la Torre "<<aux<<" a la Torre "<<aux1<<"";

	}
	else {
		TorreHanoi(n - 1, A, C, B, a, b, c);
		pop(A, e);
		//push(C, e);
		cout<<"\nDisco "<<n<<" se movio de la Torre "<<aux<<" a la Torre "<<aux1<<"";
		TorreHanoi(n - 1, B, A, C, a, b, c);
	}

}



//Mostrar los discos de la torre destino
void mostrar(TodaPila C) {
	int e;
	while (pop(C, e))
		cout<<""<<e<<"";
}
