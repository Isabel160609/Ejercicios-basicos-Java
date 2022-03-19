import java.util.Scanner;

/*54.- Utilizando la clase Nombres reci�n creada, rehaz el ejercicio 46.
 * 46.- Realiza un programa con un men� de opciones que ofrezca las siguientes posibilidades:
Men�:
1.-Introducir nombre.
2.-Listar nombres.
3.-Buscar nombre. (Se mostrar�n todos los nombres que contengan la cadena de
b�squeda)
4.-Eliminar nombre.
5.-Eliminar todos los nombres.
6.-Salir.
NOTA: Se podr�n almacenar hasta un m�ximo de 10 nombres. No se permitir�n nombres repetidos.
Los nombres no son sensibles a may�sculas
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nombres miLista =new Nombres (10);
		  boolean sortir = false;
	       
	        do{
	            switch(menu()){
	                case 1: 
	                	String nombre=Teclado.leerString("introduce un nombre");
	                	System.out.println(miLista.anadir(nombre));
                        break;
	                case 2: 
	                	miLista.listarNombres();
	                    break;
	                case 3: 
	                	String nombre2=Teclado.leerString("introduce el nombre que quieres buscar: ");
	                	miLista.encontrarNombre(nombre2);
	                        break;
	                case 4: 
	                	String nombre3=Teclado.leerString("introduce un nombre");
	                	System.out.println(miLista.eliminar(nombre3));
                        break;
	                case 5: 
	                	miLista.vaciar();;
                        break;
	                case 6: System.out.println("Gr�cies per utilitzar l'aplicaci�");
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
	            System.out.println("\nMEN� PRINCIPAL");
	            System.out.println("1. Introducir nombre 1. ");
	            System.out.println("2. Listar nombres 2.");
	            System.out.println("3. Buscar nombre 3." );
	            System.out.println("4. Eliminar nombre 4." );
	            System.out.println("5. Eliminar todos los nombres 5." );
	            System.out.println("6. Sortir de l'aplicaci� 6.\n");
	            opcio = entrada.nextByte();
	            if(opcio < MINIMO || opcio > MAXIMO){
	                System.out.println("Escull una opci� v�lida");
	            }
	        }while(opcio < MINIMO || opcio > MAXIMO);
	        return opcio;
	    }
}
