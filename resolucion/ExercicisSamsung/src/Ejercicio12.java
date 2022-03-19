/*12.- Programa que muestra los 100 primeros número primos.*/
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		for (int i =2;contador<=100;i++) {
			if (esPrimo(i)) {
				System.out.print(i+" ");
				contador++;
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
