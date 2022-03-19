import java.util.ArrayList;

/*22.- Realiza un programa que lea 10 números desde consola. Una vez introducidos se motrarán lo números no
repetidos.*/
public class Ejercicio22 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			    
			    ArrayList<Integer> numeros= new ArrayList<Integer>();
			    
			    
			    int numero = Teclado.leerInt("introduce un numero");
			    numeros.add(numero);
			    boolean repetido = false;
			    
			    for (int i = 0; i<9; i++) {
			    	numero = Teclado.leerInt("introduce un numero");
			      
			      for (int x=0; x<numeros.size(); x++) {
			        if (numeros.get(x)==numero) {
			          repetido = true;
			          break;
			        }else {
			          repetido = false;
			        }
			      }
			      if (repetido==false) {
			        numeros.add(numero);
			      }else {
			        repetido=false;
			      }
			    }
			    System.out.println(numeros);
			  
	}

}
