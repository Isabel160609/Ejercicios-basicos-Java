/*51.- Realiza un programa que lea una cadena y elimine las letras ‘a’ que pudiera contener.
Finalmente se mostrará la cadena.
Ejemplo:
Cadena: Hace buen día.
Resultado: Hce buen dí.*/
public class Ejercicio51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase=Teclado.leerString("introduce una frase");
		char [] aFrase=frase.toCharArray();
		String fraseSinA="";
		for(int i =0;i<aFrase.length;i++) {
			if (!String.valueOf(aFrase[i]).equalsIgnoreCase("a")) {
				fraseSinA+=String.valueOf(aFrase[i]);
			}
		}
		System.out.println(fraseSinA);
	}

}
