#include <iostream>
#define MAXI 20

int MatAdy[MAXI] [MAXI];
	int NumVer, Vertices [MAXI];
	int Ind1, Ind2;
	
using namespace std;

void GRAFICA(){
	
	
	
	
	
	
	for(Ind1=0;Ind1<MAXI;Ind1++){
		for(Ind2=0;Ind2<MAXI;Ind2++){
			if(Ind1!=Ind2){
			MatAdy[Ind1][Ind2]=999;
		}else
			MatAdy[Ind1][Ind2]=0;
		}
	}
	NumVer=0;
}
int Minimo(int Val1, int Val2){
	int Min=Val1;
	if(Val2<Min)
		Min=Val2;
	return Min;
}

int Maximo(int Val1, int Val2){
	int Max=Val1;
	if(Val2<Max)
		Max=Val2;
	return Max;
}

void Leer(){
	int Aristas, Costo, Indi1, Origen, Destino;
	cout<<"Ingrese Total de Vertices: ";
	cin>>NumVer;
	for(Indi1=0;Indi1<NumVer;Indi1++){
		cout<<"\nIngrese Nombre del Vertice: ";
		cin>>Vertices[Indi1];
	}
	cout<<"\nIngrese Total de Aristas: ";
	cin>>Aristas;
	Ind1=0;
	while(Ind1<Aristas){
		cout<<"\nVertice Origen: ";
		cin>>Origen;
		cout<<"\nVertice Destino: ";
		cin>>Destino;
		cout<<"\nCosto de ir de "<<Origen<<" a "<<Destino<<": ";
		cin>>Costo;
		MatAdy[Origen-1][Destino-1]=Costo;
		MatAdy[Destino-1][Origen-1]=Costo;
		Ind1++;
	}
}

void Kruskal(){
	/*ArisCosto[][] Es una matriz auxiliar almacena en cada renglon los datos
	de una arista, los vertices y el costo.
	Pario[] almacena las particiones de vertices
	*/
	
	int ArisCosto[ MAXI][3], Partio[MAXI],Indi1,Indi2,Ver1, Ver2,TotalAris,Menor,Mayor,Bandera;
	for(Indi1=0;Indi1<NumVer;Indi1++){
		Partio[Indi1]=Indi1;
	}
	Ver1=0;
	Ver2=0;
	TotalAris=0;
	for(Indi1=0;Indi1<NumVer;Indi1++){
		for(Indi2=0;Indi2<NumVer;Indi2++){
			if(MatAdy[Indi1][Indi2] != 0 && MatAdy[Indi1][Indi2] != 999){
				ArisCosto[Ver1][Ver2++]=Indi1;
				ArisCosto[Ver1][Ver2++]=Indi2;
				ArisCosto[Ver1++][Ver2]=MatAdy[Indi1][Indi2];
				Ver2=0;
				TotalAris++;
			}
		}
	}
	
	Bandera=0;
	while(Bandera!=1){
		Menor=999;
		for(Indi1=0;Indi1<TotalAris;Indi1++){
			if(ArisCosto[Indi1][2]<Menor){
				Ver1=ArisCosto[Indi1][0];
				Ver2=ArisCosto[Indi1][1];
				Menor=ArisCosto[Indi1][2];
				Indi2=Indi1;
			}
		}
		ArisCosto[Indi2][2]=999;
		if(Partio[Ver1]!=Partio[Ver2]){
			cout<<"\nVertice: "<<Vertices[Ver1]<<" Vertice: "<<Vertices[Ver2]<<" Costo: "<<MatAdy[Ver1][Ver2];
			Mayor=Maximo(Partio[Ver1],Partio[Ver2]);
			for(Indi1=0;Indi1<NumVer; Indi1++){
				if(Ind1==Ver1 || Indi1==Ver2 || Partio[Indi1]==Mayor){
					Partio[Indi1]=Minimo(Partio[Ver1], Partio[Ver2]);
				}
			}
		}
		Indi1=0;
		while(Indi1<NumVer && !Bandera){
			if(Partio[Indi1]!=0){
				Bandera=1;
			}
			Indi1++;
		}
		Bandera=!Bandera;
	}
}

int main(){
	system("color f0");
	cout<<"Ingrese los datos de las Ciudades y las Carreras\n";
	Leer();
	Kruskal();
	return 0;
}


