import java.util.ArrayList;

/*26.- Realiza un programa que lea desde teclado 7 n�meros. A continuaci�n nos pedir� que busquemos un n�mero entre
los introducidos, y nos dir� si ha sido encontrado o no. En el caso en el que haya sido encontrado, nos indicar� cu�ntas
veces se ha introducido. El programa nos preguntar� si queremos seguir buscando m�s n�meros o no: ��Desea
seguir buscando n�meros?(s/n)�*/
public class Ejercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<Integer> numeros= new ArrayList<Integer>();
		  int numero;
		   for (int i = 0; i<9; i++) {
			   
			    
			      numero = Teclado.leerInt("introduce un numero");
			      numeros.add(numero);
		   }
		   String seguirbuscando="si";
		   while(seguirbuscando.equalsIgnoreCase("si")){
		   
			   int numeroBuscar= Teclado.leerInt("introduce el numero que quieres buscar");
			   
			   boolean encontrado=false;
			   int vecesEncontrado=0;
			   for (int i = 0; i<numeros.size(); i++) { 
				   if (numeros.get(i)==numeroBuscar) {
					   encontrado=true;
					   vecesEncontrado++;
				   }
				   
			   }
			   
			   if (encontrado) {
				   System.out.println("el numero ha sido encontrado " + vecesEncontrado+ " veces");
			   }else {
				   System.out.println("el numero no ha sido encontrado");
			   }
			   encontrado=false;
			   vecesEncontrado=0;
			   seguirbuscando=Teclado.leerString("quieres buscar otro numero?");
		   }
	}
	

}
