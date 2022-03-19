/*10.- Programa que lee 10 números e indica si todos los números son iguales o no.*/
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=Teclado.leerInt("dime un numero");
		
		boolean sonIguales=true;
		for (int i =0;i<10;i++) {
			int numero2=Teclado.leerInt("dime un numero");
			if (numero!=numero2) {
				sonIguales=false;
			}
			
		}
		if (sonIguales) {
			System.out.println("todos los numeros son iguales");
		}else {
			System.out.println("no todos los numeros son iguales");
		}
	}

}
