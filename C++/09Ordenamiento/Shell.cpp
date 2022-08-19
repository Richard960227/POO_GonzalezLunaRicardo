#include <iostream>

using namespace std;

void Imprimir(int[], int n);
void Shell(int [], int n);

int main(){
	
	int total;
	cout<<"\n\t Ingresa el Limite para el Arreglo: ";
	cin>>total;
	int num[total];
	for(int i=0;i<total;i++){
		cout<<"\n\t Ingrese el Numero para la Posicion [ "<<(i+1)<<" ] del Arreglo: ";
		cin>>num[i];
	}
	
	cout<<"\n\t";
	
	for(int i=0; i<total; i++){	
		cout<<" ["<<num[i]<<"] ";
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
		
		cout<<endl<<"\n\t El arreglo se Divide a la Mitad: ["<<ints<<"]\n";
			
		
		while(band==true){
			
			band=false;
			i=0;
			while((i+ints)<=n){
				
				
		
				if(a[i]>a[i+ints] && a[i+ints]>0){
					
					
				
					cout<<"\n\t Intercambiamos si "<<a[i]<<" es mayor "<<a[i+ints]<<"\n\n\t";
					
					for(int i=0; i<n; i++){
					cout<<" ["<<a[i]<<"] ";
				}
				
					aux=a[i];
					a[i]=a[i+ints];
					a[i+ints]=aux;
					band=true;
				
				}
				i++;
			}
			
			
		
		//cout<<endl<<"\t|"<<endl<<"\t| ";
		
		}
		//cout<<endl<<"\t| 2. Comparamos el 1er Elemento con el de la Mitad ["<<a[ints]<<"]";
		
		
	}
}

void Imprimir(int a[], int n){
	cout<<"\n\t| Orden Ascendente: \n\t| ";
	for(int i=0; i<n; i++){
		cout<<"[ "<<a[i]<<" ] ";
	}
	cout<<"\n\t| Orden Descendente: \n\t| ";
	for(int i=n-1; i>=0; i--){
		cout<<"[ "<<a[i]<<" ] ";
	}
}
