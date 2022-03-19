/*48.- Realiza un programa que sume todos los números pasados por línea de comando:
$java Suma 4 67.6 9 2
$La suma es 82.6*/
public class Ejercicio48 {

	public static void main(String[] args) {
		int numero;
		int suma=0;
		// TODO Auto-generated method stub
		do {
			 numero=Teclado.leerInt("Dame un numero");
			 suma+=numero;
		}while(numero!=0);
		System.out.println(suma);
	}

}
