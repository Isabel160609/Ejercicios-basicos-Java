import java.util.ArrayList;

/*33.- Realiza un programa que lea desde teclado 200 puntuaciones numéricas enteras que han de estar
comprendidas entre el 0 y el 5, ambos inclusive. Al finalizar se mostrará por cada una de las puntuaciones, su
frecuencia.
Frecuencias:
0: 23 veces.
1: 34 veces.
2: 0 veces.
3: 78 veces.
4: 54 veces.
5: 11 veces.*/
public class Ejercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> numeros=new ArrayList <Integer> ();
		int numero;
		int contador0=0;
		int contador1=0;
		int contador2=0;
		int contador3=0;
		int contador4=0;
		int contador5=0;
		for(int i=0;i<10;i++) {
			numero=Teclado.leerInt("Por favor introducir un numero entero del 0 al 5");
			if (numero>=0 && numero<6) {
				numeros.add(numero);
				switch(numero) {
				case 0:
					contador0++;
					break;
				case 1:
					contador1++;
					break;
				case 2:
					contador2++;
					break;
				case 3:
					contador3++;
					break;
				case 4:
					contador4++;
					break;
				case 5:
					contador5++;
					break;
				}
			}else {
				System.out.println("este numero no esta permitido");
				i--;
			}
			
			
		}
		System.out.println("0: "+contador0+" veces");
		System.out.println("1: "+contador1+" veces");
		System.out.println("2: "+contador2+" veces");
		System.out.println("3: "+contador3+" veces");
		System.out.println("4: "+contador4+" veces");
		System.out.println("5: "+contador5+" veces");
		
	}

}
