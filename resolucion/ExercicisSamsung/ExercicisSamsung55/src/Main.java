import java.util.ArrayList;

/*55.- Crea una clase llamada Empleado:
� Con los atributos privados nombre, y tel�fono, de tipo String.
� El constructor necesitar� el nombre y el tel�fono.
� Implementa los m�todos necesarios para acceder a estos dos atributos de manera p�blica
(getters y setters).
� A�ade el atributo est�tico y privado numeroEmpleados. Este atributo almacenar� el n�mero de
instancias que se han creado de la clase Empleado.
� Implementa un m�todo p�blico para conocer el valor de numeroEmpleados. Ll�malo
getNumeroEmpleados.
� Crea una clase aparte con el m�todo main:
� Crea un array de 4 empleados. Los datos de cada empleado ser� leidos por consola.
� Muestra los datos de cada empleado del array.
� Llama al m�todo getNumeroEmpleados para mostrar el n�mero de empleados
instanciados.*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Empleado> listaEmpleados= new ArrayList<Empleado>();
		for (int i=0;i<2;i++) {
			Empleado empleado=new Empleado(Teclado.leerString("cual es el nombre: "),
											Teclado.leerString("cual es el telefono: "));
			listaEmpleados.add(empleado);
		}
		
		for (int i=0;i<listaEmpleados.size();i++) {
			System.out.println("nombre: "+listaEmpleados.get(i).getNombre()+" telefono: "
									+listaEmpleados.get(i).getTelefono());
		}
		
		System.out.println(listaEmpleados.get(0).getNumeroEmpleados());
		
	}

}
