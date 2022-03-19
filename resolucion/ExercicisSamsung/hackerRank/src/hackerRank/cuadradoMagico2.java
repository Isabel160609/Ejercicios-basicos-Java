package hackerRank;

import java.util.ArrayList;

public class cuadradoMagico2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		ArrayList<Integer> b=new ArrayList<Integer>();
		ArrayList<Integer> c=new ArrayList<Integer>();
		a.add(2);
		a.add(9);
		a.add(8);
		b.add(4);
		b.add(2);
		b.add(7);
		c.add(5);
		c.add(6);
		c.add(7);
		
		ArrayList<ArrayList<Integer>> s=new ArrayList<ArrayList<Integer>>();
		s.add(a);
		s.add(b);
		s.add(c);
		System.out.println(formingMagicSquare(s));
	}
	static int formingMagicSquare(ArrayList<ArrayList<Integer>> s) {
	    // Write your code here
	    int[][] matrix={{4,9,2,3,5,7,8,1,6},
	                        {2,7,6,9,5,1,4,3,8},
	                        {6,1,8,7,5,3,2,9,4},
	                        {8,3,4,1,5,9,6,7,2},
	                        {2,9,4,7,5,3,6,1,8},
	                        {6,7,2,1,5,9,8,3,4},
	                        {8,1,6,3,5,7,4,9,2},
	                        {4,3,8,9,5,1,2,7,6}};
	      int []miMatrix={s.get(0).get(0),s.get(0).get(1),s.get(0).get(2),s.get(1).get(0),              s.get(1).get(1),s.get(1).get(2),s.get(2).get(0),s.get(2).get(1),s.get(2).get(2)};                  
	        int diferencia=0;
	        int diferenciaAcumulada=100;
	        for(int i=0;i<3;i++){
	            diferencia=0;
	            for (int j=0;j<9;j++){
	                if (miMatrix[j]!=matrix[i][j]){
	                      diferencia += Math.abs(miMatrix[j] - matrix[i][j]);
	                }
	            }
	            if(diferencia<diferenciaAcumulada){
	                diferenciaAcumulada=diferencia;
	            }
	            
	            }
	        
	        return diferenciaAcumulada;
	    }

}
