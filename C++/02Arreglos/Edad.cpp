#include<iostream>

using namespace std;

int main(){
	
	int diaN, mesN, anioN, diaA, mesA, anioA, edad;
	
	cout<<"\n\tIngresa tu Fecha de Nacimiento: \n";
	cout<<"Dia: ";cin>>diaN; cout<<"Mes: ";cin>>mesN; cout<<"Año: ";cin>>anioN;
	
	cout<<"\n\tIngresa Fecha Actual: \n";
	cout<<"Dia: "; cin>>diaA; cout<<"Mes: "; cin>>mesA; cout<<"Año: "; cin>>anioA;
	
	if(mesN<mesA){
		edad=anioA-anioN;
	}else if(mesN==mesA){
		if(diaN<=diaA){
			edad=anioA-anioN;
		}else{
			edad=(anioA-anioN)-1;
		}
	}else if(mesN>mesA){
		edad=(anioA-anioN)-1;
	}
	
	cout<<"\n\tTu Edad es: "<<edad<<endl;
	
	return 0;
}
