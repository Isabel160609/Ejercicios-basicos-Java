/*5.- Programa que nos informa si un n�mero introducido es primo o no. NOTA: Un n�mero es primo si tiene dos
�nicos divisores que son el 1 y �l mismo.*/
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Teclado.leerInt("dime un numero");
		boolean  isPrimo=true;
		for (int i =2;i<a/2;i++) {
			if(a%i==0) {
				isPrimo=false;
			}
		}
		
		if (isPrimo) {
			System.out.println("es un numero primo");
		}else {
			System.out.println("no es un numero primo");
		}
	}

}
