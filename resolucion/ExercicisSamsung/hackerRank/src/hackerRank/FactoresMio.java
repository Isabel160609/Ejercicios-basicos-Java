package hackerRank;

import java.util.*;


public class FactoresMio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(2);
		a.add(6);
		ArrayList<Integer> b=new ArrayList<Integer>();
		b.add(24);
		b.add(36);
		ArrayList <ArrayList<Integer>>resTodosFactores=todosFactores( a,b);
		System.out.println(resTodosFactores);
		System.out.println(factoresComunes(resTodosFactores));//esta
		ArrayList <ArrayList<Integer>>resDivisoresPosibles=divisoresPosibles(factoresComunes(todosFactores( a,  b)),todosFactores( a,b));
		System.out.println(resDivisoresPosibles);
		System.out.println(numeroDivisoresPosibles(resDivisoresPosibles));//esta
		
		System.out.println(mcd(factoresComunes(resTodosFactores),numeroDivisoresPosibles(resDivisoresPosibles)));
		System.out.println(primeraSonSusDivisores (mcd(factoresComunes(resTodosFactores),numeroDivisoresPosibles(resDivisoresPosibles)), a));
	}
	public static void getTotalX(ArrayList<Integer> a, ArrayList<Integer> b) {
	}
	    // Write your code here
	    public static ArrayList <ArrayList<Integer>> todosFactores(ArrayList<Integer> a, ArrayList<Integer> b){
	        ArrayList <ArrayList<Integer>> factores=new ArrayList <ArrayList<Integer>>();
	        factores.add(new ArrayList<Integer>());
	        factores.add(new ArrayList<Integer>());
	        for (int i=0; i<b.size();i++) {
	            int numeroFactorizado=b.get(i);
	                while(numeroFactorizado>1){
	                        for (int j = 2;numeroFactorizado>=2;j++) {
	                            if(numeroFactorizado%j==0){
	                                numeroFactorizado=numeroFactorizado/j;
	                                factores.get(i).add(j);
	                                j=1;
	                            }
	                        }
	                            
	                }
	        }
	        return factores;
	    }
	    public static ArrayList<Integer> factoresComunes(ArrayList <ArrayList<Integer>>factores){
	        int contador=0;
	        int numeroComparar;
	        ArrayList<Integer> comunes=new ArrayList<Integer>();
	        for (int i=0; i<factores.size();i++) {//la array
	            for (int j = 0;j<factores.get(i).size();j++) {//el numero
	                numeroComparar=factores.get(i).get(j);
	                contador=0;
	                for (int k = 0;k<factores.size();k++)
	                     for (int l = 0;l<factores.get(k).size();l++)
	                        if(i!=k){
	                            if (numeroComparar==factores.get(k).get(l)){
	                            	if(!estaEnArray(numeroComparar, comunes)) {
	                            			comunes.add(numeroComparar);
	                             
	                            	}
	                            }
	                        }
	            }
	        }
	        return comunes;
	    }

	public static ArrayList<ArrayList<Integer>> divisoresPosibles(ArrayList<Integer>comunes,ArrayList <ArrayList<Integer>>factores){
		ArrayList<ArrayList<Integer>>contadores=new ArrayList<ArrayList<Integer>>();
		for(int i =0;i<comunes.size();i++) {
			 contadores.add(new ArrayList<Integer>());
		}
		int contador=0;
		for (int i=0; i<comunes.size();i++) {
			for (int j = 0;j<factores.size();j++) {
				contador=0;
				  for (int k = 0;k<factores.get(j).size();k++) {
					  if (comunes.get(i)==factores.get(j).get(k)){
						  contador+=1;
					  }
				  }
				 
				  contadores.get(i).add(contador);
			}
		}
		
		return contadores;
	}
	public static ArrayList<ArrayList<Integer>> numeroDivisoresPosibles(ArrayList<ArrayList<Integer>> divisoresPosibles){
		 for (int i=0; i<divisoresPosibles.size();i++) {//la array
	            for (int j = 0;j<divisoresPosibles.get(i).size();j++) {
	            	
	            	if(divisoresPosibles.get(i).size()>1) {
	            		if(divisoresPosibles.get(i).get(j)<divisoresPosibles.get(i).get(j+1)) {
	            			divisoresPosibles.get(i).remove(j+1);
	            			j=0;
	            		}else {
	            			divisoresPosibles.get(i).remove(j);
	            			j=0;
	            		}
	            	}else {
	            		break;
	            	}
	            	
	            }
		 	}
	            return divisoresPosibles;
		 
	}
	
	public static ArrayList<Integer>mcd(ArrayList<Integer> comunes,ArrayList<ArrayList<Integer>> divisoresPosibles){
		
		ArrayList<ArrayList<Integer>> numerosPosiblesSegunda=new ArrayList<ArrayList<Integer>> ();
		for(int i =0;i<comunes.size();i++) {
			numerosPosiblesSegunda.add(new ArrayList<Integer>());
		}
		int acumulador=1;
		for(int i=0;i<comunes.size();i++) {
			acumulador=1;
			for(int j=0;j<divisoresPosibles.get(i).get(0);j++) {
				acumulador*=comunes.get(i);
				numerosPosiblesSegunda.get(i).add(acumulador);
			}
		}
		System.out.println(numerosPosiblesSegunda+"numerosPosiblesSegunda");
		 ArrayList<Integer> juntandoLasDos=new ArrayList<Integer>();
		int numero=0;
		for(int i=0;i<numerosPosiblesSegunda.size();i++) {
			numero=0;
			for(int j=0;j<numerosPosiblesSegunda.get(i).size();j++) {
				for(int k=0;k<numerosPosiblesSegunda.get(i).size();k++) {
					try {
						numero=numerosPosiblesSegunda.get(i).get(j)*numerosPosiblesSegunda.get(i+1).get(k);
						juntandoLasDos.add(numero);
					}catch(Exception e){
						continue;
					}
				}
			}
		}
		ArrayList<Integer> mcd=new ArrayList<Integer>();
		for(int i=0;i<numerosPosiblesSegunda.size();i++) {
			for(int j=0;j<numerosPosiblesSegunda.get(i).size();j++) {
		
					mcd.add(numerosPosiblesSegunda.get(i).get(j));

			}
		}
		for(int i=0;i<juntandoLasDos.size();i++) {
			mcd.add(juntandoLasDos.get(i));
		}
		
		System.out.println(juntandoLasDos+"juntandoLasDos");
		
		return mcd;
	}
	public static ArrayList<Integer> primeraSonSusDivisores (ArrayList<Integer>mcd,ArrayList<Integer> a){
		ArrayList<Integer> resultado=new ArrayList<Integer>();
		boolean divisible=true;
		for(int i=0;i<mcd.size();i++) {
			divisible=true;
			for(int j=0;j<a.size();j++) {
				if(mcd.get(i)%a.get(j)!=0) {
					divisible=false;
				}
			}
			if(divisible) {
				resultado.add(mcd.get(i));
			}
		}
		System.out.println(resultado+"resultado");
		return resultado;
	}
	
	
	public static boolean estaEnArray(int numeroComparar, ArrayList<Integer> comunes) {
		boolean esta=false;
		int i=0;
		if (comunes.isEmpty()) {
			esta=false;
		}else {
			while (esta==false && i<comunes.size()) {
				if(comunes.get(i)==numeroComparar) {
					esta=true;
			}
				i++;
			}
		}
		return esta;
	}
}