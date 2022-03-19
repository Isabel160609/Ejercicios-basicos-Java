import java.util.Arrays;

/*43.- Realiza un programa que lea 10 palabras, para posteriormente mostrarlas en orden
alfabético ascendente.*/
public class Ejercicio43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []palabras=  new String [10];
		for(int i =0;i<10;i++) {
			palabras[i]=Teclado.leerString("dame una palabra");
		}
		Arrays.sort(palabras); 
		 for (String i : palabras) {
	            System.out.print(i + ", ");
	        }
	}
	
}
