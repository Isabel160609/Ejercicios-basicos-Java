/*8.- Programa que lee 87 n�meros. Al finalizar mostrar� el m�ximo introducido, y cu�ntas veces se repite dicho
m�ximo.*/
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numMax=0;
		int contador=0;
		for (int i =0;i<5;i++) {
			int numero=Teclado.leerInt("dime un numero");
			if(numero>numMax) {
				numMax=numero;
				contador=1;
			}else if(numero==numMax) {
				contador+=1;
			}
		}
		System.out.println("el numero maximo es: " +numMax +" y se ha repetido "+ contador+" veces");
	}

}
