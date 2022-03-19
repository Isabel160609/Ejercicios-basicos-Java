package LamdasMap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer,String>map=new HashMap<Integer,String>();
		map.put(1, "Isa");
		map.put(2, "Ana");
		map.put(3, "Pepe");
		
		//Podemos imprimir un mapa sin tener que declarar las entry
		map.forEach((k,v)->System.out.println(("llave "+k+" valor "+v)));
		//otra manera de imprimir
		map.entrySet().stream().forEach(System.out::println);
		
		//podemos agregar una entrada
		map.putIfAbsent(4, "josep");
		map.entrySet().stream().forEach(System.out::println);
		//si pongo uno que ya esta no sobreescribe simplemente no inserta
		
		//tenemos otro metodo que opera si es presente
		map.computeIfPresent(3, (k,v)->k+v);
		System.out.println(map.get(3));
		//vemos que ha impreso k+v que es el nuevo valor de 3
		
		//si queremos tener un String que nos de valor de un map con esta funcion 
		//nos aseguraos que si hay valor de ese valor y si no almacenemos por defecto
		String valor=map.getOrDefault(5, "valor por defecto");
		System.out.println(valor);
		
		//Para filtrar partes de mapas
		Map<Integer,String> mapaRecolectado=map.entrySet().stream()
				.filter(e->e.getValue().startsWith("A")).collect(Collectors.toMap(p->p.getKey(), p->p.getValue()));
		
		mapaRecolectado.forEach((k,v)->System.out.println(("llave "+k+" valor "+v)));
		
		
	}

	
}
