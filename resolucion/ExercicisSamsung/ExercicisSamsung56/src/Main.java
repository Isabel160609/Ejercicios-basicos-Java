import java.util.Scanner;

/*56.- Crea una clase llamada MiString, sin atributos y con los siguientes métodos públicos y estáticos:
• String alReves(String): Devuelve la cadena pasada como parámetro pero al revés.
• String limpiaCaracteres(String, String): Devuelve la cadena pasada como primer parámetro pero
eliminando los caracteres pasados en la cadena como segundo parámetro.
• String susituye(String, char, char): Devuelve la cadena pasada como parámetro pero
sustituyendo todas las apariciones del primer char que pudiera haber por el segundo.
• boolean todosIguales(String): Devuelve true o false, dependiendo de si todos los caracteres de la
cadena son iguales o no.
• String quitaEspacios(String): Devuelve una cadena con los espacios en blanco que pudiera tener
eliminados.
• boolean esNumeroEntero(String): Devuelve true o false, dependiendo de si todos los caracteres
pasados como parámetro son numéricos.
Crea una clase aparte con el método main para probar todas las funcionalidades de la clase MiString.
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  boolean sortir = false;
	       
	        do{
	            switch(menu()){
	            
	                case 1: 
	                		String cadena=Teclado.leerString("introduce una frase");
	                		System.out.println(MiString.alReves(cadena));
	                        break;
	                case 2:
		                	String cadena2=Teclado.leerString("introduce una frase");
		                	String cadena3=Teclado.leerString("introduce lo que deseas quitar");
		                	System.out.println(MiString.limpiaCaracteres(cadena2, cadena3));
	                        break;
	                case 3:
		                	String cadena4=Teclado.leerString("introduce una frase");
		                	char caracter1=Teclado.leerChar("introduce elcaracter que deseas quitar");
		                	char caracter2=Teclado.leerChar("introduce elcaracter que deseas poner");
		                	System.out.println(MiString.susituye(cadena4, caracter1,caracter2));
	                        break;
	                case 4:
		                	String cadena5=Teclado.leerString("introduce una frase");
	                		System.out.println(MiString.todosIguales(cadena5));
	                        break;
                        
	                case 5:
		                	String cadena6=Teclado.leerString("introduce una frase");
	                		System.out.println(MiString.quitaEspacios(cadena6));
	                        break;
	                case 6:
		                	String cadena7=Teclado.leerString("introduce una frase");
	                		System.out.println(MiString.esNumeroEntero(cadena7));
	                        break;
	                case 0: System.out.println("Gràcies per utilitzar l'aplicació");
	                		sortir = true;
	                        break;
	            }
	        }while(!sortir);   
	    }
	   
	    public static byte menu(){
	        Scanner entrada = new Scanner(System.in);
	        byte opcio;
	        final byte MINIMO = 0;
	        final byte MAXIMO = 6;

	        do{
	            System.out.println("\nMENú PRINCIPAL");
	            System.out.println("1. cadena al reves 1.");
	            System.out.println("2. limpia caracteres que introduzcas 2.");
	            System.out.println("3. sustituyendo las apariciones del primer caracter que pudiera haber por el segundo 3.");
	            System.out.println("4. todos los caracteres de la cadena son iguales 4.");
	            System.out.println("5. sin espacios en blanco 5.");
	            System.out.println("6. los caracteres son numericos? 6.");
	            System.out.println("0. Sortir de l'aplicació.\n");
	            opcio = entrada.nextByte();
	            if(opcio < MINIMO || opcio > MAXIMO){
	                System.out.println("Escull una opció vàlida");
	            }
	        }while(opcio < MINIMO || opcio > MAXIMO);
	        return opcio;
	    }
	
	}
