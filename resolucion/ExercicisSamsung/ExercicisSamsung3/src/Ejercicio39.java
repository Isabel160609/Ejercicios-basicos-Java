/*39.- Realiza un programa que lea un array de enteros de tamaño 10. Se deberá invertir la ubicación de los
elementos y posteriormente mostrarlo:
2 5 5 9 14 4 0 7 3 1
1 3 7 0 4 14 9 5 5 2*/
public class Ejercicio39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arrayOriginal=new int[10];
		for (int i=0;i<10;i++) {
			arrayOriginal[i]=Teclado.leerInt("introduce numero");
		}
		int[]arrayInvertida=invertirArray(arrayOriginal);
		for (int i=0;i<arrayOriginal.length;i++) {
			System.out.print(arrayInvertida[i]);
		}

	}
	public static int[] invertirArray(int[]arrayOriginal) {
		int aux;
		int j=arrayOriginal.length-1;
		for (int i=0;i<(arrayOriginal.length/2);i++) {
			aux=arrayOriginal[i];
			arrayOriginal[i]=arrayOriginal[j];
			arrayOriginal[j]=aux;
			j--;
		}
		return arrayOriginal;
	}
}
