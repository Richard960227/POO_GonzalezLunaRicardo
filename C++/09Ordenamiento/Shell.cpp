#include <iostream>

using namespace std;

void Imprimir(int[], int n);
void Shell(int [], int n);

int main(){
	
	int total;
	cout<<"\n\t Ingresa el Numero para el arreglo"<<endl;
	cin>>total;
	int num[total];
	for(int i=0;i<total;i++){
		cout<<"\n\t Ingrese el Numero para la Posicion [ "<<(i+1)<<" ] del Arreglo"<<endl;
		cin>>num[i];
	}
	
	Shell(num,total);
	Imprimir(num,total);
	
	return 0;
}

void Shell(int a[], int n){
	int ints, i, aux;
	bool band;
	
	ints=n;
	
	while(ints>0){
		ints=(ints/2);
		band=true;
		cout<<endl<<"\t| 1. Posicion Actual en el Elemento ["<<a[i]<<"]";
		while(band==true){
			band=false;
			i=0;
			while((i+ints)<=n){
				if(a[i]>a[i+ints]){
					aux=a[i];
					a[i]=a[i+ints];
					a[i+ints]=aux;
					band=true;
				}
				i++;
			}
			
			
		cout<<endl<<"\t| 2. Recorremos el Arreglo Buscando el Minimo Elemento ["<<a[aux]<<"]";
		cout<<endl<<"\t| 3. Intercambiamos con el Actual";
		cout<<endl<<"\t|"<<endl<<"\t| ";
		for(int i=0; i<n; i++){
			cout<<" ["<<a[i]<<"] ";
		}
		}
		
	}
}

void Imprimir(int a[], int n){
	cout<<"\n\t Numero del Arreglo Ordenados de Menor a Mayor"<<endl;
	for (int i=1;i<n+1;i++){
		cout<<"[ "<<a[i]<<" ]";
	}
}
