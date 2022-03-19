/*37.- Realiza un programa que cargue y muestre un array de 6 x 4 con números enteros aleatorios de entre el 1 y
el 10, ambos inclusive. Además se ha de mostrar el número de fila cuya suma de sus elementos es la mayor. En
caso de empate se mostrará la primera fila.*/
public class Ejercicio37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] miArray=generadorDeArray(6,4);
		imprimirArray( miArray);
		System.out.println(filaMayor(miArray) );
	}
	 static int[][]generadorDeArray(int fila,int columna){
		 
		  int numero;
		  int[][] arrayGenerada = new int[fila][columna];
		 for (int i = 0; i < fila; i++) {
		      for (int j = 0; j < columna; j++) {
		    	  
		    	  arrayGenerada[i][j]=(int)Math.floor(Math.random()*10+1);
		      }
		 }
		 return arrayGenerada;
	 }
	 static void imprimirArray(int[][] lista) {
		    for (int i = 0; i < lista.length; i++) {
		      for (int j = 0; j < lista[i].length; j++) {
		        System.out.print(lista[i][j] + "\t ");
		      }
		      System.out.println();
		    }
	 }
	 static int filaMayor(int[][] lista){
		 int suma=0;
		 int sumaMayor=0;
		 for (int i = 0; i < lista.length; i++) {
			 suma=0;
		      for (int j = 0; j < lista[i].length; j++) {
		    	  suma+=lista[i][j];
		    	  
		      }
		      if(suma>sumaMayor) {
		    	  sumaMayor=suma;
		      }
		 }
		 return sumaMayor;
	 }
}
