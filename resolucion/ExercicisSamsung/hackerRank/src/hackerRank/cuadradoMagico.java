package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;

public class cuadradoMagico {

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
	        int diferencia=0;
	        int diferenciaAcumulada=0;
	        for(int i=0;i<3;i++){
	            if (s.get(i).get(0)+s.get(i).get(1)+s.get(i).get(2)!=15 ){
	               diferencia=15-(s.get(i).get(0)+s.get(i).get(1)+s.get(i).get(2));
	               diferencia=Math.abs(diferencia);
	               diferenciaAcumulada+=diferencia;
	            }
	        }
	        return diferenciaAcumulada;
	    }

}
