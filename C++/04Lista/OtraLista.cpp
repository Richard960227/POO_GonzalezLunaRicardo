/*
Vamos a crear un ejemplo de uina lista que puede contener un dato y manejo de apuntadores
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<iostream>

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

//void guardar(void);
//void cargar(void);

main(){
	menu();
}

void menu(void){
	//vamos a hacer un menu de 6 opciones
	int opc, da;
	
	do{ //imprimer menu
	 cout<<"Ejemplo Lista Completa que Carga Datos";
	 cout<<"\n1. Buscar Datos";
	 cout<<"\n2. Insertar Datos";
	 cout<<"\n3. Mostrar Datos";
	 cout<<"\n4. Borrar Dato ";
	 cout<<"\n5. Guardar Datos en Archivo";
	 cout<<"\n6. Cargar Datos en Archivo";
	 cout<<"\n7. Salir";
	 cout<<"\nOpcion:  ";
	 cin>>opc;
	 
	 //menu
	 switch(opc){
	 	case 1:
	 		//buscar
	 		cout<<"\n\nIngresa Dato a Buscar";
	 		cin>>da;
	 		
	 		if(buscar(da)){
	 			cout<<"Dato Existe Wiii";
			 }else{
			 	cout<<"Dato Inexistente, solo juguito";
			 	getch();
			 }
		break;
		
		case 2:
			cout<<"\n\nIngresa Dato";
	 		cin>>da;
	 		insertar(da);
	 	break;
	 	
	 	case 3:
	 		mostrar();
	 	break;
	 	
	 	case 4:
	 		borrar();
	 	break;
	 	
	 	case 5:
	 		//guardar();
	 	break;
	 	
	 	case 6:
	 		//cargar();
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
			cout<<"Aprenda a leer ";
			getch();
		}
	}while(opc);
}

void mostrar(void){
	int cont=1;
	
	if(!i){
		//no hay lista que mostrar
		cout<<"No Hay Lista que Mostrar";
		getch();
		return;
	}
	//si hay datos
	p=i;
	cout<<"\n\n";
	while(p){
		//como si existe la lista la recorremos
		cout<<cont++<<"\nValor = "<<p->i<<endl;
		p=p->s;
	}
	cout<<"\nFin de Lista";
	getch();
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
		p = i;
		a = NULL;
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

//Guardar


