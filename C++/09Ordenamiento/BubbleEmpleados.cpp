

#include<iostream>
#include<conio.h>
#include<string.h>

#define MAX 50

struct Empleado{
	int codigo;
	char nombre[20];
	char apellido[20];
}emp[100];

struct ordenamiento{
	int dia, mes, elem;
};

using namespace std;

//metodos

void leerarray(int, struct ordenamiento[]);
void burbuja(int, struct ordenamiento[]);
void mostrar(int, struct ordenamiento[]);

int main(){
	int n;
	struct ordenamiento orden[MAX];
	
	cout<<"Ingresa el limite del arreglo: ";
	cin>>n;
	
	leerarray(n, orden);
	burbuja(n, orden);
	
	cout<<"\n El arreglo ordenado es: \n";
	
	mostrar(n, orden);
	
	getch();
}

void leerarray(int n, struct ordenamiento a[]){
	
	
	//ingresar los valores del arreglo
	for(int i=0; i<n; i++){
		fflush(stdin);
		cout<<"Nombre: ";
		cin.getline(emp[i].nombre,20,'\n');
		cout<<"Apellido: ";
		cin.getline(emp[i].apellido,20,'\n');
		cout<<"Fecha de Nacimiento";
		cout<<endl<<"Dia de Nacimiento: ";
		cin>>a[i].dia;
		cout<<"Mes de Nacimiento: ";
		cin>>a[i].mes;
		cout<<"Año de Nacimiento: ";
		cin>>a[i].elem;
		cout<<endl<<"Codigo de Empleado: ";
		cin>>emp[i].codigo;
		cout<<"\n";
	}
}

void burbuja(int n, struct ordenamiento a[]){
	int i, j;
	//aqui guardo los datos ordenados
	struct ordenamiento temp;
	
	//aplico burbuja
	for(i=1; i<n; i++){
		for(j=n-1; j>=i; j--){
			//realizo la comparacion
			if(a[j-1].elem>a[j].elem){
				//aqui hacemos el cambio de posiciones
				temp = a[j-1];
				a[j-1] = a[j];
				a[j] = temp;
			}
		}
	}
}

void mostrar(int n, struct ordenamiento a[]){
	//imprimir elemento por elemento
	for(int i = 0; i<n; i++){
		cout<<"__________________________________"<<endl;
		cout<<"|"<<endl;
		cout<<"| Nombre: "<<emp[i].nombre<<endl;
		cout<<"| Apellido: "<<emp[i].apellido<<endl;
		cout<<"| Fecha de Nacimiento:";
		cout<<a[i].dia<<"/";
		cout<<a[i].mes<<"/";
		cout<<a[i].elem<<endl;
		cout<<"| Codigo: "<<emp[i].codigo<<endl;
		cout<<"|_________________________________";
		cout<<endl;
	}
}
