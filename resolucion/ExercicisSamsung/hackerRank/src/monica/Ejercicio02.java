package monica;

import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio02 {

	/* Declaro un Scanner para leer desde teclado */
	public static Scanner sc = new Scanner(System.in);

	/* Declaro un array tipo double de tama�o 5 */
	public static String[][] myArray = {

			{ "E.T" + " " + "8" + " " + "5" + " " + "10" + " " + "4" },
			{ "Sharknado" + " " + "3" + " " + "8" + " " + "9" + " " + "7" },
			{ "Godzilla" + " " + "9" + " " + "7" + " " + "6" + " " + "8" }, };

	public static String stringIntroducido; /* Variable para recoger el valor introducido por el usuario */
	public static int esNumeroEntero;
	public static int opcionSeleccionada; /* variable para mostrar que el valor introducido es un n�mero */

	public static void main(String[] args) {

		/* Con un do-while mostramos el men� hasta que se introduzca un 0 */
		do {
			/* Mostramos el men� */
			System.out.println("=========================================");
			System.out.println("Introduzca la operaci�n a realizar del siguiente men� de opciones:");
			System.out.println("1. Mostrar el nombre y puntuaciones de todas las pel�culas.");
			System.out.println("2. Modificar el nombre de una pel�cula seg�n su posici�n en el array. ");
			System.out.println("3. Modificar una puntuaci�n de una pel�cula seg�n su posici�n en el array.");
			System.out.println(
					"4. Mostrar las puntuaciones de una pel�cula en concreto seleccionada seg�n su posici�n en el array.");
			System.out.println("0 Finalizar.");

			opcionSeleccionada = pideEntero();/* Guardo el n�mero introducido en una variable */

			/* Si es menor que 0 y mayor que 4 que son las opciones */
			if (opcionSeleccionada < 0 && opcionSeleccionada > 4) {
				System.out.println("Valor introducido no v�lido");
			}

			switch (opcionSeleccionada) {

			case 1:
				/* Mostrar el nombre y puntuaciones de todas las pel�culas */
				mostrarArray(myArray);
				break;

			case 2:

				break;

			case 3:
				/*
				 * Modificar una puntuaci�n de una pel�cula seg�n su posici�n en el array
				 */
				modificaPuntuacionPelicula(myArray);
				break;

			case 4:
				/*
				 * Mostrar las puntuaciones de una pel�cula en concreto seleccionada seg�n su
				 * posici�n en el array.
				 */
				mostrarPuntuacionesPelicula(myArray);
				break;
			}

			/*
			 * Si el usuario introduce un 0, se ha de mostrar un mensaje de despedida y
			 * finalizar el programa
			 */
		} while (opcionSeleccionada != 0);

	}

	/*
	 * pideEntero() que no reciba ning�n par�metro y retorne un valor entero. La
	 * funci�n ha de pedir un n�mero por consola (si el usuario no introduce un
	 * n�mero se ha de volver a pedirlo repitiendo el proceso hasta que el usuario
	 * introduzca un valor num�rico v�lido) y retornar el n�mero introducido.
	 */
	public static int pideEntero() {
		boolean esNumero = false;
		do {
			System.out.println("�Qu� opci�n de las del men� quieres realizar? ");
			stringIntroducido = sc.nextLine();
			if (isNum(stringIntroducido)) {
				esNumero = true; // Si es n�mero dejamos de pedir el valor
			} else {
				System.out.println("El valor introducido no es un n�mero. Introduce por favor una opci�n v�lida.");
			}
		} while (esNumero != true);

		return Integer.parseInt(stringIntroducido);
	}

	/* Funci�n para verificar que es un n�mero el valor introducido */
	public static boolean isNum(String strNum) {
		boolean respuesta = true;
		try {
			Integer.parseInt(strNum);// Si es posible parsearlo por lo que el String es un n�mero
		} catch (NumberFormatException e) {
			respuesta = false;
		}
		return respuesta;
	}

	/*
	 * mostrarInfoPeliculas (String[][] puntuaciones) : recibe el array de
	 * puntuaciones y lo muestra.
	 */
	public static void mostrarArray(String[][] puntuaciones) {
		System.out.println("===============================================");
		System.out.println("Array de pel�culas y sus puntuaciones:");

		for (int i = 0; i < puntuaciones.length; i++) {
			for (int j = 0; j < puntuaciones[i].length; j++) {
				System.out.print(puntuaciones[i][j]);
			}
			System.out.println();
		}
	}

	/* Verifica que una posici�n es correcta */
	public static boolean existe(String[][] array, int posicion) {
		boolean existe = true;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i].length > posicion) {
					existe = false;
					System.out.println("No existe la posici�n dada");
				}
			}
		}
		return existe;
	}

	/*
	 * modificaPuntuacionPelicula (String[][] puntuaciones) : modifica una
	 * puntuaci�n de una pel�cula seg�n su posici�n en el array.
	 */
	public static int encontrarPelicula(String[][] puntuaciones, String pelicula) {

		int posicionI = -1;
		for (int i = 0; i < puntuaciones.length; i++) {
			for (int j = 0; j < puntuaciones.length; j++) {
				if (puntuaciones[i][j].equalsIgnoreCase(pelicula)) {
					posicionI = i;
				}
			}
		}
		return posicionI;
	}

	public static void modificaPuntuacionPelicula(String[][] puntuaciones, String pelicula, int posicion,
			int puntuacionNueva) {

		int posicionI = encontrarPelicula(puntuaciones, pelicula);
		for (int i = 0; i < puntuaciones.length; i++) {
			for (int j = 0; j < puntuaciones.length; j++) {
				if (posicionI == i & posicion == j) {
					puntuaciones[i][j] = "puntuacionNueva";
				}
			}
		}

	}

	/*
	 * mostrarPuntuacionesPelicula (String[][] puntuaciones) : muestra las
	 * puntuaciones de una pel�cula en concreto seleccionada seg�n su posici�n en el
	 * array..
	 */
	public static void mostrarPuntuacionesPelicula(String[][] puntuaciones) {

		boolean nombreCorrecto = false;

		do {
			System.out.println("�De que pel�cula quieres recibir informaci�n?");
			String nombrePelicula = sc.nextLine();

			if (nombrePelicula.equalsIgnoreCase("E.T.")) {
				System.out.print("Las puntuaciones son: ");
				System.out.print(puntuaciones[0][0]);
				nombreCorrecto = true;
			} else if (nombrePelicula.equalsIgnoreCase("Sharknado")) {
				System.out.print("Las puntuaciones son: ");
				System.out.print(puntuaciones[1][0]);
				nombreCorrecto = true;
			} else if (nombrePelicula.equalsIgnoreCase("Godzilla")) {
				System.out.print("Las puntuaciones son: ");
				System.out.print(puntuaciones[1][0]);
				nombreCorrecto = true;
			} else {
				System.out.println("El nombre de pelicula introducido no es correcto.");
			}
			System.out.println();
		} while (nombreCorrecto != true);

	}

}