/*
Ejemplo de una cola de matriculación de estudiante
*/

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
void buscarDatos(Nodo *&, ICO);
void modificarDato(Nodo *, ICO);
//void guardarDatos();
void eliminarDatos(Nodo *&, Nodo *&, ICO);
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
				if(aux != NULL){
					cout<<endl<<"|----------------------------|";
					cout<<endl<<"|Clave"<<"\t|Nombre"<<"\t|Calificacion|\n";
					while (aux!=NULL){
						cout<<"|"<<aux->alumnos.clave<<"\t|"<<aux->alumnos.nombre<<"\t|"<<aux->alumnos.calificacion<<""<<endl;
						aux = aux->siguiente;
					}
				}else{
					cout<<"\n\t***Sin Registros***\n";
				}
			break;
			
			case '3':
				cout<<"\n\tBuscar Alumno\n";
				buscarDatos(frente, alumnos);
			break;

			case '4':
				cout<<"\n\tActualizar Alumno\n";
				modificarDato(frente, alumnos);
			break;
			
			case '5':
				if(fin == NULL){
					cout<<"\n\t***Sin Registros***\n";
				}else{
					eliminarDatos(frente, fin, alumnos);
					cout<<"\n\tAlumno Eliminado\n";	
				}
			break;
			
			case '6':
				
	 		break;
	 	
	 		case '7':
	 			
	 		break;
						
			case '8':
				cout<<"\n\tAyos nwn/ \n";
			break;
			
			default:
				cout<<"\n\tOpcion Invalida T-T\n";
				break;
		}
		cout<<"\n\tPushale una tecla pa continuar\n";
		getch();
		system("cls");
	}while(opcion != '8');
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
	cout<<endl<<"\t| 3. Buscar      | 7.Guardar       |";
	cout<<endl<<"\t| 4. Actualizar  | 8.Salir         |";
	cout<<endl<<"\t|________________|_________________|";
	cout<<endl<<"\t|Opcion: ";
}

void agregarDatos(ICO &alumnos){
	
	cout<<"\n\tIngresa Nombre del Alumno: ";
	cin.getline(alumnos.nombre, 30, '\n');
	
	cout<<"\n\tIngresa Clave del Alumno: ";
	cin>>alumnos.clave;
	cout<<endl;
	
	cout<<"\tIngresa Calificacion del Alumno: ";
	cin>>alumnos.calificacion;
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

void buscarDatos(Nodo *&frente, ICO alumnos){
	Nodo* actual = new Nodo();
	bool encontrado = false;
	int nodoBuscado = 0;
	cout << "\n\tIngresa Clave del Alumno: ";
	cin >> nodoBuscado;
	if(frente != NULL){
		while(actual!=NULL && encontrado != true){
			
			if(actual->alumnos.clave == nodoBuscado){
				cout<< "\n\tAlumno "<<alumnos.nombre<<" con Clave "<<nodoBuscado<<" con Calificación "<<alumnos.calificacion;
				cout<<endl;
				encontrado = true;
			}
			
			actual = actual->siguiente;
		}
		if(!encontrado){
			cout << "\n\tAlumno No Encontrado";
		}
	}else{
		cout << endl << "\n\tLa cola se encuentra Vacia " << endl << endl;
	}	
}

void modificarDato(Nodo *frente, ICO alumnos){
	Nodo* actual = new Nodo();
	actual = frente;
	bool encontrado = false;
	int nodoBuscado = 0;
	cout << "\n\tIngrese Clave del Alumno para Modificar: ";
	cin >> nodoBuscado;
	if(frente != NULL){
		while(actual!=NULL && encontrado != true){
			
			if(actual->alumnos.clave == nodoBuscado){
				cout << "\n\tAlumno con Clave ( " << nodoBuscado << " ) Encontrado";
				cout << "\n\tIngrese Nueva Clave para este Alumno: ";
				cin >> actual -> alumnos.clave;
				cout << "\n\tAlumno Modificado\n\n";
				encontrado = true;
			}
			
			actual = actual->siguiente;
		}
		if(!encontrado){
			cout << "\n\tAlumno No Encontrado\n\n";
		}
	}else{
		cout << endl << "\n\tSin Registros" << endl;
	}		
}

void guardar(ICO *&alumnos, int aux){
	
		//primero crear el archivo
		FILE *archivo;
		archivo = fopen("Calificaciones.txt","w");//aqui va el nombre
		//se le conoce como la serializacion del archivo
		if(!aux){
			cout<<"No hay nada que guardar";
			return;
		}
		p = aux->alumnos;
		while(p){
			fprintf(archivo, "%i\n", p->i) //%i enteros %c caracter
			p = p->siguiente;
		}
	cout<<"Archivo Guardado";
	//es importante crrar el flujo del archivo
	fclose(archivo);
	getchar();
}

bool c_vacia(Nodo *frente){
	//Operador Ternario para saber si esta vacia
	return(frente == NULL)? true:false;
}
