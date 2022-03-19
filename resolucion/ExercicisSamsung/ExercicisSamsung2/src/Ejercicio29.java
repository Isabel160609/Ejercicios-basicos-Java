/*29.- Realiza un programa que dibuje un cuadrado mágico de orden impar introducido por el usuario. Un cuadrado
mágico es aquel en el que sin repetir ningún número, todas las filas, columnas, y las dos diagonales suman lo mismo.
Ejemplo de cuadrado mágico de orden 3:
*/
public class Ejercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int costat;
		//per que el costat sigui sempra imparell
		do {
			costat=Teclado.leerInt("Cual es el costat del cuadrado");
		}while(costat%2==0);
		
		//creem el array de numeros del quadrat
		int [][] magic=new int [costat][costat];
		
		//comencem a omplir sempre pel numero 1 y per la meitat de la primera fila
		int fila=0;
		int columna=costat/2;
		int numero=1;
		
		while(numero<=costat*costat) {
			
			//omplim el primer numero
			magic[fila][columna]=numero;
			
			//detectem el tipus de moviment
			
			if(numero%costat==0) {
				fila++;
			}else {
				//Actualitzar fila anem a la casella anterior pero si es la cero anirem a l'altre banda del cuadrat 
				if(fila==0) {
					fila=costat-1;
				}else {
					fila--;
				}
				//actualitzem columna sempre anem a la segurnt si es la ultima tornem a la primera
				if(columna==costat-1) {
					columna=0;
				}else {
					columna++;
				}
			}
			numero++;
			
		}
		
		//imprimir cuadrat magic
		
		 for (int i = 0; i < costat ; i++) {
             for (int j = 0; j < costat; j++) {
            	System.out.print( magic [i][j]+" "); 
             }
             System.out.println();
		 }

	}

}
