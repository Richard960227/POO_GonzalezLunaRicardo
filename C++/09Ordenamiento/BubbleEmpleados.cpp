

#include<iostream>
#include<conio.h>
#include<string.h>
#include<fstream>

#define MAX 50


struct ordenamiento{
	int dia, mes, elem, codigo;
	char nombre[20];
	char apellido[20];
};

using namespace std;

//metodos

void leerarray(int, struct ordenamiento[]);
void burbuja(int, struct ordenamiento[]);
void mostrar(int, struct ordenamiento[]);
void mostrarD(int, struct ordenamiento[]);

int main(){
	int n, opcion;
	struct ordenamiento orden[MAX];
	
	do{
		system("cls");
		cout<<"\n\t__________________________________";
		cout<<"\n\t|";
		cout<<"\n\t| BUBBLE SORT EMPLEADOS ";
		cout<<"\n\t|";
		cout<<"\n\t| 1. Ingresar Empleados\n";
		cout<<"\n\t| 2. Empleados en Orden Ascedente\n";
		cout<<"\n\t| 3. Empleados en Orden Descendente\n";
		cout<<"\n\t| 4. Salir\n";
		cout<<"\n\t| Opcion:.  \n";
		cin>>opcion;
		
		switch(opcion){
			case 1:
				system("cls");
				cout<<"\n\t| Ingresa el Limite de Empleados: ";
				cin>>n;
				
				leerarray(n, orden);
				burbuja(n, orden);
			break;
			case 2:
				system("cls");
				cout<<"\n\t| Empleados en Orden Ascedente: \n";
				mostrar(n, orden);
			break;
			case 3:
				system("cls");
				cout<<"\n\t| Empleados en Orden Descendente: \n";
				mostrarD(n, orden);
			break;
		}
	}while(opcion != 3);
	
	getch();
}

void leerarray(int n, struct ordenamiento a[]){
	
	ofstream Guardar;
	ifstream Leer;
	
	Guardar.open ("Empleados.txt",ios::app);
    Leer.open ("Empleados.txt");
    
	//ingresar los valores del arreglo
	for(int i=0; i<n; i++){
		if(Leer.is_open()){
			fflush(stdin);
			cout<<"\t|\n\t| Nombre: ";
			cin.getline(a[i].nombre,20,'\n');
			cout<<"\t| Apellido: ";
			cin.getline(a[i].apellido,20,'\n');
			cout<<"\t| Fecha de Nacimiento";
			cout<<endl<<"\t| Dia de Nacimiento: ";
			cin>>a[i].dia;
			cout<<"\t| Mes de Nacimiento: ";
			cin>>a[i].mes;
			cout<<"\t| Año de Nacimiento: ";
			cin>>a[i].elem;
			cout<<"\t| Codigo de Empleado: ";
			cin>>a[i].codigo;
			cout<<endl;
			
			Guardar<<a[i].nombre<<" "<<a[i].apellido<<" "<<a[i].dia<<" "<<a[i].mes<<" "<<a[i].elem<<" "<<a[i].codigo<<endl;
		}else{
			cout<<"\n\t*** Error en Archivo***\n";
		}
	}
}

void burbuja(int n, struct ordenamiento a[]){
	int i, j;
	ifstream Leer;
	Leer.open("Empleados.txt");
	
	//aqui guardo los datos ordenados
	struct ordenamiento temp;
	
	while(Leer>>a[i].nombre>>a[i].apellido>>a[i].dia>>a[i].mes>>a[i].elem>>a[i].codigo){
		
		
		
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
	Leer.close();
	
}

void mostrar(int n, struct ordenamiento a[]){
	ofstream Guardar;
	ifstream Leer;
	
	Guardar.open ("EmpleadosOrdenadosA.txt",ios::app);
    Leer.open ("EmpleadosOrdenadosA.txt");
	//imprimir elemento por elemento
	for(int i = 0; i<n; i++){
		if(Leer.is_open()){
		cout<<"__________________________________"<<endl;
		cout<<"|"<<endl;
		cout<<"| Nombre: "<<a[i].nombre<<endl;
		cout<<"| Apellido: "<<a[i].apellido<<endl;
		cout<<"| Fecha de Nacimiento:";
		cout<<a[i].dia<<"/";
		cout<<a[i].mes<<"/";
		cout<<a[i].elem<<endl;
		cout<<"| Codigo: "<<a[i].codigo<<endl;
		cout<<"|_________________________________";
		cout<<endl;
		
		Guardar<<a[i].nombre<<" "<<a[i].apellido<<" "<<a[i].dia<<" "<<a[i].mes<<" "<<a[i].elem<<" "<<a[i].codigo<<endl;
		}else{
			cout<<"\n\t*** Error en Archivo***\n";
		}
	}
	getch();
}

void mostrarD(int n, struct ordenamiento a[]){
	ofstream Guardar;
	ifstream Leer;
	
	Guardar.open ("EmpleadosOrdenadosD.txt",ios::app);
    Leer.open ("EmpleadosOrdenadosD.txt");
	//imprimir elemento por elemento
	for(int i = n-1; i>=0; i--){
		if(Leer.is_open()){
		cout<<"__________________________________"<<endl;
		cout<<"|"<<endl;
		cout<<"| Nombre: "<<a[i].nombre<<endl;
		cout<<"| Apellido: "<<a[i].apellido<<endl;
		cout<<"| Fecha de Nacimiento:";
		cout<<a[i].dia<<"/";
		cout<<a[i].mes<<"/";
		cout<<a[i].elem<<endl;
		cout<<"| Codigo: "<<a[i].codigo<<endl;
		cout<<"|_________________________________";
		cout<<endl;
		
		Guardar<<a[i].nombre<<" "<<a[i].apellido<<" "<<a[i].dia<<" "<<a[i].mes<<" "<<a[i].elem<<" "<<a[i].codigo<<endl;
		}else{
			cout<<"\n\t*** Error en Archivo***\n";
		}
	}
	getch();
}
