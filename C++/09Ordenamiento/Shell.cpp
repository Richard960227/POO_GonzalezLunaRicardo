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
		cout<<"Ingrese el Numero para la Posicion [ "<<(i+1)<<" ] del Arreglo"<<endl;
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
	
	while(ints>1){
		ints=(ints/2);
		band=true;
		
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
		}
	}
}

void Imprimir(int a[], int n){
	cout<<"\n\t Numero del Arreglo Ordenados de Menor a Mayor"<<endl;
	
	for (int i=0;i<n;i++){
		cout<<"[ "<<a[i]<<" ]";
	}
}
