package hackerRank;
/*Est�s coreografiando un espect�culo de circo con varios animales. Para un acto, se le dan dos canguros en una recta num�rica listos para saltar en la direcci�n positiva (es decir, hacia el infinito positivo).

El primer canguro comienza en la ubicaci�n. x1 y se mueve a una velocidad de v1 metros por salto.
El segundo canguro comienza en la ubicaci�n.x2  y se mueve a una velocidad de v2  metros por salto.
Tienes que encontrar una manera de conseguir que los dos canguros est�n en el mismo lugar al mismo tiempo como parte del espect�culo. Si es posible, regrese YES, en caso contrario regrese NO.*/
public class canguros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(kangaroo(0, 2, 5, 3));
	}
	public static String kangaroo(int x1, int v1, int x2, int v2) {
	    // Write your code here
	         int saltoCanguro1=x1+v1;
	         int saltoCanguro2=x2+v2;
	         String coinciden=" ";
	         
	         if (saltoCanguro1==saltoCanguro2){
	             coinciden="YES";
	         }else{
	             if (v1>v2){
	            	 if (saltoCanguro1>saltoCanguro2) {
	            		 coinciden="NO";
	            	 }else {
		                 while(saltoCanguro1<saltoCanguro2 ){
		                     saltoCanguro1+=v1;
		                     saltoCanguro2+=v2;
		                     if(saltoCanguro1==saltoCanguro2){
		                         coinciden="YES";
		                         break;
		                     }else{
		                         coinciden="NO";
		                         }
		                 }
	                 }
	                 }else if(v1<v2){
	                	 if(saltoCanguro2>saltoCanguro1) {
	                		 coinciden="NO";
	                	 }else {
		                     while(saltoCanguro1>saltoCanguro2 ){
		                        saltoCanguro1+=v1;
		                        saltoCanguro2+=v2;
		                        if(saltoCanguro1==saltoCanguro2){
		                            coinciden="YES";
		                            break;
		                        }else{
		                            coinciden="NO";
		                            }
		                     }
	                     }
	                 }else{
	                    saltoCanguro1+=v1;
	                    saltoCanguro2+=v2;
	                        if(saltoCanguro1==saltoCanguro2){
	                            coinciden="YES";
	                        }else{
	                            coinciden="NO";
	                            }
	                 }
	             }
	             return coinciden;
	    }  
	    
}
