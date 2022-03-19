import java.util.ArrayList;

/*4.- Programa que muestra todos los divisores de un número introducido. Entre los divisores no se incluirá el
propio número.*/
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numeros= new ArrayList<Integer>();
		int a=Teclado.leerInt("dime un numero");
		for (int i =1;i<a;i++) {
			if(a%i==0) {
				numeros.add(i);
			}
		}
		System.out.print("los divisores de "+ a+ " son: " );
		imprimirArray(numeros);
		
	}
	static void imprimirArray(ArrayList<Integer> numeros) {
		for (int i =1;i<numeros.size();i++) {
			System.out.print(numeros.get(i) + " ");
		}
		System.out.println();
	}
}

