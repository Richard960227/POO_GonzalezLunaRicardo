/*
Ejemplo de un grafo que se encarga de todos los caminos o las
cpnexiones que tendra un grafo que se encargue de la busqueda
de la anchura de sus nodos
*/

#include<stdio.h>
#include<queue>

using namespace std;

#define MAX 500

//vector
vector<int> ady[MAX];
//para saber si el nodo ya fue visitado
bool visitado[MAX];

void bfs(){
	int ini, fin;
	
	printf("\n\tNodo raiz: ");
	scanf("%d", &ini);
	//%d es enteros %f es flotante %s es cadenas %c es caracteres
	
	printf("\n\tNodo final: ");
	scanf("%d", &fin);
	
	//creamos una cola para almacenar los nodos del grafo
	queue<int> Q;
	
	//contar los pasos del recorrido del grafo
	Q.push(ini);
	
	//mientras exista otro nodo
	//mientras la cola no este vacia
	
	int pasos = 0, maxi = 0;
	
	while(!Q.empty()){
		//saber si la memoria de la cola la estoy usando respecto
		//del tamaño
		
		maxi = max(maxi, (int)Q.size());
		
		int actual = Q.front(); Q.back();
		
		pasos++;
		
		if(actual == fin)break;
		
		//tengo que saber donde estoy
		visitado[actual] = true;
		//contador para saber donde he estado
		for(int i = 0; i < ady[actual].size(); ++i){
			//saber si tiene nodos adyacentes
			if(!visitado[ady[actual][i]]){
				//si obtengo el iterador i nos va a decir la posicion de donde
				//se encuentra el nodo
				printf("%d --> %d", actual, ady[actual][i]);
				//se mete a la cola
				Q.push(ady[actual][i]);	
			}
		}
	}
	
	printf("\n\tMemoria Maxima de uso: %d \n", maxi);
	printf("\n\tNumero de pasos que ha dado: %d \n", pasos);
		
}

int main(){
	
	//variables del grafo
	int V, E, x, y;
	
	printf("\n\tIngresa el numero de vertice y arista: ");
	scanf("%d %d", &V, &E);
	
	//recorremos su origen y fin
	
	for(int i = 1; i <= E; ++i){
		//necesitamos su origen y destino
		printf("\n\tIngresa el Nodo de Origen y Destino: ");
		scanf("%d %d", &x, &y);
	}
	bfs();
	return 0;
}
