/*
Ejemplo de Ordenamiento por seleccion directa
*/

#include <stdio.h>
#include <iostream>

using namespace std;

int main(){
	
	//declaramos un arreglo de n dimensiones para que lo cambien
	int vector[]={4,3,1,5,2};
	int tamano=sizeof vector/sizeof vector[0];
	cout<<"\n\tTienes "<<tamano<<" numeros en el vector: "<<endl<<"\t";
	int i, j, aux, min;
	
	for(int i=0; i<tamano; i++){
		cout<<" ["<<vector[i]<<"] ";
	}
	
	cout<<endl;
	
	//necesitamos recorrer el vector
	for(int i=0; i<tamano; i++){
			min=i;
			
		for(j=i+1; j<tamano; j++){
			if(vector[j] < vector[min]){
				min=j;
			}
			
		}
		
		cout<<"\n\tActual Recorre el Arreglo";
		cout<<endl<<"\t1. Posicion Actual en el Elemento ["<<vector[i]<<"]";
		cout<<endl<<"\t2. Recorremos el Arreglo Buscando el Minimo Elemento ["<<vector[min]<<"]";
		cout<<endl<<"\t3. Intercambiamos con el Actual";
		cout<<endl<<endl<<"\t";
		for(int i=0; i<tamano; i++){
			cout<<" ["<<vector[i]<<"] ";
		}
		
		cout<<endl;
		
		aux=vector[i];
		
		//intercambio
		vector[i]=vector[min];
		vector[min]=aux;
		
	}
	
	//imprimir
	cout<<"\n\tOrden Ascendente: ";
	for(i=0; i<tamano; i++){
		cout<<"["<<vector[i]<<"] ";
	}
	cout<<"\n\tOrden Descendente: ";
	for(i=tamano-1; i>=0; i--){
		cout<<"["<<vector[i]<<"] ";
	}
	return 0;
}
