/*15.- Programa que genera los N primeros números de la serie de Fibonacci. El valor N deberá ser leído por el
teclado. NOTA: Los dos primeros números son 1, y el resto se obtiene sumando los dos anteriores:
1,1,2,3,5,8,13,21...*/
public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroN=Teclado.leerInt("dime un numero");
		int numeroPrimero=0;
		int numeroSegundo=1;
		int suma=1;
		for (int i=0; i<numeroN;i++) {
		    
			System.out.print(suma+" ");
			suma =numeroPrimero+numeroSegundo;
			numeroPrimero=numeroSegundo;
			numeroSegundo=suma;
		}
	}

}
