//Matriz Traspuesta

#include<iostream>
#include<stdio.h>
#define MAX 10

using namespace std;

int main(){
	
	int col, fila;
	
	cout<<"Ingresa Numero de Columnas: \n";
	cin>>col;
	
	cout<<"Ingresa Numero de Filas: \n";
	cin>>fila;
	
	int matriz[col][fila];
	
	for(int i=0;i<fila;i++){
		for(int j=0;j<col;j++){
			cout<<"Ingrese un Numero ["<<i<<"]["<<j<<"]: ";
			cin>>matriz[i][j];
		}
	}
	
	cout<<"\nMatriz Original\n";
	for(int i=0;i<fila;i++){
		for(int j=0;j<col;j++){
			cout<<" "<<matriz[i][j];
		}
		cout<<"\n";
	}
	
	cout<<"\nMatriz Traspuesta\n";
	for(int i=0;i<col;i++){
		for(int j=0;j<fila;j++){
			cout<<" "<<matriz[j][i];
		}
		cout<<"\n";
	}
	
	return 0;
}
