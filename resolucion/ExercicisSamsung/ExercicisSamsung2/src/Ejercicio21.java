import java.util.ArrayList;

/*21.- Realiza un programa que lea números enteros desde teclado hasta que se introduzcan 9, o bien hasta que se
introduzca un número repetido. Al acabar el programa mostrará los números introducidos, sin incluir el número repetido
en caso de existir*/
public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros=new ArrayList<Integer>();
		int numero;
		boolean repetido=false;
		while(numeros.size()!=9 && !repetido) {
			numero=Teclado.leerInt("dame un numero");
			for (int j =0;j<numeros.size();j++) {
				if(numeros.get(j)==numero) {
					System.out.println("Repetido");
					repetido=true;
					
				}
			}
			if (!repetido){
				numeros.add(numero);
				
			}
		
		}
		System.out.println(numeros);
	
	}

}
