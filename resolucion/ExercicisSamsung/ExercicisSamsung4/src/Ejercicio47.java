/*47.- Realiza un programa que lea dos cadenas de caracteres. Se mostrarán entrelazadas,
empezando por la primera.
Ejemplo:
Cadena 1: abcdefg
Cadena 2: 1234
Resultado: a1b2c3d4efg*/
public class Ejercicio47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1=Teclado.leerString("introduce una cadena");
		String cadena2=Teclado.leerString("introduce otra cadena");
		
		System.out.println(entrelazaCadenas(cadena1,cadena2));
	}
	public static String entrelazaCadenas(String cadena1,String cadena2){
		char[] aCadena1 = cadena1.toCharArray();
		char[] aCadena2 = cadena2.toCharArray();
		int longitud1=cadena1.length();
		int longitud2=cadena2.length();
		String nuevaCadena="";
		if (longitud1<longitud2) {
			for(int i =0;i<cadena1.length();i++) {
				nuevaCadena+=String.valueOf(aCadena1[i])+String.valueOf(aCadena2[i]);
			}
			for(int i =cadena1.length();i<cadena2.length();i++) {
				nuevaCadena+=String.valueOf(aCadena2[i]);
			}
		}else if(longitud1>longitud2) {
			for(int i =0;i<cadena2.length();i++) {
				nuevaCadena+=String.valueOf(aCadena1[i])+String.valueOf(aCadena2[i]);
			}
			for(int i =cadena2.length();i<cadena1.length();i++) {
				nuevaCadena+=String.valueOf(aCadena1[i]);
			}
		}else {
			for(int i =0;i<cadena1.length();i++) {
				nuevaCadena+=String.valueOf(aCadena1[i])+String.valueOf(aCadena2[i]);
			}
		}
		return nuevaCadena;
	}
}
