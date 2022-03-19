import java.util.ArrayList;

/*30.- Realiza un programa que muestre 10 números
aleatorios enteros y sin repetir de entre el 1 y el 100, ambos inclusive.*/
public class Ejercicio30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros= new ArrayList<Integer>();
		boolean repetido=false;
		
		 for (int i = 0; i < 10 ; i++) {
			 int valorDado = (int)(Math.random()*100+1);
			 for (int j = 0; j < numeros.size() ; j++) {
				 if (numeros.get(j)==valorDado) {
					 repetido=true;
					 break;
				 }
				 
			
			 }
			 if (!repetido) {
					numeros.add(valorDado);
				}
			
		 }
		 System.out.println(numeros);
	}

}
