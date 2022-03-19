/*27.- Realiza un programa que lea 23 números para posteriormente mostrarlos en orden ascendente.*/
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio27 {
	 public static void main(String[] args) {
		    // TODO Auto-generated method stub

		    Scanner input = new Scanner(System.in);
		      
		      ArrayList<Integer> numeros= new ArrayList<Integer>();
		      ArrayList<Integer> numerosOrdenados= new ArrayList<Integer>();
		      int comparador= 0;
		      int posicion= 0;
		          
		      for(int i = 0; i<5; i++) {
		        System.out.println("dame 1 numero");
		        int numero= input.nextInt();
		        numeros.add(numero);
		      }
		      for(int x =0; x<5;x++) {
		        comparador = numeros.get(0);
		        posicion= 0; 
		        for(int i = 0; i<numeros.size(); i++) {
		          if (comparador>numeros.get(i)) {
		            comparador=numeros.get(i);
		            posicion = i;
		          }
		        }
		        numerosOrdenados.add(comparador);
		        numeros.remove(posicion);
		      }
		      System.out.println(numerosOrdenados);
		  }
}
