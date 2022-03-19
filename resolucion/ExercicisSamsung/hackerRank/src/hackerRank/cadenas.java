package hackerRank;



public class cadenas {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
			System.out.println(countingValleys(8, "UDDDUDUU"));
	}
	 public static int countingValleys(int steps, String path) {
		    // Write your code here
		        String[] letras=path.split("");
		        int inicioRuta=0;  
		        int valles=0;
		        boolean baja=false;
		        if(letras[0].equalsIgnoreCase("d")){
		            baja=true;
		        }
		       
		        for(int i=0;i<letras.length;i++){
		            if(letras[i].equalsIgnoreCase("u")){  //uudduuddddduu
		                inicioRuta+=1;
		                if(inicioRuta==0){
		                    if(baja){
		                        valles+=1;
		                    }
		                     if(i<letras.length-1){
		                        if( letras[i+1].equalsIgnoreCase("d")){
		                            baja=true;
		                        }else{
		                            baja=false;
		                        }
		                     }
		                }
		            }else{
		                inicioRuta-=1;
		                 if(inicioRuta==0){
		                      if(baja){
		                        valles+=1;
		                    }
		                    if(i<letras.length-1){
		                        if(letras[i+1].equalsIgnoreCase("d")){
		                            baja=true;
		                        }else{
		                            baja=false;
		                        }
		                    }
		                }
		            }
		           
		        
		        }
		        return valles;
		    }
}
