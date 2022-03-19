/*16.- Programa que lee cantidades y precios de productos, para al final indicar el total de la factura. Si el importe
supera los 1000€ se aplicará un descuento del 5%. El programa finaliza al introducir una cantidad 0.*/
public class Ejercicio16 {
	
	public static void main(String[] args) {
		int cantidad=0;
		float precio=0;
		float importeTotal=0;
		float precioarticulos;
			do {
				 cantidad=Teclado.leerInt("Cuantas unidades quieres");
				 if(cantidad!=0) {
					 precio=Teclado.leerInt("Cual es el precio por unidad?");
					 precioarticulos=cantidad*precio;
					 importeTotal+=precioarticulos;
				 }
			}while(cantidad!=0);
			
			if (importeTotal>1000) {
				float descuento=importeTotal*(float)0.05;
				importeTotal-=descuento;
			}
			
			System.out.println(importeTotal);
	}
}
