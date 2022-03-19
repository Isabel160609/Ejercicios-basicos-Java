/*52.- Crea una clase llamada Veh�culo:
� Con los atributos privados numeroRuedas, velocidadMaxima, velocidadActual y peso.
� Implementa los m�todos necesarios para acceder a estos atributos de manera p�blica
(getters y setters).
� La clase dispondr� de un constructor que necesitar� como par�metros los valores
iniciales para todos sus atributos.
� Crea un m�todo p�blico que devuelva boolean, llamado esIgual(Vehiculo vehiculo) que
sirva para comparar dos veh�culos, de manera que devuelva true o false dependiendo
de si son iguales o no (se consideran iguales si el valor de todos sus atributos es el
mismo). El m�todo recibir� como argumento un objeto de la clase Veh�culo.
� Crea un m�todo p�blico que devuelva void llamado copia(Vehiculo vehiculo) que
copiar� los atributos de un veh�culo en otro. El m�todo recibir� como par�metro un
objeto de la clase Veh�culo del cual se copiar�n sus valores.
� Crea una clase aparte con el m�todo main para probar las funcionalidades de la clase
Veh�culo.
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
