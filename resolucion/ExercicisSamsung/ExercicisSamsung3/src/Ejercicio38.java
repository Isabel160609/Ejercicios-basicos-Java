import java.util.ArrayList;
import java.util.Scanner;

/*38.- Realiza un programa que cargue y muestre un array de enteros
 *  de 4 x 4 desde consola. Finalmente el
programa dirá si existe algún número repetido o no (sin especificar 
cuál o cuáles).
*/
public class Ejercicio38 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[][]cadena=generadorDeArray(4,4);
    imprimirArray(cadena);
    System.out.println(numeroRepetido(cadena));
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
  static boolean numeroRepetido(int[][] lista) {
    
    boolean repetido=false;
    int i =0;
    int j;
    int i2;
    int j2=0;
    while(!repetido && i<lista.length) {
    	for(j=0;j<lista[i].length;j++) {
    		for(i2=0;i2<lista.length;i2++) {
    		    	for(j2=0;j2<lista[i2].length;j2++) {
				        if ((i!=i2 ||j!=j2)&& lista[i][j]==lista[i2][j2]) {
				        	repetido=true;
				        }
				       
    		    	}
    		    	
    		 }
    		
    	}
    	i++;
    }
    return repetido;
  } 
}