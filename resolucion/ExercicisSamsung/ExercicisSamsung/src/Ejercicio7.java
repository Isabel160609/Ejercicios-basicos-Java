/*7.- Programa que pide el n�mero de calificaciones decimales a introducir, y una nota de corte. A continuaci�n se
introducir�n las calificaciones, para finalmente indicar cu�ntas calificaciones han igualado o superado la nota de
corte.*/
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numCalificaciones=Teclado.leerInt("cuantas calificaciones quiere introducir");
		float notaCorte=Teclado.leerFloat("cual es la nota de corte?");
		
		int contador=0;
		for (int i =0;i<numCalificaciones;i++) {
			float nota=Teclado.leerFloat("cual es la nota?");
			if(nota>=notaCorte) {
				contador+=1;
			}
		}
		
		System.out.println("la cantidad de calificaciones que han igualado o superado la nota de corte son: "+ contador);
	}

}
