/*9.- Programa consistente en un juego en el que el Jugador1 introduce un n�mero entre el 1 y el 100 y el Jugador2
tendr� que adivinarlo en un m�ximo de 10 intentos. Por cada intento del Jugador2 se mostrar� el mensaje �Te
pasaste�, o �No llegaste�, seg�n corresponda. El programa terminar� cuando se agoten los intentos y/o el
Jugador2 acierte el n�mero. Se ha de mostrar el mensaje correspondiente.*/
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroAleatorio = (int) (Math.random() * 10 + 1);
		System.out.println(numeroAleatorio);
		int ContadorVueltas = 0;
		int numero = 0;
		while (ContadorVueltas < 10 && numeroAleatorio != numero) {
			numero = Teclado.leerInt("dime un numero");
			if (numeroAleatorio < numero) {
				System.out.println("te pasaste");
			} else if (numeroAleatorio > numero) {
				System.out.println("no llegaste");
			}
			ContadorVueltas += 1;
		}
		if (ContadorVueltas < 9) {
			System.out.println("has acertado el numero");
		} else {
			System.out.println("se han agotado los intentos");
		}

	}
}
