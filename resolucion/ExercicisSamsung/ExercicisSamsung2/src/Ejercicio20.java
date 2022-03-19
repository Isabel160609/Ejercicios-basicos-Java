import java.util.ArrayList;

/*20.- Realiza un programa que lea desde teclado 7 números distintos. Si se introdujera un número repetido se mostrará
el mensaje “Repetido” y no será tenido en cuenta. Al acabar el programa mostrará los 7 números introducidos.*/
public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros=new ArrayList<Integer>();
		int numero;
		boolean repetido=false;
		while(numeros.size()!=7) {
			numero=Teclado.leerInt("dame un numero");
			for (int j =0;j<numeros.size();j++) {
				if(numeros.get(j)==numero) {
					System.out.println("Repetido");
					repetido=true;
					
				}
			}
			if (!repetido){
				numeros.add(numero);
				
			}else {
				repetido=false;
			}
		
		}
		System.out.println(numeros);
	}

}
