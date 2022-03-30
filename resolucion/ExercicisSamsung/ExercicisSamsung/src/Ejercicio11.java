/*11.- Programa que muestra los números primos existentes entre el 1 y el 100.
*/
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i =2;i<=100;i++) {
			if (esPrimo(i)) {
				System.out.print(i+" ");
			}
		}
	}

	static boolean esPrimo(int numero) {
		boolean isPrimo = true;
		for (int i = 2; i < numero / 2; i++) {
			if (numero % i == 0) {
				isPrimo = false;
			}

		}
		return isPrimo;
	}
}
