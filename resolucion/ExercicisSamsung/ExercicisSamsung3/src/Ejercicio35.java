import java.util.ArrayList;

/*35.- Realiza un programa que lea 8 números y los muestre de manera descendente.*/
public class Ejercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> numeros=new ArrayList <Integer> ();
		int numero;
		for(int i=0;i<8;i++) {
			numero=Teclado.leerInt("Por favor introducir un numero");
			numeros.add(numero);
		}
		int aux;
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				
			if (numeros.get(j)<numeros.get(j+1)) {
				aux=numeros.get(j);
				numeros.set(j, numeros.get(j+1));
				numeros.set(j+1, aux);
				}
			}
				
		}
		System.out.println(numeros);
	}
	

}
