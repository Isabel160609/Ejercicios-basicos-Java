/*15.- Programa que genera los N primeros n�meros de la serie de Fibonacci. El valor N deber� ser le�do por el
teclado. NOTA: Los dos primeros n�meros son 1, y el resto se obtiene sumando los dos anteriores:
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
