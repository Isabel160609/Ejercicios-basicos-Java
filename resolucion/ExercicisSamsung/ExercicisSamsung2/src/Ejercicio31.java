import java.util.ArrayList;

/*31.- Realiza un programa que gestione una tabla ordenada ascendentemente y con un máximo de 10 elementos. No se
permitirán repetidos:
Menú: 
1.­ Introducir número entero. 
2.­ Listar números. 
3.­ Eliminar número. 
3.­ Eliminar todos los números. 
4.­ Salir.
*/
public class Ejercicio31 {
	static ArrayList<Integer> numeros= new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean sortir = false;
	       
	        do{
	            switch(menu()){
	                case 1: 
	                	int numero=Teclado.leerInt("que numero quieres introducir");
	                	introducirNumero(numero);
	                	break;
	                case 2: 
	                	listarNumeros();
	                        break;
	                case 3: 
	                	int numero2=Teclado.leerInt("que numero quieres eliminar");
	                	eliminarNumero(numero2);
	                	
	                        break;
	               
	                case 4: System.out.println("Gracias por utilizar laaplicación");
	                		sortir = true;
	                        break;
	            }
	        }while(!sortir);   
		
	}
	public static byte menu(){
     byte opcio;
     final byte MINIMO = 1;
     final byte MAXIMO = 4;

     do{
     	opcio =Teclado.leerByte("\nMENú PRINCIPAL\n1.­ Introducir número entero. 1.\n2.­ Listar números.  2.\n"
     			+"3.­ Eliminar número. 3.\n4.­ Salir.");

         if(opcio < MINIMO || opcio > MAXIMO){
             System.out.println("Escull una opció vàlida");
         }
     }while(opcio < MINIMO || opcio > MAXIMO);
    
     return opcio;
 }
	
	
	static void introducirNumero(int numero) {
		if (numeros.size()<10 && !repetido(numero)) {
			numeros.add(numero);
			ordenarAscendente(numeros);
		}else {
			System.out.println("no se pueden añadir este numero");
		}
	}
	static void listarNumeros() {
		if (numeros.size()==0) {
			System.out.println("la lista esta vacia");
		}else {
			System.out.println("los numeros de la lista son: ");
			 for (int i = 0; i < numeros.size() ; i++) {
				 System.out.print(numeros.get(i)+" ");
			 }
		}
	}
	static void eliminarNumero(int numero) {
		if ( encontrarNumero(numero)==-1) {
			System.out.println("el numero no esta en la lista");
		}else {
			numeros.remove(encontrarNumero(numero));
			System.out.println("el numero ha sido eliminado de  la lista");
		}
	}
	
	
	static boolean repetido(int numero) {
		boolean repetido=false;
		int i=0;
		while(i<numeros.size()&& !repetido) {
			 if (numeros.get(i)==numero) {
				 repetido=true;
			 }
			 i++;
		 }
		 return repetido;
	}
	
	static int encontrarNumero(int numero) {
		int posicion =-1;
		int i=0;
		while(i<numeros.size()&& posicion==-1) {
			 if (numeros.get(i)==numero) {
				 posicion =i;
			 }
			 i++;
		 }
		return posicion;
	}
	static void ordenarAscendente(ArrayList<Integer> numeros){
		
		  int comparador= 0;
	      int posicion= 0;
	      int i, j, aux;
          for (i = 0; i < numeros.size() - 1; i++) {
              for (j = 0; j < numeros.size() - i - 1; j++) {
                  if (numeros.get(j + 1) < numeros.get(j)) {
                      aux = numeros.get(j + 1);
                      numeros.set((j + 1), numeros.get(j));
                      numeros.set((j), aux);
                  }
              }
          }
	}
}
