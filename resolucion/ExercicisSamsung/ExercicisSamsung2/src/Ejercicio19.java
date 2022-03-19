import java.util.ArrayList;

/*19.- Realiza un programa que lea desde teclado 11 números enteros, para posteriormente mostrarlos en el orden
inverso al que fueron introducidos.
*/
public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numeros=new ArrayList<Integer>();
		int numero;
		for (int i =0;i<11;i++) {
			numero=Teclado.leerInt("dame un numero");
			numeros.add(numero);
		}
		for (int i =numeros.size()-1;i>=0;i--) {
			
		System.out.println(numeros.get(i)+ " ");
		}
	}

}
