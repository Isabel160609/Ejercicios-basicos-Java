/*14.- Programa que lee un número y muestra la suma de sus divisores, sin incluir el propio número.*/
public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=Teclado.leerInt("dime un numero");
		
		int sumaDivisores=0;
		for (int i = 2; i < numero; i++) {
			if(numero%i==0) {
				sumaDivisores+=i;
			}
		}
		System.out.println(sumaDivisores);
	}

}
