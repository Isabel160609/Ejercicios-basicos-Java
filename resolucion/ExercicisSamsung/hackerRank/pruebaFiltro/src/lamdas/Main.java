package lamdas;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		List<String> cadenes = new ArrayList<String>();
		cadenes.add("Lola");
		cadenes.add("Ana");
		cadenes.add("Francesc");
		cadenes.add("Pol");
		cadenes.add("Alex");
		
		List<String> numeros= new ArrayList<String>();
		 numeros.add("1");
		 numeros.add("2");
		
		
		//para ordenar
//		System.out.println("ordenar");
//		cadenes.sort((x,y)->x.compareTo(y));
		//para recorrer
		System.out.println("recorrer");
		cadenes.forEach(System.out::println);
		System.out.println("recorrer");
		cadenes.forEach(x-> System.out.println(x));
		//para quitar si
		System.out.println("eliminar con if");
		cadenes.removeIf(x-> x.equalsIgnoreCase("Lola"));
		System.out.println(cadenes);
		
		//metodos Stream
		System.out.println("filtrar mal impreso");
		//para filtrarlas que llevan A pero como no lo asigne a variable no lo guarda
		cadenes.stream().filter(x->x.startsWith("A"));
		System.out.println(cadenes);
		System.out.println("filtrar  impreso");
		//si ademas quiero imprimir utilizo el foreach y solo imprime lo filtrado
		cadenes.stream().filter(x->x.startsWith("A")).forEach(System.out::println);
		System.out.println("ordenar impreso");
		//utilizo funcion ordenar
		cadenes.stream().sorted().forEach(System.out::println);
		System.out.println("ordenar al reves impreso");
		//utilizo funcion ordenar a la inversa
		cadenes.stream().sorted((x,y)->y.compareTo(x)).forEach(System.out::println);
		System.out.println("transformar a mayusculas");
		//voy a transformar por ejemplo volvendo todas las letras a mayusculas
		cadenes.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println("transformar a numeros y sumar 1");
		//voy a pasar el string aint y sumarle 1
		numeros.stream().map(x->Integer.parseInt(x)+1).forEach(System.out::println);
		System.out.println("recorremos con un limite");
		//recorro hasta el limite que marco empezando en 1
		cadenes.stream().limit(2).forEach(System.out::println);
		System.out.println("contar");
		//cuenta lo que hay en la lista
		long x=cadenes.stream().count();
		System.out.println(x);
	}

}
