/*50.- Realiza un programa que lea una frase y muestre las palabras en el orden inverso.
Ejemplo:
Cadena: Me gusta programar.
Resultado: programar. Gusta Me*/
public class Ejercicio50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase=Teclado.leerString("introduce una frase");
		System.out.println(fraseInvertida(frase));
	}
	public static String fraseInvertida(String frase) {
		String []aFrase=frase.split(" ");
		String FraseInversa="";
		
		for(int i =(aFrase.length-1);i>=0;i--) {
			FraseInversa+=aFrase[i]+" ";
			
		}
		return FraseInversa;
	}
}
