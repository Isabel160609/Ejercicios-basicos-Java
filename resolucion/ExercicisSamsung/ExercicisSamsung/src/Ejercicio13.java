import java.util.ArrayList;

/*13.- Programa que lee una secuencia de 10 números y muestra el mayor de los múltiplos de 5, y el menor de los
múltiplos de 3. Si no hubiera ningún múltiplo, el programa lo indicaría.
*/
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>numeros=new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int numero=Teclado.leerInt("dime un numero");
			numeros.add(numero);
		}
		
		int multiplo5=0;
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i)%5==0 && numeros.get(i)>multiplo5) {
				multiplo5=numeros.get(i);
			}
		}
		
		if(multiplo5==0) {
			System.out.println("no hay multiples de 5");
		}else {
			System.out.println("el multiplo de 5 mayor es: "+ multiplo5);
		}
		
		
		int multiplo3=0;
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i)%3==0 ) {
				if(multiplo3==0) {
					multiplo3=numeros.get(i);
				}else {
					if(numeros.get(i)<multiplo3) {
						multiplo3=numeros.get(i);
					}
				}
			}
		}
		
		if(multiplo3==0) {
			System.out.println("no hay multiples de 3");
		}else {
			System.out.println("el multiplo de 3 menor es: "+ multiplo3);
		}
		
		
	}

}
