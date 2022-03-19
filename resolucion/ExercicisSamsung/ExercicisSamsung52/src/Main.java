/*52.- Crea una clase llamada Vehículo:
• Con los atributos privados numeroRuedas, velocidadMaxima, velocidadActual y peso.
• Implementa los métodos necesarios para acceder a estos atributos de manera pública
(getters y setters).
• La clase dispondrá de un constructor que necesitará como parámetros los valores
iniciales para todos sus atributos.
• Crea un método público que devuelva boolean, llamado esIgual(Vehiculo vehiculo) que
sirva para comparar dos vehículos, de manera que devuelva true o false dependiendo
de si son iguales o no (se consideran iguales si el valor de todos sus atributos es el
mismo). El método recibirá como argumento un objeto de la clase Vehículo.
• Crea un método público que devuelva void llamado copia(Vehiculo vehiculo) que
copiará los atributos de un vehículo en otro. El método recibirá como parámetro un
objeto de la clase Vehículo del cual se copiarán sus valores.
• Crea una clase aparte con el método main para probar las funcionalidades de la clase
Vehículo.
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo coche1=new Vehiculo(20,20,20,20);
		Vehiculo coche2=new Vehiculo(30,30,20,20);
		System.out.println(coche1.esIgual(coche2));
		coche1.copia(coche2);
		System.out.println(coche1.esIgual(coche2));
	}

}
