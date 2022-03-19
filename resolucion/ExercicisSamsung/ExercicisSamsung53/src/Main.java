import java.util.Scanner;

/*53.- Crea una clase llamada Nombres, capaz de gestionar una lista de nombres, sin repetir, de
un tama�o determinado:
� El constructor recibir� como par�metro el n�mero m�ximo de nombres que albergar�.
� Tendr� los siguientes m�todos:
� boolean anadir(String nombre) A�ade a la lista el nombre pasado como
par�metro. Devuelve false si la lista est� llena o si ya existe el nombre, true si
se a�ade con �xito. No admite repetidos.
� boolean eliminar(String nombre) Elimina de la lista el nombre pasado como
par�metro. Devuelve true en caso de �xito y false si no encuentra el nombre a
eliminar.
� void vaciar() Elimina todos los nombres de la lista.
� String getNombre(int posicion) Devuelve el nombre que se encuentra en la
posici�n pasada como par�metro (la primera es la posici�n 0). Devuelve null si
no es una posici�n v�lida.
� int getNumeroNombres() Devuelve el n�mero de nombres que hay
actualmente.
� int getCapacidad() Devuelve el n�mero m�ximo de nombres que puede
albergar.
� boolean estaLlena() Devuelve true si la lista est� llena y false en caso
contrario.
� boolean buscarNombre(String nombre) Devuelve true si encuentra el
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
	                        
	                case 0: System.out.println("Gr�cies per utilitzar l'aplicaci�");
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
	            System.out.println("\nMEN� PRINCIPAL");
	            System.out.println("1.  anadir nombre 1.");
	            System.out.println("2. eliminar nombre 2.");
	            System.out.println("3. vaciar lista 3.");
	            System.out.println("4. dime nombre de posicion lista 4.");
	            System.out.println("5.  n�mero de nombres que hayen la lista 5.");
	            System.out.println("6. n�mero m�ximo de nombres de la lista 6.");
	            System.out.println("7. esta llena 7.");
	            System.out.println("8. buscarun nombre 8.");
	            System.out.println("0. Sortir de l'aplicaci�.\n");
	            opcio = entrada.nextByte();
	            if(opcio < MINIMO || opcio > MAXIMO){
	                System.out.println("Escull una opci� v�lida");
	            }
	        }while(opcio < MINIMO || opcio > MAXIMO);
	        return opcio;
	    }
	   
	   

	    
	}