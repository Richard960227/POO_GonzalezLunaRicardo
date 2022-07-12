#include<iostream>
#include<queue>
#include <stack>

/*
Vamos a crear un grafo que puedar determinar la
busqueda de nodos para su recorrido
*/

using namespace std;

class Grafo{
	private:
		int vertice, arista;
		int **adyMatriz;
		int *visitado;
		
		/*
		Cuando tenemos un doble apuntado este esta obteniendo tanto
		el dato como el espacio de memoria
		*/
		
		public:
			//Constructor
			Grafo(int ver, int arc):vertice(ver), arista(arc){
				//estos son los constructores del metodo
				adyMatriz = new *[ver];
				for(int i = 0; i<vertice; i++){
					adyMatriz[i] = int [vertice];
					for(int j = 0, j<vertice; j++){
						adyMatriz[i][j]
				 	}
				}
					visitado = new int[vertice];
			}
			
		void visitados(){
			for(int i = 0;i < vertice; i++){
				visitado[i] = 0;
			}
		}
		
		//destructor
		~Grafo(){
			for(int i = 0; i < vertice; i++){
				delete[] adyMatriz[i];
			}
			delete[] adyMatriz;
		}
		
		void crear_grafo(){
			for(int i = 0; i < vertice; i++){
				for(int j = 0, j < vertice; j++){
					cin>>adyMatriz[i][j];
					//meto coordenada
				}
			}
		}
		
		void agregarArista(int i, int j){
			if(i >= 0 && i < vertice && j > 0 && j < vertice){
				adyMatriz[i][j] = 1;
			}
		}
		
		void removerArista(in i, int j){
			if(i >= 0 && i < vertice && j > 0 && j < vertice){
				adyMatriz[i][j] = 0;
			}
		}
		
		//saber si pase por la arista
		
		bool esArista(int i, int j){
			if(i >= 0 && i < vertice && j > 0 && j < vertice){
				return adyMatiz[i][j];
			}else{
				return false;
			}
		}
};
