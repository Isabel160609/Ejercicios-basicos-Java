import java.util.*;
public class MiString {

		public static String alReves(String cadena) {
			StringBuilder builder=new StringBuilder(cadena);
			String sCadenaInvertida=builder.reverse().toString();
			return sCadenaInvertida;
		}
		
		public static String limpiaCaracteres(String cadena, String eliminar) {
			String cadenaLimpia="";
			char [] cadenaArray= cadena.toCharArray();
			int longitud= eliminar.length();
			 String trozo;
			 int posicion=0;
			for (int i =0;i<longitud;i++) {
				trozo="";
				for (int j =0;j<cadenaArray.length-longitud;j++) {
					trozo+=String.valueOf(cadenaArray[i+j]);
					if (trozo.equalsIgnoreCase(eliminar)){
						posicion =i;
					}
				}
			}
			
			char [] newcadenaArray;
			for (int j =0;j<cadenaArray.length;j++) {
				if (j<posicion ||j>(posicion+longitud-1)) {
					cadenaLimpia+=String.valueOf(cadenaArray[j]);
				}
			}
			
			return cadenaLimpia;
		}
		public static String susituye(String cadena, char aSustituir, char sustituto) {
			String nueva="";
			char [] cadenaArray= cadena.toCharArray();
			for (int i =0;i<cadenaArray.length;i++) {
				if(String.valueOf(cadenaArray[i]).equalsIgnoreCase(String.valueOf(aSustituir))){
					cadenaArray[i]=sustituto;
				}
			}
			for (int i =0;i<cadenaArray.length;i++) {
				nueva+=String.valueOf(cadenaArray[i]);
			}
			
			return nueva;
		}
		public static boolean todosIguales(String cadena) {
			boolean todosIguales=true;
			char [] cadenaArray= cadena.toCharArray();
			int i=0;
			while (todosIguales && i<cadenaArray.length-1) {
				if(!String.valueOf(cadenaArray[i]).equalsIgnoreCase(String.valueOf(cadenaArray[i+1]))){
					todosIguales=false;
					
				}
				i++;
			}
			return todosIguales;
		}
		public static String quitaEspacios(String cadena) {
			String nueva="";
			char [] cadenaArray= cadena.toCharArray();
			for (int i =0;i<cadenaArray.length;i++) {
				if(!String.valueOf(cadenaArray[i]).equalsIgnoreCase(" ")){
					nueva+= String.valueOf(cadenaArray[i]);
				}
			}
			return nueva;
		}
		public static boolean esNumeroEntero(String cadena) {
			boolean todosNumeros=true;
			char [] cadenaArray= cadena.toCharArray();
			int i=0;
			while (todosNumeros && i<cadenaArray.length-1) {
				if(!Character.isDigit(cadenaArray[i])){
					todosNumeros=false;
				}
				i++;
			}
			return todosNumeros;
		}
}
