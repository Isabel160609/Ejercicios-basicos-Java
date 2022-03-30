/*18.- Programa que lee el nombre y edad en años de una serie de alumnos hasta introducir como nombre de
alumno “fin”. En ese momento mostrará la edad media de los alumnos y el nombre del alumno menor*/


public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre= " ";
		int edad=0;
		String nombreMenor=" ";
		int edadMenor=0;
		int sumaEdades=0;
		int numAlumnos=0;
		float mediaEdades;
		while(!nombre.equalsIgnoreCase("fin")) {
			
			nombre=Teclado.leerString("cual es el nombre del alumno");
			if(!nombre.equalsIgnoreCase("fin")) {
			edad= Teclado.leerInt("cual es la edad del alumno");
				sumaEdades+= edad;
				if (edadMenor==0 ||edad<edadMenor) {
					nombreMenor=nombre;
					edadMenor=edad;
				}
				numAlumnos+=1;
			}
		}
		mediaEdades=(float)sumaEdades/(float)numAlumnos;
		System.out.println(" la media de edades es: "+ mediaEdades);
		System.out.println(" el nombre del mas joven es es: "+ nombreMenor);
	}
	

}
