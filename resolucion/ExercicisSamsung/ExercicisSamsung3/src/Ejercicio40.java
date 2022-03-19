import java.util.ArrayList;

/*40.- Realiza un programa que lea y muestre desde consola un array de 3 x 3 y nos diga si todas sus filas suman
lo mismo.*/
public class Ejercicio40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][]cadena=generadorDeArray(3,3);
		 imprimirArray(cadena);
		 System.out.println(filasIguales(cadena));
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
	 static boolean filasIguales(int[][] lista) {
	 boolean iguales=true;
	 ArrayList<Integer>sumaFilas=new ArrayList<Integer>();
	 int suma=0;
	 for (int i = 0; i < lista.length; i++) {
		 suma=0;
	      for (int j = 0; j < lista[i].length; j++) {
	        suma+=lista[i][j];
	      }
	      sumaFilas.add( suma);
	    }
	 
	 for(int i = 0; i <sumaFilas.size()-1 ; i++) {
		 if(sumaFilas.get(i)!=sumaFilas.get(i+1)) {
			 iguales=false;
		 }
	 }
	 return iguales;
	 }
}
