import java.util.ArrayList;
import java.util.Scanner;

/*32.- Realiza un programa que gestione una tabla de hasta 8 cadenas. No se permitirán cadenas repetidas, y el
orden de entrada es irrelevante.
Menú:
1.- Introducir cadena.
2.- Listar cadenas.
3.- Eliminar cadena.
4.- Eliminar todas las cadenas.
5.- Salir.
*/
public class Ejercicio32 {
	static ArrayList<String> cadenas=new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    boolean sortir = false;
	       
        do{
            switch(menu()){
                case 1: 
                	String cadena=Teclado.leerString("que cadena desea introducir?");
                	introducirCadena(cadena);
                        break;
                case 2: 
                	listarCadenas ();
                        break;
                case 3: 
                	String cadenaEliminar=Teclado.leerString("que cadena desea eliminar?");
                	eliminarCadena(cadenaEliminar);
                        break;
                case 4: 
                	eliminarTodasCadenas();
                        break;
                case 5: System.out.println("Gracias por utilitzar la aplicacion");
                		sortir = true;
                        break;
            }
        }while(!sortir);   
    }
   
    public static byte menu(){
        Scanner entrada = new Scanner(System.in);
        byte opcio;
        final byte MINIMO = 1;
        final byte MAXIMO = 5;

        do{
            System.out.println("\nMENú PRINCIPAL");
            System.out.println("1. Introducir cadena. 1.");
            System.out.println("2. Listar cadenas 2.");
            System.out.println("3. Eliminar cadena 3.");
            System.out.println("4. Eliminar todas las cadenas 4.");
            System.out.println("5. Salir.\n");
            opcio = entrada.nextByte();
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escoje una opción válida");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }
   
    public static void introducirCadena(String cadena){
        cadenas.add(cadena);
        System.out.println("la cadena ha sido introducida");
    }
   
    public static void listarCadenas (){
    	System.out.println(" las cadenas son:");
       for(String cadena :cadenas) {
    	   System.out.println(cadena);
       }
    }
   
    public static int eliminarCadena(String cadenaEliminar){
       
    	int posicion=buscarCadena(cadenaEliminar);
    	if(posicion>=0) {
    	   cadenas.remove(posicion);
    	   System.out.println("la cadena ha sido eliminada");
       }else {
    	   System.out.println("esta cadena no existe");
       }
    	return posicion;
    }
    public static void eliminarTodasCadenas() {
    	cadenas.clear();
    	System.out.println("todas las cadenas han sido eliminadas");
    }

    public static int buscarCadena(String cadenaBuscar) {
    	int posicion =-1;
    	int i=0;
    	while(posicion<0 && i<cadenas.size()) {
    		if (cadenas.get(i).equalsIgnoreCase(cadenaBuscar)) {
    			posicion=i;
    		}
    		i++;
    	}
    	return posicion;
    }
}



