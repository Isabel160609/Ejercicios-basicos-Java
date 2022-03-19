import java.util.ArrayList;

/*2.- Programa que lee 11 n�meros comprendidos entre el 20 y 40, ambos inclusive. En el caso en el que alg�n
n�mero introducido no se encontrara dentro del rango permitido, se mostrar� un mensaje de error y seguir�
pidiendo n�meros. El programa finalizar� cuando se hayan introducido 11 n�meros v�lidos y mostrar� el n�mero
m�ximo introducido de los 11 v�lidos. Adem�s indicar� cu�ntos n�meros de los introducidos no han sido v�lidos.
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
