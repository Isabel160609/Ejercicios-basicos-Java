package pruebaFiltro;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cadenes = new ArrayList<String>();
		cadenes.add("Lola");
		cadenes.add("Ana");
		cadenes.add("Alex");
		cadenes.add("Francesc");
		cadenes.add("Pol");
//		cadenes.sort((x,y)->x.compareTo(y));
//		cadenes.forEach(System.out::println);
//		cadenes.forEach(x-> System.out.println(x));
//		cadenes.removeIf(x-> x.equalsIgnoreCase("Lola"));
//		System.out.println(cadenes);
		ArrayList<ArrayList<Character>> Llista = new ArrayList<ArrayList<Character>>();
		// char[] chars = cadenes.toString().toCharArray();
		ArrayList<Character> palabra = new ArrayList<Character>();
		char[] lletra;
		//ArrayList<Character> palabra2= new ArrayList<Character>();
		for (int i = 0; i < cadenes.size(); i++) {
			lletra = cadenes.get(i).toCharArray();
			palabra.clear();
			for (int j = 0; j < lletra.length; j++) {
				
				palabra.add(lletra[j]);
			}
			
			Llista.add((ArrayList<Character>) palabra.clone());
		}
		System.out.print(Llista);
	}

}
