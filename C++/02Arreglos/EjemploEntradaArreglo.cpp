#include<iostream>

using namespace std;

int main(){
	/*
	Ejemplo de Arreglo Introducir Datos
	*/
	
	float vector1[3];
	float vector2[3];
	float vectorSuma[3];
	
	int i = 0;
	
	//Introducir Elementos del Primer Vector
	
	for (i = 0; i < 3; i++){
		cout<<"\nIntroduce el 1er Componente "<<i<<" del 1er Vector\n";
		cin>>vector1[i];
	}
	for (i = 0; i < 3; i++){
		cout<<"\nIntroduce el 2do Componente "<<i<<" del 2do Vector\n";
		cin>>vector2[i];
	}
	for (i = 0; i < 3; i++){
		vectorSuma[i] = vector1[i] + vector2[i];
		cout<<"\nLa suma de los Vectores es: \n";
	}
	for (i = 0; i < 3; i++){
		cout<<vectorSuma[i]<< " "; 
	}
		
	return 0;
}
