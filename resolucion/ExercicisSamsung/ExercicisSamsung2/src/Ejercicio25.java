import java.util.ArrayList;

/*25.- Realiza un programa que lea desde teclado 9 n�meros. A continuaci�n nos pedir� que busquemos un n�mero entre
los introducidos, y nos dir� si ha sido encontrado o no. El programa nos preguntar� si queremos seguir buscando m�s
n�meros o no: ��Desea seguir buscando n�meros?(s/n)�*/
public class Ejercicio25 {

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
			   int i=0;
			  while(!encontrado && i<numeros.size()) {
				   if (numeros.get(i)==numeroBuscar) {
					   encontrado=true;
					 
				   }
				   i++;
			   }
			   
			   if (encontrado) {
				   System.out.println("el numero ha sido enconrado");
			   }else {
				   System.out.println("el numero no ha sido enconrado");
			   }
			   encontrado=false;
			   seguirbuscando=Teclado.leerString("quieres buscar otro numero?");
		   }
	}

}
