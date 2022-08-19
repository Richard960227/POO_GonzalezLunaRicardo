#include <stdio.h>
#include <string.h>

int main(){
	int i,N,j;
	scanf("%d", &N);
	char fechas[N][11],fechas_Mod[N][11];
	int cont;
	for(i=0;i<N;i++){
		scanf("%s",fechas[i]);
		//Formato en fechas_Mod (aaaa/mm/dd)
		cont=0;
		for(j=6;j<10;j++){ //Guardo aaaa
			fechas_Mod[i][cont]=fechas[i][j];
			cont++;
		}
		fechas_Mod[i][cont]='/';cont++;
		for(j=3;j<5;j++){ //Guardo mm
			fechas_Mod[i][cont]=fechas[i][j];
			cont++;
		}
		fechas_Mod[i][cont]='/';cont++;
		for(j=0;j<2;j++){ //Guardo dd
			fechas_Mod[i][cont]=fechas[i][j];
			cont++;
		}
		fechas_Mod[i][cont]='\0';
	}
	
	//Obtener los vectores de punteros
	char *vec_Fechas[N], *vec_Fechas_Mod[N];
	for(i=0;i<N;i++){
		vec_Fechas[i]=fechas[i];
		vec_Fechas_Mod[i]=fechas_Mod[i];
	}
	
	//Proceso ORdenamiento
	int continuar;
	char *aux;
	i=0;
	do{
		continuar=0;
		for(j=0;j<(N-i-1);j++){
			if(strcmp(vec_Fechas_Mod[j],vec_Fechas_Mod[j+1])>0){
				//Intercambiar vec_fechas_Mod[i] y vec_fechas_Mod[i+1]
				aux=vec_Fechas[i];
				vec_Fechas[j] = vec_Fechas[j+1];
				vec_Fechas[j+1]=aux;
				
				aux=vec_Fechas_Mod[j];
				vec_Fechas_Mod[j] = vec_Fechas[j+1];
				vec_Fechas_Mod[j+1]=aux;
				
				continuar=1;
			}
		}
		i++;
	}while(continuar);
	
	//Imprimir Resultados
	for(i=0;i<N;i++){
		printf("%s\n", vec_Fechas[i]);
	}
	
	return 0;
	
}
