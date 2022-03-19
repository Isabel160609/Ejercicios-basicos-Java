import java.util.ArrayList;

/*34.- Realiza un programa que lea números enteros desde teclado hasta que se introduzcan 12 impares sin repetir.*/
public class Ejercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> numeros=new ArrayList <Integer> ();
		int numero;
		while(numeros.size()!=12) {
			numero=Teclado.leerInt("Por favor introducir un numero");
			if(numero%2!=0&&!esta(numero, numeros)) {
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
