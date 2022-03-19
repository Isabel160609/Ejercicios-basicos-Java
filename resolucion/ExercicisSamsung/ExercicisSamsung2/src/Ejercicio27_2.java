import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio27_2 {
	  public static void main(String[] args) {
		    // TODO Auto-generated method stub
		    
		    Scanner input = new Scanner(System.in);
		    ArrayList<Integer> numeros= new ArrayList<Integer>();
		    
		     for(int i = 0; i<23; i++) {
		          System.out.println("dame 1 numero");
		          int numero= input.nextInt();
		          numeros.add(numero);
		        }
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
		       System.out.println(numeros);
		  }
}
