package hackerRank;

import java.util.ArrayList;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> arr=new ArrayList<Integer>();
			int contador=0;
	        int contadorMaximo=0;
	        int idenficadorMashabitual=0;
	        for(int i=0;i<arr.size();i++){
	           contador=0;
	            for(int j=i+1;j<arr.size();j++){
	                if(arr.get(i)==arr.get(j)){
	                    contador++;
	                }
	                if (contador>contadorMaximo){
	                    contadorMaximo=contador;
	                    idenficadorMashabitual=arr.get(i);
	                }else if(contador==contadorMaximo){
	                    if(idenficadorMashabitual>arr.get(i)){
	                         contadorMaximo=contador;
	                    idenficadorMashabitual=arr.get(i);
	                    }
	                }
	        }
	   
	    }
	}

}
