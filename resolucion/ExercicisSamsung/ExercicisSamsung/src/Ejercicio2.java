import java.util.ArrayList;

/*2.- Programa que lee 11 números comprendidos entre el 20 y 40, ambos inclusive. En el caso en el que algún
número introducido no se encontrara dentro del rango permitido, se mostrará un mensaje de error y seguirá
pidiendo números. El programa finalizará cuando se hayan introducido 11 números válidos y mostrará el número
máximo introducido de los 11 válidos. Además indicará cuántos números de los introducidos no han sido válidos.
*/
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros= new ArrayList<Integer>();
		int contador=0;
		int numMax=0;
		while(numeros.size()<11) {
			
			int numero= Teclado.leerInt("introduce un numero entre 20 y 40");
			
			if (numero>=20 && numero<=40) {
				numeros.add(numero);
				if (numero>numMax) {
					numMax=numero;
				}
			}else {
				contador+=1;
				System.out.println("este numero no es valido"); 
			}
				
		}
		System.out.println("el numero maximo introducido es: "+ numMax);
		System.out.println("se han introucido "+contador+" numeros erroneos");
	}

}
