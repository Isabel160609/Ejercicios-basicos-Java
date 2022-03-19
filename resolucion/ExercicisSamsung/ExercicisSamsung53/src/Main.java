import java.util.Scanner;

/*53.- Crea una clase llamada Nombres, capaz de gestionar una lista de nombres, sin repetir, de
un tamaño determinado:
• El constructor recibirá como parámetro el número máximo de nombres que albergará.
• Tendrá los siguientes métodos:
• boolean anadir(String nombre) Añade a la lista el nombre pasado como
parámetro. Devuelve false si la lista está llena o si ya existe el nombre, true si
se añade con éxito. No admite repetidos.
• boolean eliminar(String nombre) Elimina de la lista el nombre pasado como
parámetro. Devuelve true en caso de éxito y false si no encuentra el nombre a
eliminar.
• void vaciar() Elimina todos los nombres de la lista.
• String getNombre(int posicion) Devuelve el nombre que se encuentra en la
posición pasada como parámetro (la primera es la posición 0). Devuelve null si
no es una posición válida.
• int getNumeroNombres() Devuelve el número de nombres que hay
actualmente.
• int getCapacidad() Devuelve el número máximo de nombres que puede
albergar.
• boolean estaLlena() Devuelve true si la lista está llena y false en caso
contrario.
• boolean buscarNombre(String nombre) Devuelve true si encuentra el
nombre, false en caso contrario.*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Nombres miLista =new Nombres (4);

		  boolean sortir = false;
	       
	        do{
	            switch(menu()){
	                case 1: 
		                	String nombre=Teclado.leerString("introduce un nombre");
		                	System.out.println(miLista.anadir(nombre));
	                        break;
	                case 2: 
		                	String nombre2=Teclado.leerString("introduce un nombre");
		                	System.out.println(miLista.eliminar(nombre2));
	                        break;
	                case 3: 
	                		miLista.vaciar();;
	                        break;
	                case 4: 
	                		int posicion =Teclado.leerInt("dae una posicion");
	                		System.out.println(miLista.getNombre(posicion));
	                        break;
	                case 5: 
	                		System.out.println(miLista.getNumeroNombres());
	                        break;
	                case 6: 
	                		System.out.println(miLista.getCapacidad());;
	                        break;
	                case 7: 
	                		System.out.println(miLista.estaLlena());;
	                        break;
	                case 8: 
		                	String nombre3=Teclado.leerString("introduce un nombre");
		                	System.out.println(miLista.buscarNombre(nombre3));;
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
	        final byte MAXIMO = 8;

	        do{
	            System.out.println("\nMENú PRINCIPAL");
	            System.out.println("1.  anadir nombre 1.");
	            System.out.println("2. eliminar nombre 2.");
	            System.out.println("3. vaciar lista 3.");
	            System.out.println("4. dime nombre de posicion lista 4.");
	            System.out.println("5.  número de nombres que hayen la lista 5.");
	            System.out.println("6. número máximo de nombres de la lista 6.");
	            System.out.println("7. esta llena 7.");
	            System.out.println("8. buscarun nombre 8.");
	            System.out.println("0. Sortir de l'aplicació.\n");
	            opcio = entrada.nextByte();
	            if(opcio < MINIMO || opcio > MAXIMO){
	                System.out.println("Escull una opció vàlida");
	            }
	        }while(opcio < MINIMO || opcio > MAXIMO);
	        return opcio;
	    }
	   
	   

	    
	}