/*
Vamos a crear un ejemplo de uina lista que puede contener un dato y manejo de apuntadores
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<iostream>
#include<wchar.h>
#include<locale.h>

/*conio es una libreria que da una extension tdio, como libreria standar, para el manejo de consola usando comandos, getch, clrscr(), gotoxy(), textcolor(), y otras

stdlib es una libreria standar para el manejo de funciones de busqueda, ordenamiento, arboles, pilas, colas, listas nos sirve para las estructuras de datos*/

using namespace std;

//Definimos las lista acorde a un Nodo , el Acceso, el Dato, el Apuntador y s

struct dato{//lista
	int i;
	dato *s;//siguiente
}*a, *i, *p, *e;

//meter los metodos de acceso a la lista

int buscar(int d);
void insertar(int dat);
void mostrar(void);
void borrar(void);
void menu(void);
void guardar(void);
void cargar(void);

main(){
	menu();
}

//menu
void menu(void){
	//vamos a hacer un menu de 6 opciones
	int opc, da;
	
	do{ //imprimer menu
	 cout<<"\n\t***Ejemplo Lista Completa que Carga Datos***\n";
	 cout<<"\n1. Insertar Datos";
	 cout<<"\n2. Buscar Datos";
	 cout<<"\n3. Mostrar Datos";
	 cout<<"\n4. Borrar Dato";
	 cout<<"\n5. Cargar Datos en Archivo";
	 cout<<"\n6. Guardar Datos en Archivo";
	 cout<<"\n7. Salir";
	 cout<<"\nOpcion:  ";
	 cin>>opc;
	 
	 //menu
	 switch(opc){
	 	case 1:
	 		//ingresar
	 		cout<<"\nIngresa Dato: ";
	 		cin>>da;
	 		insertar(da);
	 		//cout<<"\n¡Desea Ingresar Otro Dato?\n1.Si\n2.No";
		break;
		
		case 2:
	 		//buscar
	 		cout<<"\n\nIngresa Dato a Buscar: ";
	 		cin>>da;
	 		
	 		if(buscar(da)){
	 			cout<<"Dato Existe Wiii\n";
			 }else{
			 	cout<<"Dato Inexistente, solo juguito\n";
			 	getch();
			 }
	 	break;
	 	
	 	case 3:
	 		mostrar();
	 	break;
	 	
	 	case 4:
	 		borrar();
	 	break;
	 	
	 	case 5:
	 		cargar();
	 	break;
	 	
	 	case 6:
	 		guardar();
	 	break;
	 	
	 	case 7:
	 		cout<<"\n\nAyos UwU :3";
	 		getch();
	 		//borrar todos los datos de la lista
	 		p=i;
	 		while(p){
	 			a=p;
	 			p=p->s;
	 			delete(a);
			 }
			 exit(0);//se cierra
		default:
			cout<<"Aprenda a leer\n";
			getch();
		}
	}while(opc);
}

//insertar
void insertar(int dat){
	//si esta vacio
	if(!i){
		//Hay que crear un nuevo nodo
		//porque se ingresa por primera vez
		i = new(dato);
		i->s = NULL;
		i->i = dat;
		return;
	}
	//saber si existe o no el dato
	if(buscar(dat)){
		cout<<"\nEl Dato Existe llegale T-T";
		getch();
		return;
	}
	/*
	Imaginate que existen varios valores
	
	nodo 1 = 2, nodo 2 = 0, nodo 3 = 8
	
	insertar 4
	
	mientras creamos el nodo
	*/
	//Primero creamos el nodo
	e = new(dato);
	
	e->i=dat;
	
	
	if(p==i && p->s){
		if(p->i < e->i){
			//el ultimo dato
			p->s = e;
			e->s = NULL;
		}else{
			//En medio
			e->s = p;
			i=e;
		}
		return;
	}
	if(p->s){ e;
		a->s = e;
		e->s = p;
		return;
	}
	if(e->i > p->i){
		e->s = NULL;
		p->s = e;
	}else{
		a->s = e;
		e->s = p;
	}
}

//buscar
int buscar(int d){
	//si esta vacia
		if(!i){
		cout<<"No Hay Datos en la Lista";
		getch();
		return(0);
		}
	//cuando si hay datos
		p = i;//i es el dato
		a = NULL; // el inicio de la lista
		while(p->s && p->i < d){
			a=p;
			p=p->s; //Todo este algoritmo "desde a=p" pa recorrer
		}
		return(p->i==d?1:0); //? es un operador ternario (es como un if) devuelve verdadero o falso
}

//mostrar
void mostrar(void){
	int cont=1;
	
	if(!i){
		//no hay lista que mostrar
		cout<<"No Hay Lista que Mostrar\n";
		getch();
		return;
	}
	//si hay datos
	p=i;
	cout<<"\n\n";
	while(p){
		//como si existe la lista la recorremos
		cout<<"\nValor "<<cont++<<" = "<<p->i<<endl;
		p=p->s;
	}
	cout<<"\nFin de Lista\n";
	getch();
}

//borrar
void borrar(void){
	int da;
	cout<<"\nIngresa Dato a Eliminar: ";
	cin>>da;
	//dobo buscar dato
	if(buscar(da)){
		//si esta
		if(a){
			a->s=p->s;//asignar el nodo donde esta el dato
		}else{
			//que obtenga el valor del nodo
			i = p->s;
		}
		delete(p);
		cout<<"Dato Eliminado\n";
	}else{
		cout<<"\nDato No Encontrable Solo Juguito T-T\n";
		getch();
	}
}

//cargar
void cargar(void){
 int m,y;
 FILE *archivo;
 archivo=fopen("Lista.TXT","r");//El archivo se debe de poner en mayuscula
 if(!archivo){
 	cout<<"\n***El archivo no existe***\n";
 	
 	return;
 }
 
do {
 m=fscanf(archivo,"%i\n",&y);
 if(m!=EOF){ //end of file "fin de la fila"es para ver que ya no hay más información 
 insertar(y);
 }
 }
 while (m!=EOF);
 cout<<"\n***Se cargo el archivo***\n";
 fclose(archivo);
 
 }

//guardar
void guardar(void){
	FILE *archivo;
	archivo=fopen("Lista.txt","w");
	if(!i){
		cout<<"\n***No Hay Lista que Guardar***\n";
		return;
	}
	p=i;
	while(p){
		fprintf(archivo,"%i\n", p->i);
		p=p->s;
	}
	cout<<"\n***Se Guardo Archivo***\n";
	fclose(archivo);
}




