package prueba;

public class Main {
	
	static String[][] pelis= {{"peli1","2","2"},{"peli2","3","3"},{"peli3","4","4"}};
	public static void main(String[] args) {
	
	
	for (int i =0;i<pelis.length;i++) {
		for (int j =0;j<pelis.length;j++) {
			if(pelis[i][j].equalsIgnoreCase("peli1")) {
				pelis[i][2]="3";
			}
		}
	}
	for (int i =0;i<pelis.length;i++) {
		for (int j =0;j<pelis.length;j++) {
			System.out.println(pelis[i][j]);
			}
		}
	
	
	pelis[1][1]="3";
	
	double uno=12.55;
	String hola="12.55";
	System.out.println();
	System.out.println(hola.length());
	
	
	}
	static boolean existe(String pelicula,int posicion) {
		boolean existe=true;
		for (int i =0;i<pelis.length;i++) {
			for (int j =0;j<pelis.length;j++) {
				if(pelis[i][j].equalsIgnoreCase("peli1")) {
					if (pelis[i].length>posicion) {
						existe=false;
					}
				}
			}
		}
		return existe;
		
	}
	}
