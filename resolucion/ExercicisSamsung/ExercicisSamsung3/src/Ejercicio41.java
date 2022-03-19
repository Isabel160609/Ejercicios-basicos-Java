/*41.- Realiza un programa que lea desde consola un array de dimensiones introducidas por el usuario y el valor
inicial, que deberá ser 0 ó 1. Se creará y mostrará el array formando un dibujo en “ajedrez” con 0 y 1. Ejemplo de
3 x 4 y valor inicial 0:
0 1 0 1
1 0 1 0
0 1 0 1
*/
public class Ejercicio41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fila=Teclado.leerInt("introduce numero filas");
		int columna=Teclado.leerInt("introduce numero columnas");
		int numeroEmpezar=Teclado.leerInt("por que numero quieres empezar 0 o 1");
		
		int[][]miArray= new int[fila][columna];
		  for (int i = 0; i < miArray.length; i++) {
		      for (int j = 0; j < miArray[i].length; j++) {
		    	  if(numeroEmpezar==0) {
		    		  if(i%2==0) {
		    			  if (j%2==0) {
		    				  miArray[i][j]=0;
		    			  }else {
		    				  miArray[i][j]=1;
		    			  }
		    		  }else {
		    			  if (j%2==0) {
		    				  miArray[i][j]=1;
		    			  }else {
		    				  miArray[i][j]=0;
		    			  }
		    		  }
		    		  
		    		  
		    	  }else {
		    		  if(i%2==0) {
		    			  if (j%2==0) {
		    				  miArray[i][j]=1;
		    			  }else {
		    				  miArray[i][j]=0;
		    			  }
		    		  }else {
		    			  if (j%2==0) {
		    				  miArray[i][j]=0;
		    			  }else {
		    				  miArray[i][j]=1;
		    			  }
		    		  }
		    	  }	 
		      }
		    }
		  imprimirArray(miArray);
	} 
	static void imprimirArray(int[][] lista) {
	    for (int i = 0; i < lista.length; i++) {
	      for (int j = 0; j < lista[i].length; j++) {
	        System.out.print(lista[i][j] + "\t ");
	      }
	      System.out.println();
	    }
 }  
}
		  

