/*
Vamos a crear un grafo que tiene los siguientes nodos

5 3
1 2
2 3
4 5

*/

#include<iostream>
#include<vector>
#include<cstring>

//sirve para poder hacer operaciones con cadenas para manipular elementos de caracteres bajo matriz

//debemos asignar un espacio de mamoria para las operaciones, de ahi el vector

using namespace std;

#define MAX 1001;

vector<int> ady[MAX];

/*
tenemos que tener una variables que se encargue de
detectar el recorrido de los nodos y del camino que ya se
visito
*/

bool visitado[MAX];

bool visitado_componente[MAX];

//debemos realizar un algoritmo para el recorrido

void dfs(int u){
	//saber si ya visite el camino (arista)
	visitado[u] = true;
	//saber si ya visite el nodo
	visitado_componente[u] = true;
	//ciclo del recorrido
	for(int v=; v<ady[u].size(); v++){
		if(!visitado[ady[u][v]]){
			dfs(ady[u][v]);
		}
	}
}

int main(){
	//variables para el grafo
	int V, E, u, v;
	
	//elementos para la memoria
	scanf("%d, %d", &V, &E);
	
	//ahora vamos a crear un bucle que se encargue de entrar-salir y meter-sacar
	
	while(E--){
		scanf("%d, %d", &u, &v);
		ady[u].push_back(v);
		ady[u].push_back(u);
	}
	
	printf("Cantidad de Componentes Conexos\n");
	int total = 0;
	
	/*con esto puedo saber cuanto pesa cada uno
	de los caminos de mi grafo
	primero el camino, el inicio, su peso
	o tamaño
	*/
	
	memset(visitado, 0, sizeof(visitado));
	
	//tenemos que recorrer todos los caminos
	//posibles de cada nodo
	
	for(int i = 1; i<=V, ++i){
		if(!visitado[i]){
			memset(visitado_componente, 0, sizeof(visitado_componente));
			dfs(i);
		}
	}
}
