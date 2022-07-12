/*
Ejemplo de una cola de matriculación de estudiante
*/

#include<wchar.h>
#include<locale.h>
#include<fstream>
#include<iostream>
#include<conio.h>
#include<stdlib.h>

using namespace std;

//estructura de la cola

struct ICO{
	int clave;
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
void buscarDatos(Nodo *, ICO);
void modificarDato(Nodo *, ICO);
void eliminarDatos(Nodo *&, Nodo *&, ICO);
void cargarDatos();
bool c_vacia(Nodo *);

int main(){
	//vamos a crear y colocar los apuntadores
	ICO alumnos;
	Nodo *frente = NULL;
	Nodo *fin = NULL;
	char opcion;
	setlocale(LC_ALL,"");
	
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
				if(aux != NULL){
					cout<<endl<<"|----------------------------|";
					cout<<endl<<"|Clave"<<"\t|Nombre"<<"\t|Calificación|\n";
					while (aux!=NULL){
						cout<<"|"<<aux->alumnos.clave<<"\t|"<<aux->alumnos.nombre<<"\t|"<<aux->alumnos.calificacion<<""<<endl;
						aux = aux->siguiente;
					}
				}else{
					cout<<"\n\t***Sin Registros***\n";
				}
			break;
			
			case '3':
				if(aux == NULL){
					cout<<"\n\t***Sin Registros***\n";
				}else{
					cout<<"\n\tBuscar Alumno\n";
					buscarDatos(frente, alumnos);
				}
			break;

			case '4':
				if(aux == NULL){
					cout<<"\n\t***Sin Registros***\n";
				}else{
					cout<<"\n\tActualizar Alumno\n";
					modificarDato(frente, alumnos);
				}
			break;
			
			case '5':
				if(aux == NULL){
					cout<<"\n\t***Sin Registros***\n";
				}else{
					eliminarDatos(frente, fin, alumnos);
					cout<<"\n\tAlumno Eliminado\n";	
				}
			break;
			
			case '6':
				cargarDatos();
	 		break;
						
			case '7':
				cout<<"\n\tAyos nwn/ \n";
			break;
			
			default:
				cout<<"\n\tOpción Invalida T-T\n";
				break;
		}
		cout<<"\n\tPushale una tecla pa' continuar\n";
		getch();
		system("cls");
	}while(opcion != '7');
	return 0;
}

void menu(){
	cout<<endl<<"\t____________________________________";
	cout<<endl<<"\t|                                  |";
	cout<<endl<<"\t|     ***Datos del Alumno***       |";
	cout<<endl<<"\t|__________________________________|";
	cout<<endl<<"\t|                |                 |";
	cout<<endl<<"\t| 1. Agregar     | 5.Eliminar      |";
	cout<<endl<<"\t| 2. Mostrar     | 6.Cargar        |";
	cout<<endl<<"\t| 3. Buscar      | 7.Salir         |";
	cout<<endl<<"\t| 4. Actualizar  |                 |";
	cout<<endl<<"\t|________________|_________________|";
	cout<<endl<<"\t|Opción: ";
}

void agregarDatos(ICO &alumnos){
	
	ofstream foutput;
	ifstream finput;
	
	foutput.open ("Calificaciones.txt",ios::app);
    finput.open ("Calificaciones.txt");
	
	if(finput.is_open()){
		cout<<"\n\tIngresa Nombre del Alumno: ";
		cin.getline(alumnos.nombre, 30, '\n');
		foutput<<endl<<"\n\t--------------------------------------------";
		foutput<<endl<<"\n\t| Nombre: "<< alumnos.nombre;
	
		cout<<"\n\tIngresa Matricula del Alumno: ";
		cin>>alumnos.clave;
		cout<<endl;
		foutput<<"\n\t | Matricula: " << alumnos.clave;
	
		cout<<"\n\tIngresa Calificación del Alumno: ";
		cin>>alumnos.calificacion;
		foutput<<"\n\t | Calificación: " << alumnos.calificacion;
		
		cout<<"\n\tDatos ingresados correctamente";
    	finput.close();
    	foutput.close();
	}else{
		cout<<"\n\t***Error en Archivo***";
	}
}

void insertarDatos(Nodo *&frente, Nodo *&fin, ICO alumnos){
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

void eliminarDatos(Nodo *&frente, Nodo *&fin, ICO alumnos){
	alumnos = frente->alumnos;
	Nodo *aux = frente;
	
	if(frente == fin){
		frente = NULL;
		fin = NULL;
	}else{
		frente = frente -> siguiente;
	}
	
	delete aux;
}

void buscarDatos(Nodo *frente, ICO alumnos){
	
	bool band = false;
	
	Nodo *actual = new Nodo();
	actual = frente;
	
	cout<<"\n\tIngrese Matricula del Alumno: ";
	cin>>alumnos.clave;
	
		while((actual != NULL) && (actual->alumnos.clave <=alumnos.clave)){
		if(actual->alumnos.clave == alumnos.clave){
			cout<<"\n\tAlumno con Matricula ("<<actual->alumnos.clave<<"); Nombre ("<<actual->alumnos.nombre<<"); Calificación ("<<actual->alumnos.calificacion<<")Si a sido encontrado en Registros\n";
		band = true;
		}
		actual = actual->siguiente;
	}
	if(band == true){
		
	}else{
	cout<<"\n\tAlumno con Matricula ("<<actual->alumnos.clave<<") No a sido endontrado en Registros\n";
	}
}

void modificarDato(Nodo *frente, ICO alumnos){
	
	bool band = false;
	
	Nodo* actual = new Nodo();
	actual = frente;
	
	cout<<"\n\tIngresa Matricula del Alumno: ";
	cin>>alumnos.clave;
		
		while(actual!=NULL && band != true){
			
				if(actual->alumnos.clave == alumnos.clave){
					cout << "\n\tAlumno Encontrado";
					cout << "\n\tMatricula del Alumno: " << actual->alumnos.clave;
					cout << "\n\tIngrese Nueva Matricula para este Alumno: ";
					cin >> actual -> alumnos.clave;
				
					cout << "\n\tNombre del Alumno: "<< actual->alumnos.nombre;
					cout << "\n\tIngrese Nuevo Nombre para este Alumno: ";
					cin >> actual -> alumnos.nombre;
				
					cout << "\n\tCalificación del Alumno: "<< actual->alumnos.calificacion;
					cout << "\n\tIngrese Nueva Calificación para este Alumno: ";
					cin >> actual -> alumnos.calificacion;
				
					cout << "\n\tAlumno Modificado\n\n";
					band = true;
			}
			
			actual = actual->siguiente;
		}
		if(!band){
			cout << "\n\tAlumno No Encontrado\n\n";
		}		
}

void cargarDatos(){
	ifstream archivo;
	string registro;
	
	archivo.open("Calificaciones.txt", ios::in);
	if(archivo.fail()){
		cout<<"\n\t***No se pudo abrir***";		
	}
	while(getline(archivo, registro)){
		cout<<registro<<endl;
	}
	
	archivo.close();
	system("pause");
}

bool c_vacia(Nodo *frente){
	//Operador Ternario para saber si esta vacia
	return(frente == NULL)? true:false;
}
