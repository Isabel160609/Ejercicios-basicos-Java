/*28.- Realiza un programa que cargue desde teclado una tabla bidimensional de 3x2 de n�meros enteros.
Posteriormente el programa mostrar� la tabla introducida en formato de filas y columnas y pedir� un n�mero a buscar.
En caso de encontrarlo indicar� el n�mero de fila y columna donde se ha encontrado por primera vez. El programa
ofrecer� al usuario la opci�n de seguir buscando m�s n�meros ��Desea seguir buscando n�meros?(s/n)�.
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
