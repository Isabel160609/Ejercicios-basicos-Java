import java.util.ArrayList;

/*17.- Programa que lee 3 números y los muestra ordenados de manera descendente*/
public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>numeros=new ArrayList<Integer>();
		for (int i =0;i<3;i++) {
			int numero=Teclado.leerInt("dime un numero");
			numeros.add(numero);
		}
		
		if (numeros.get(0)<numeros.get(1)) {
			if (numeros.get(2)<numeros.get(1)) {
				if(numeros.get(2)<numeros.get(0)) {
					System.out.println(numeros.get(1)+ " "+ numeros.get(0)+ " "+numeros.get(2));
				}else {
					System.out.println(numeros.get(1)+ " "+ numeros.get(2)+ " "+numeros.get(0));
				}
			}else {
				System.out.println(numeros.get(2)+ " "+ numeros.get(1)+ " "+numeros.get(0));
			}
		}else {
			if (numeros.get(2)<numeros.get(0)) {
				if(numeros.get(1)<numeros.get(2)) {
					System.out.println(numeros.get(0)+ " "+ numeros.get(2)+ " "+numeros.get(1));
				}else {
					System.out.println(numeros.get(0)+ " "+ numeros.get(1)+ " "+numeros.get(2));
					}
				}else {
					System.out.println(numeros.get(2)+ " "+ numeros.get(0)+ " "+numeros.get(1));
				}
		}
	}

}
