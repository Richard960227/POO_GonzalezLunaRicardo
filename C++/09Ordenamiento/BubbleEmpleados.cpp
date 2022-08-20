
#include <wchar.h>
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
void guardarOrdenA(int, struct ordenamiento[]);
void mostrarA(int, struct ordenamiento[]);
void guardarOrdenD(int, struct ordenamiento[]);
void mostrarD(int, struct ordenamiento[]);

int main(){
	setlocale(LC_ALL, "");
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
				while(n<1 || n>MAX){
					cout<<"\n\t| Ingresa el Limite de Empleados: ";
					cin>>n;
					if(n<1 || n>MAX){
						cin.clear();
						cin.ignore(1000, '\n');
						cout<<"\033[K\033[A"<<"\033[K\033[A";
					}
				}
				
				
				leerarray(n, orden);
				burbuja(n, orden);
				guardarOrdenA(n, orden);
				guardarOrdenD(n, orden);
			break;
			case 2:
				system("cls");
				cout<<"\n\t| Empleados en Orden Ascedente: \n";
				mostrarA(n, orden);
			break;
			case 3:
				system("cls");
				cout<<"\n\t| Empleados en Orden Descendente: \n";
				mostrarD(n, orden);
			break;
			default:
				cout<<"\n\t***Opción Invalida***";
			break;
		}
	}while(opcion != 4);
	
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
			cout<<"\t|\n\t| Fecha de Nacimiento\n";
			
			while(a[i].elem<1800 || a[i].elem>2022){
				cout<<"\t|\n\t| Año de Nacimiento: ";
				cin>>a[i].elem;
				if(a[i].elem<1 || a[i].elem>12){
					cin.clear();
					cin.ignore(1000, '\n');
					cout<<"\033[K\033[A"<<"\033[K\033[A";
				}
			}
			
			while(a[i].mes<1 || a[i].mes>12){
				cout<<"\n\t| Mes de Nacimiento: ";
				cin>>a[i].mes;
				if(a[i].mes<1 || a[i].mes>12){
					cin.clear();
					cin.ignore(1000, '\n');
					cout<<"\033[K\033[A"<<"\033[K\033[A";
				}	
			}
			
			if(a[i].mes==1 || a[i].mes==3 || a[i].mes==5 || a[i].mes==7 || a[i].mes==8 || a[i].mes==10 || a[i].mes==12){
				//condicional de 31 dias
					while(a[i].dia<1 || a[i].dia>31){
						cout<<endl<<"\t| Día de Nacimiento: ";
						cin>>a[i].dia;
						if(a[i].dia<1 || a[i].dia>31){
							cin.clear();
							cin.ignore(1000, '\n');
							cout<<"\033[K\033[A"<<"\033[K\033[A";
						}
					}
				}else if(a[i].mes==2){
						//febrero tiene 28 y 29 si es bisiesto
						while(a[i].dia<1 || a[i].dia>28){
							
							if(a[i].elem % 4 != 0 || (a[i].elem % 100 == 0 && a[i].elem % 400 != 0)){
								
								cout<<endl<<"\t| (No Bisiesto) Día de Nacimiento: ";
								cin>>a[i].dia;
								if(a[i].dia<1 || a[i].dia>28){
								cin.clear();
								cin.ignore(1000, '\n');
								cout<<"\033[K\033[A"<<"\033[K\033[A";
								}
							}else{
								cout<<endl<<"\t| (Bisiesto) Día de Nacimiento: ";
								cin>>a[i].dia;
								if(a[i].dia<1 || a[i].dia>29){
									cin.clear();
									cin.ignore(1000, '\n');
									cout<<"\033[K\033[A"<<"\033[K\033[A";
								}
							}
							
						}
				}else if(a[i].mes==4 || a[i].mes==6 || a[i].mes==9 || a[i].mes==11){
						//condicional de 30 dias
					while(a[i].dia<1 || a[i].dia>30){
						cout<<endl<<"\t| Día de Nacimiento: ";
						cin>>a[i].dia;
						if(a[i].dia<1 || a[i].dia>30){
							cin.clear();
							cin.ignore(1000, '\n');
							cout<<"\033[K\033[A"<<"\033[K\033[A";
						}
					}
				}
				
			cout<<"\t|\n\t| Código de Empleado: ";
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
		
		for(i=1; i<n; i++){
			for(j=n-1; j>=i; j--){
				//realizo la comparacion
				if(a[j-1].dia>a[j].dia){
					//aqui hacemos el cambio de posiciones
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(i=1; i<n; i++){
			for(j=n-1; j>=i; j--){
				//realizo la comparacion
				if(a[j-1].mes>a[j].mes){
					//aqui hacemos el cambio de posiciones
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		
		
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

void guardarOrdenA(int n, struct ordenamiento a[]){
	ofstream Guardar;
	ifstream Leer;
	
	Guardar.open ("EmpleadosOrdenadosA.txt",ios::app);
    Leer.open ("EmpleadosOrdenadosA.txt");
	//imprimir elemento por elemento
	for(int i = 0; i<n; i++){
		if(Leer.is_open()){
		Guardar<<a[i].nombre<<" "<<a[i].apellido<<" "<<a[i].dia<<" "<<a[i].mes<<" "<<a[i].elem<<" "<<a[i].codigo<<endl;
		}else{
			cout<<"\n\t*** Error en Archivo***\n";
		}
	}
	getch();
}

void mostrarA(int n, struct ordenamiento a[]){
	
	int i;
	ifstream Leer;
	
    Leer.open ("EmpleadosOrdenadosA.txt");
	while(Leer>>a[i].nombre>>a[i].apellido>>a[i].dia>>a[i].mes>>a[i].elem>>a[i].codigo){
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
	}
	Leer.close();
	getch();
}

void guardarOrdenD(int n, struct ordenamiento a[]){
	ofstream Guardar;
	ifstream Leer;
	
	Guardar.open ("EmpleadosOrdenadosD.txt",ios::app);
    Leer.open ("EmpleadosOrdenadosD.txt");
	//imprimir elemento por elemento
	for(int i = n-1; i>=0; i--){
		if(Leer.is_open()){
		Guardar<<a[i].nombre<<" "<<a[i].apellido<<" "<<a[i].dia<<" "<<a[i].mes<<" "<<a[i].elem<<" "<<a[i].codigo<<endl;
		}else{
			cout<<"\n\t*** Error en Archivo***\n";
		}
	}
	getch();
}

void mostrarD(int n, struct ordenamiento a[]){
	
	int i;
	ifstream Leer;
	
    Leer.open ("EmpleadosOrdenadosD.txt");
	while(Leer>>a[i].nombre>>a[i].apellido>>a[i].dia>>a[i].mes>>a[i].elem>>a[i].codigo){
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
	}
	Leer.close();
	getch();
}
