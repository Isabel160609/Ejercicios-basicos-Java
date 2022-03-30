/*1.- Programa que lee dos números desde consola y nos muestra su suma y el resultado de la división del primero
entre el segundo.*/
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =Teclado.leerInt("Introduce un numero");
		int b =Teclado.leerInt("Introduce oto numero");
		
		System.out.println("la suma es: "+(a+b));
		System.out.println("la division es: "+((double)a/(double)b));
	}

}
