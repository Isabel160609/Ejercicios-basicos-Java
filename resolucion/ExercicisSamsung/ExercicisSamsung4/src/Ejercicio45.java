/*45.- Realiza un programa que lea cadenas hasta que se introduzca “fin”. Nos mostrará la
cadena con mayor longitud, sin contar la cadena “fin”. En caso de empate se mostrará la última
introducida de las que tienen esa mayor longitud.*/
public class Ejercicio45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadenaMasLarga="";
		String cadena="";
		do {
			cadena=Teclado.leerString("introduce una cadena ");
			if (cadena.length()>=cadenaMasLarga.length() && !cadena.equalsIgnoreCase("fin")) {
				cadenaMasLarga=cadena;
			}
		}while(!cadena.equalsIgnoreCase("fin"));
		System.out.println(cadenaMasLarga);
	}

}
