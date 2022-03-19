
/*23.- Realiza un programa que lea 13 números y muestre al final los repetidos. Cada número repetido será mostrado una
sola vez.*/
import java.util.ArrayList;

public class Ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
	    
	    
	    ArrayList<Integer> numeros= new ArrayList<Integer>();
	    ArrayList<Integer> repetido= new ArrayList<Integer>();
	    
	    int numero;

	    
	    for (int i = 0; i<5; i++) {
	    
	      numero = Teclado.leerInt("introduce un numero");
	      numeros.add(numero);
	    }  
	    
	    for (int i = 0; i<numeros.size();i++) {
	      int comparador = numeros.get(i);
	      for (int x=0; x<numeros.size(); x++) {
	          if (i!=x) {
	            if(comparador==numeros.get(x)) {
	              repetido.add(numeros.get(i));
	              numeros.remove(x);
	              numeros.remove(i);
	              break;
	            }
	          }
	        }
	     
	      }
	    
	    System.out.println(repetido);
	  
	}

}
