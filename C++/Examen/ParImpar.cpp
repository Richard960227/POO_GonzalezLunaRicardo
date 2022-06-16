#include<iostream>
#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
 
using namespace std;

int main()
{
    cout<<"  **  PAR O IMPAR  **\n\n";
    int num, opc;
    
    	
    while(opc>=2){
    	cout<<"\n  Deseas Ingresar Un Numero\n 1.Si\n 2.No\n";
    cin>>opc;
    	cout<<"\n  Ingrese un numero:  ";
    	cin>>num;
    		if(num%2==0){
        	cout<<"  El numero es par\n";
    		}else{
        		cout<<"  El numero es impar\n";
    		}
	}
	
    getch();
    return 0;
}
