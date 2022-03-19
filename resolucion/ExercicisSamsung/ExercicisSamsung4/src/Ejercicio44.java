/*44.- Realiza un programa que lea un número entero y nos diga si es par o impar y si es capicúa
o no.*/
public class Ejercicio44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero=Teclado.leerInt("Introduce un numero");
		
		if(esPar(numero)) {
			System.out.println("el numero es par");
		}else {
			System.out.println("el numero es impar");
		}
		
		if(esCapICua(numero)) {
			System.out.println("el numero es cap i cua");
		}else {
			System.out.println("el numero no es cap i cua");
		}
		
	}
	static boolean esPar(int numero) {
		boolean esPar=false;
		if(numero%2==0) {
			esPar=true;
		}
		
		return esPar;
	}
	static boolean esCapICua(int numero) {
		boolean esCapICua=false;
		int numeroInvertido=invertirNumero(numero);
		
		if(numero==numeroInvertido) {
			esCapICua=true;
		}
		
		return esCapICua;
	}
	
	static int invertirNumero(int numero) {
		int numeroInverso=0;
		for (int i= Integer.toString(numero).length();i>0;i--) {
			
			numeroInverso=(numeroInverso*=10)+numero%10;
			numero/=10;
		}
		return numeroInverso;
	}
}
