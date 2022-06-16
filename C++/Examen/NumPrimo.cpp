#include <iostream>
#include<stdio.h>
#include<stdlib.h>

using namespace std;

int main() {
	
	cout<<"  **  NUMERO PRIMO  **\n\n";
	int divisor = 1, divisores = 0, num = 0;
	cout<<"Ingrese numero: ";
	cin>>num;
do{
	if(num % divisor == 0){
	divisores++;
}
	divisor++;
}while(divisor <= num);
	if(divisores == 2){
	cout<<"El numero "<<num<<" Es PRIMO.";
	}else{
		cout<<"El numero "<<num<<" NO es PRIMO.";
	}
	return 0;
}
