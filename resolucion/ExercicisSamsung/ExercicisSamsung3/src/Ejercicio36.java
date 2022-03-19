import java.util.ArrayList;

/*36.- Realiza un programa que termine cuando el usuario haya metido todos los números comprendidos entre el 1
y el 10.
*/
public class Ejercicio36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> numeros=new ArrayList <Integer> ();
		int numero;
		while(numeros.size()!=10) {
			numero=Teclado.leerInt("Por favor introducir un numero");
			if(!esta(numero, numeros) && numero>0 && numero<=10) {
				numeros.add(numero);
			}
			
		}
	}
	static boolean esta(int numero,ArrayList <Integer> numeros) {
	 boolean numeroRepetido=false;
	 int i=0;
	 while(numeroRepetido==false && i<numeros.size()) {
		 if(numeros.get(i)==numero) {
			 numeroRepetido=true;
		 }
		 i++;
	 }
	 
	 return numeroRepetido;
 }
}
