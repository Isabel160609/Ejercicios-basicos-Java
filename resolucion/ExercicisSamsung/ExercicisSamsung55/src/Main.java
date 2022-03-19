import java.util.ArrayList;

/*55.- Crea una clase llamada Empleado:
• Con los atributos privados nombre, y teléfono, de tipo String.
• El constructor necesitará el nombre y el teléfono.
• Implementa los métodos necesarios para acceder a estos dos atributos de manera pública
(getters y setters).
• Añade el atributo estático y privado numeroEmpleados. Este atributo almacenará el número de
instancias que se han creado de la clase Empleado.
• Implementa un método público para conocer el valor de numeroEmpleados. Llámalo
getNumeroEmpleados.
• Crea una clase aparte con el método main:
• Crea un array de 4 empleados. Los datos de cada empleado será leidos por consola.
• Muestra los datos de cada empleado del array.
• Llama al método getNumeroEmpleados para mostrar el número de empleados
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
