#include<iostream>
#include<algorithm>
#include<vector>
#include<functional>

#define MAX 50

using namespace std;

struct ordenamiento{
	int elem;
};

void Inserta(int, struct ordenamiento[]);
void SelectionSort(int, struct ordenamiento[]);
void BubbleSort(int, struct ordenamiento[]);
void InsertionSort(int, struct ordenamiento[]);

void menu(){
	int opcion, n;
	struct ordenamiento orden[MAX];
	
	do{
		cout<<endl<<"\t____________________________________";
		cout<<endl<<"\t|";
		cout<<endl<<"\t|      METODOS DE ORDENAMIENTO";
		cout<<endl<<"\t|___________________________________";
		
		cout<<endl<<"\t|\n\t| Ingresa el limite del arreglo: ";
		cin>>n;
		
		Inserta(n, orden);		
		
		cout<<"\t|_____________________________________";
		cout<<endl<<"\t|";
		cout<<endl<<"\t|       SELECCIONA UN METODO";
		cout<<endl<<"\t|";
		cout<<endl<<"\t| 1.Selection Sort      3.Bubble Sort";
		cout<<endl<<"\t|";
		cout<<endl<<"\t| 2.Insertion Sort            4.Salir";
		cout<<endl<<"\t|____________________________________";
		cout<<endl<<"\t|";
		cout<<endl<<"\t| Opcion:. ";
		cin>>opcion;
		
		
		fflush(stdin);
	
		switch(opcion){
			case 1:
				SelectionSort(n, orden);
			break;
			
			case 2:
				InsertionSort(n, orden);
			break;
			
			case 3:
				BubbleSort(n, orden);
			break;
			
			default:
				cout<<endl<<"\tOpción Invalida";
			break;
		}
	}while(opcion!=4);
}

void Inserta(int n, struct ordenamiento a[]){
	
	for(int i=0; i<n; i++){
		cout<<"\t| Ingresa el Elemento: ";
		cin>>a[i].elem;
	}
	
	cout<<"\t|\n\t| Ingresaste "<<n<<" Elementos: "<<endl<<"\t| ";
	for(int i=0; i<n; i++){
		cout<<"[ "<<a[i].elem<<" ]";
	}
	cout<<endl;
}

void SelectionSort(int n, struct ordenamiento a[]){
	int i, j, aux, min;
	
	cout<<"\t|\n\t| Metodo SelectionSort: "<<endl<<"\t|";
	
	for(i=0; i<n; i++){
		min=i;
		for(j=i+1; j<n; j++){
			if(a[j].elem < a[min].elem){
				min=j;
			}
		}
		
		cout<<"\n\t| Actual Recorre el Arreglo";
		cout<<endl<<"\t| 1. Posicion Actual en el Elemento ["<<a[i].elem<<"]";
		cout<<endl<<"\t| 2. Recorremos el Arreglo Buscando el Minimo Elemento ["<<a[min].elem<<"]";
		cout<<endl<<"\t| 3. Intercambiamos con el Actual";
		cout<<endl<<"\t|"<<endl<<"\t| ";
		for(int i=0; i<n; i++){
			cout<<" ["<<a[i].elem<<"] ";
		}
		
		cout<<endl<<"\t|";
	
		aux=a[i].elem;
		
		a[i].elem=a[min].elem;
		a[min].elem=aux;
		
	}
	
	
		
	cout<<"\n\t| Orden Ascendente: ";
	for(i=0; i<n; i++){
		cout<<"[ "<<a[i].elem<<" ] ";
	}
	cout<<"\n\t| Orden Descendente: ";
	for(i=n-1; i>=0; i--){
		cout<<"[ "<<a[i].elem<<" ] ";
	}
	
	cout<<"\n\n\t";
	system("pause");
	system("cls");
}

void BubbleSort(int n, struct ordenamiento a[]){
	int i, j, aux;
	
	for(i=1; i<n; i++){
		for(j=n-1; j>=i; j--){
			if(a[j-1].elem>a[j].elem){
				aux = a[j-1].elem;
				a[j-1].elem = a[j].elem;
				a[j].elem = aux;
			}
		}
	}
	
	cout<<"\t|\n\t| Metodo BubbleSort: ";
	cout<<"\n\t| Orden Ascendente: \n\t| ";
	for(i=0; i<n; i++){
		cout<<"[ "<<a[i].elem<<" ] ";
	}
	cout<<"\n\t| Orden Descendente: \n\t| ";
	for(i=n-1; i>=0; i--){
		cout<<"[ "<<a[i].elem<<" ] ";
	}
	
	cout<<"\n\n\t";
	system("pause");
	system("cls");
}

void InsertionSort(int n, struct ordenamiento a[]){
	int i, pos, aux;
	
	for(i=0; i<n; i++){
		pos=i;
		aux=a[i].elem;
		
		while((pos>0) && (a[pos-1].elem > aux)){
			a[pos].elem = a[pos-1].elem;
			pos--;
		}
		a[pos].elem = aux;
	}
	
	cout<<"\t|\n\t| Metodo InsertionSort: ";
	cout<<"\n\t| Orden Ascendente: ";
	for(i=0; i<n; i++){
		cout<<"[ "<<a[i].elem<<" ] ";
	}
	cout<<"\n\t| Orden Descendente: ";
	for(i=n-1; i>=0; i--){
		cout<<"[ "<<a[i].elem<<" ] ";
	}
	
	cout<<"\n\n\t";
	system("pause");
	system("cls");
}

int main(){
	
	menu();
		
	return 0;
}
