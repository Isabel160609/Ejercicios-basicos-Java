/*3.- Programa que lee de manera consecutiva números hasta que se introducen dos números iguales seguidos.*/
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Teclado.leerInt("dime un numero");
		int b=Teclado.leerInt("dime un numero");;
		while(a!=b){
			a=b;
			b=Teclado.leerInt("dime un numero");
			
		}
	}

}
