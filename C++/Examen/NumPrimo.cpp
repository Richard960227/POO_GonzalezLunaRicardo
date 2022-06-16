#include <iostream>
#include<stdio.h>
#include<stdlib.h>

bool primo(int n){
	bool condicion;
	if(n != 1 && n!= 0){
		for(int i = 2; i <=n; i++){
			if(n % i == 0){
				if(n == i){
					condicion = true;
				}else{
					condicion = false;
					return condicion;
				}
			}
		}
	}else{
		condicion = false;
	}
	return condicion;
}

using namespace std;

int main() {
	cout<<"  **  NUMERO PRIMO  **\n\n";

	int op, divisor = 1, divisores = 0, num = 0, n;
	
	do{
		cout<<"\n  Elige una Opción:  \n";
		cout<<"\n  1. Saber si es Primo o No Primo.  \n";
		cout<<"\n  2. Imprimir los Primeros Primos  \n";
		cout<<"\n  3.Salir  \n";
		cout<<"\n  Opcion: ";
		cin>>op;
		
		switch (op){
			case 1:
				cout<<"\nHasta que numero quieres buscar: ";
				cin>>n;
				
				for(int i = 1; i <= n; i++){
				if(primo(i)){
					cout<<i<<endl;
					} 
				}
			break;
			
			case 2:	
				cout<<"\nIngrese numero: ";
				cin>>num;
				
				do{
				if(num % divisor == 0){
				divisores++;
				}
				divisor++;
				}while(divisor <= num);
					if(divisores == 2){
						cout<<"\nEl numero "<<num<<" Es PRIMO.";
					}else{
						cout<<"\nEl numero "<<num<<" NO es PRIMO.";
					}
			break;
			
			default: 
				cout<<"\nHasta Luego";
		}
			
		
	}while(op!=3);
	return 0;		
}
	
