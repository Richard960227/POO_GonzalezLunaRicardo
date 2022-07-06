/*
vamos a jugar con arreglos
*/

#include<iostream>

using namespace std;

int main(){
	
	int numero[5] = {200, 150, 100, -50, 300}; //un array de 5 numeros
	int suma = 0, i;
	
	//inicializamos los valores del arreglo
	/*
	numero[0] = 200;
	numero[1] = 150;
	numero[2] = 100;
	numero[3] = 50;
	numero[4] = 300;
	*/
	
	//hallar la suma de los elementos del arreglo
	
	//suma = numero[0] + numero[1] + numero[2] + numero[3] + numero[4]; //ineficiente
	
	//iterador o ciclo
	for (i=0; i <= 4; i++){
		suma += numero[i];
		cout<<" Dato \n\n"<<suma;
	}
	
	cout<<"\nLa Suma es: "<<suma<<endl;
	
	
	return 0;
}
