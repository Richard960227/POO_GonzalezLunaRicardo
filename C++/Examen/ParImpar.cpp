#include<iostream>
#include <stdio.h>
#include <stdlib.h>

using namespace std;

int main()
{
    cout<<"  **  PAR O IMPAR  **\n\n";
    int num;
    
    cout<<"\n  Ingrese un numero:  ";
    cin>>num;
    if(num%2==0){
       	cout<<"  El numero es par\n";
    }else{
        cout<<"  El numero es impar\n";
    }
    return 0;
}
