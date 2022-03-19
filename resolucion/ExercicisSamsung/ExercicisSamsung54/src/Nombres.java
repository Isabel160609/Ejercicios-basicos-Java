import java.util.ArrayList;

public class Nombres {
	private int capacitatArray;
	private ArrayList<String>  nombres;
	
	public Nombres(int capacitatArray) {
		this.capacitatArray=capacitatArray;
		nombres=new ArrayList<String>();
	}

	public int getCapacitatArray() {
		return capacitatArray;
	}

	public void setCapacitatArray(int capacitatArray) {
		this.capacitatArray = capacitatArray;
	}

	public ArrayList<String> getNombres() {
		return nombres;
	}

	public void setNombres(ArrayList<String> nombres) {
		this.nombres = nombres;
	}
	
	public boolean anadir(String nombre) {
		boolean add =true;
		if (nombres.size()==capacitatArray) {
			add=false;
		}
		for(int i=0;i<nombres.size();i++) {
			if (nombres.get(i).equalsIgnoreCase(nombre)) {
				add=false;
			}
		}
		if (add) {
			nombres.add(nombre);
		}
		return add;
	}
	public void listarNombres() {
		for(int i=0;i<nombres.size();i++) {
			System.out.println(nombres.get(i));
		}
	}
	   public void encontrarNombre(String nombre) {
	    	
	    	for(int i =0;i<nombres.size();i++) {
	    		if (nombres.get(i).contains(nombre)) {
	    			System.out.println(nombres.get(i));
	    		}
	    	}
	    }
	   public boolean eliminar(String nombre) {
	        boolean resultado = false;
	        for (int i = 0; i < nombres.size(); i++) {
	            if (nombres.get(i).equalsIgnoreCase(nombre)) {
	            	nombres.remove(i);
	                resultado = true;
	            }
	        }
	        return resultado;
	    }
	   public void vaciar() {
			nombres.clear();
			System.out.println("lista vaciada");
		}
}
