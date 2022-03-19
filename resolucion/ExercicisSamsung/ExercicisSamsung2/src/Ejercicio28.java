/*28.- Realiza un programa que cargue desde teclado una tabla bidimensional de 3x2 de números enteros.
Posteriormente el programa mostrará la tabla introducida en formato de filas y columnas y pedirá un número a buscar.
En caso de encontrarlo indicará el número de fila y columna donde se ha encontrado por primera vez. El programa
ofrecerá al usuario la opción de seguir buscando más números “¿Desea seguir buscando números?(s/n)”.
*/
public class Ejercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numeros= new int[3][2];
		
		 for (int i = 0; i < 3 ; i++) {
             for (int j = 0; j < 2 ; j++) {
            	numeros [i][j] = Teclado.leerInt("introduce un numero");
             }
		 }
		 for (int i = 0; i < 3 ; i++) {
             for (int j = 0; j < 2; j++) {
            	System.out.print( numeros [i][j]+" "); 
             }
             System.out.println();
		 }
		 boolean seguirBuscando=true;
		 
		 while(seguirBuscando) {
			 int numero= Teclado.leerInt("introduce un numero que quieres buscar");
			 boolean esta=false;
			 int fila=0;
			 int columna=0;
			 
			 for (int i = 0; i < 3 ; i++) {
	             for (int j = 0; j < 2 ; j++) {
	            	
	            		if(numero==numeros [i][j]) {
	            			esta=true;
	            			fila=i;
	            			columna=j;
	            			break;
	            		}
	             }
			 }
			 
			 if (esta) {
				 System.out.println("numero emcontrado en columna "+columna+ "y fila "+fila);
			 }else {
				 System.out.println("el numero no esta");
			 }
			 
			 seguirBuscando=Teclado.leerSiNo("Quieres seguir buscando?(escribe S o N)");
		 }
	}

}
