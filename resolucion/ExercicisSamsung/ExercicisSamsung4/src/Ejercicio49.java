/*49- Realiza un programa que lea una cadena y nos diga si está en mayúsculas o no.*/
public class Ejercicio49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena=Teclado.leerString("Introduce una cadena");
		System.out.println(mayusculas(cadena));
	}
	public static boolean mayusculas(String cadena) {
		boolean mayusculas = true;
		String cadenaMin=cadena.toLowerCase();
		if (cadena.equals(cadenaMin)) {
			mayusculas=false;
		}
		return mayusculas;
	}
}
