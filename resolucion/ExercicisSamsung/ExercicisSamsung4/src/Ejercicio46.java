import java.util.ArrayList;
import java.util.Scanner;



/*46.- Realiza un programa con un menú de opciones que ofrezca las siguientes posibilidades:
Menú:
1.-Introducir nombre.
2.-Listar nombres.
3.-Buscar nombre. (Se mostrarán todos los nombres que contengan la cadena de
búsqueda)
4.-Eliminar nombre.
5.-Eliminar todos los nombres.
6.-Salir.
NOTA: Se podrán almacenar hasta un máximo de 10 nombres. No se permitirán nombres repetidos.
Los nombres no son sensibles a mayúsculas*/
public class Ejercicio46 {
	static ArrayList<String> nombres=new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  boolean sortir = false;
	       
	        do{
	            switch(menu()){
	                case 1: 
	                	String nombre=Teclado.leerString("introduce un nombre: ");
	                	introduceNumero(nombre);
	                    break;
	                case 2: 
	                	listarNombres();
	                    break;
	                case 3: 
	                	String nombre2=Teclado.leerString("introduce el nombre que quieres buscar: ");
	                	encontrarNombre(nombre2);
	                        break;
	                case 4: 
	                	String nombre3=Teclado.leerString("introduce el nombre que quieres eliminar: ");
	                	eliminarNombre(nombre3);
	                    break;
	                case 5: 
	                	eliminarTodo();
	                    break;
	                case 6: System.out.println("Gràcies per utilitzar l'aplicació");
	                		sortir = true;
	                        break;
	            }
	        }while(!sortir);   
	    }
	   
	    public static byte menu(){
	        Scanner entrada = new Scanner(System.in);
	        byte opcio;
	        final byte MINIMO = 1;
	        final byte MAXIMO = 6;

	        do{
	            System.out.println("\nMENú PRINCIPAL");
	            System.out.println("1. Introducir nombre 1. ");
	            System.out.println("2. Listar nombres 2.");
	            System.out.println("3. Buscar nombre 3." );
	            System.out.println("4. Eliminar nombre 4." );
	            System.out.println("5. Eliminar todos los nombres 5." );
	            System.out.println("6. Sortir de l'aplicació 6.\n");
	            opcio = entrada.nextByte();
	            if(opcio < MINIMO || opcio > MAXIMO){
	                System.out.println("Escull una opció vàlida");
	            }
	        }while(opcio < MINIMO || opcio > MAXIMO);
	        return opcio;
	    }
	    public static void introduceNumero(String nombre) {
	    	nombres.add(nombre);
	    	System.out.println("nombre introducido");
	    }
	    public static void listarNombres() {
	    	for(int i =0;i<nombres.size();i++) {
	    		System.out.print(nombres.get(i)+" ");
	    	}
	    	System.out.println("");
	    }
	    public static void encontrarNombre(String nombre) {
	    	
	    	for(int i =0;i<nombres.size();i++) {
	    		if (nombres.get(i).contains(nombre)) {
	    			System.out.println(nombres.get(i));
	    		}
	    	}
	    }
	    public static void eliminarNombre(String nombre) {
	    	for(int i =0;i<nombres.size();i++) {
	    		if (nombres.get(i).equalsIgnoreCase(nombre)) {
	    			nombres.remove(i);
	    			System.out.println("nombre eliminado");
	    		}
	    	}
	    }
	    public static void eliminarTodo() {
	    	nombres.clear();
	    	System.out.println("todo eliminado");
	    }

}
