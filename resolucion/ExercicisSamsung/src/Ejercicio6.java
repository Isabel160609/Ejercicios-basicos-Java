import java.util.ArrayList;

/*6.- Programa que lee 9 números, y en el caso en el que el primero introducido sea igual al último, nos muestra la
media. En caso contrario, no se mostrará nada.*/
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros= new ArrayList<Integer>();
		
		for (int i =0;i<9;i++) {
			int numero=Teclado.leerInt("dime un numero");
			numeros.add(numero);
		}
		
		if (numeros.get(0)==numeros.get(8)){
			System.out.println("la edia de los numeros introducidos es: "+  media(numeros));
		}
	}
	static float media(ArrayList<Integer> numeros) {
		
		int sumaNumeros=0;
		for (int i =0;i<numeros.size();i++) {
			sumaNumeros+=numeros.get(i);
		}
		float media=(float)sumaNumeros/(float)numeros.size();
		return media;
	}
}
