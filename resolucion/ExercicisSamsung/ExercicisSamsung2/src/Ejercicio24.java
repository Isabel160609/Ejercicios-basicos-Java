import java.util.ArrayList;

/*24.- Realiza un programa que lea 20 números decimales y al final muestre la media de todos ellos y los que son
superiores a dicha media*/
public class Ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<Double> numeros= new ArrayList<Double>();
		 double numero;
		 double sumaTotal=0;
		 double media;
		 
		   for (int i = 0; i<20; i++) {
			    
			      numero = Teclado.leerDouble("introduce un numero");
			      numeros.add(numero);
			      sumaTotal+=numero;
			    }  
		   
		   media=sumaTotal/numeros.size();
		   
		   System.out.println("la media es: "+ media);
		   
		   for (int i = 0; i<numeros.size(); i++) {
			   if (numeros.get(i)>media) {
				   System.out.print(numeros.get(i)+ " ");
			   }
		   }
	}

}
