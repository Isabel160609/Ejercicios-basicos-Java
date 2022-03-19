/*42.- Realiza un programa que lea una frase y nos la muestre al revés.*/
public class Ejercicio42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase=Teclado.leerString("inserte una frase");
		char [] fraseCadena=frase.toCharArray();
		String fraseInversa="";
		
		for (int i=frase.length()-1;i>=0;i--) {
			fraseInversa+=fraseCadena[i];
		}
		System.out.println(fraseInversa);
	}

}
