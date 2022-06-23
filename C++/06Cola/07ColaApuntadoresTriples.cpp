/*
Ejemplo de una cola de matriculación de estudiante
*/

#include<iostream>
#include<conio.h>
#include<stdlib.h>

using namespace std;

//estructura de la cola

struct ICO{
	char clave[20];
	char nombre[30];
	float calificacion;
};

struct Nodo{
	ICO alumnos;
	Nodo *siguiente;
};

//metodos
void menu();
void agregarDatos(ICO &);
void insertarDatos(Nodo *&, Nodo *&, ICO);
bool c_vacia(Nodo *);

int main(){
	//vamos a crear y colocar los apuntadores
	ICO alumnos;
	Nodo *frente = NULL;
	Nodo *fin = NULL;
	char opcion;
	
	do{
		menu();
		cin>>opcion;
		fflush(stdin);
		
		Nodo *aux = frente;
		
		switch(opcion){
			case '1':
				agregarDatos(alumnos);
				insertarDatos(frente, fin, alumnos);
			break;
			
			case '2':
				cout<<"\n\tCLAVE: "<<"\tNombre"<<"\tCalificacion\n";
				while (aux!=NULL){
					cout<<aux->alumnos.clave<<"\t"<<aux->alumnos.nombre<<"\t"<<aux->alumnos.calificacion<<endl;
					aux = aux->siguiente;
				}
			break;
			
			case '3':
				cout<<"\n\tAyos nwn/ \n";
			break;
			
			default:
				cout<<"\n\tOpcion Invalida T-T\n";
				break;
		}
		getch();
		cout<<"\n\tPushale una tecla pa continuar\n";
		system("cls");
	}while(opcion != '3');
	return 0;
}

void menu(){
	cout<<"\n\tMenu\n";
	cout<<"\t1. Agregar Datos del Alumno\n";
	cout<<"\t2. Mostrar Datos del Alumno\n";
	cout<<"\t3. Salir\n";
}

void agregarDatos(ICO &alumnos){
	
	cout<<"\n\tIngresa Clave del Alumno: ";
	cin.getline(alumnos.clave, 20, '\n');
	
	cout<<"\n\tIngresa Nombre del Alumno: ";
	cin.getline(alumnos.nombre, 30, '\n');
	
	cout<<"\n\tIngresa Calificacion del Alumno: ";
	cin>>alumnos.calificacion;
}

void insertarDatos(Nodo *frente, Nodo *fin, ICO alumnos){
	//Declaro mi nuevo nodo
	Nodo *n_nodo = new Nodo();
	
	//Asignar los valores de los datos
	n_nodo -> alumnos = alumnos;
	
	//siguiente apunte a null
	n_nodo -> siguiente = NULL;
	
	//Primero verificar si esta vacia
	if(c_vacia(frente)){
		frente = n_nodo;
		//si la cola esta vacia frente = nuevo nodo
	}else{
		fin -> siguiente = n_nodo;//si la cola esta vacia
	}
	fin = n_nodo;
}

bool c_vacia(Nodo *frente){
	//Operador Ternario para saber si esta vacia
	return(frente == NULL)? true:false;
}
