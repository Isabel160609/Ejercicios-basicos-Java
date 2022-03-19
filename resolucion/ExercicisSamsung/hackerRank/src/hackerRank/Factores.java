package hackerRank;

import java.util.Scanner;

public class Factores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
		  	System.out.println("primera array");
	        int n = in.nextInt();
	    	System.out.println("segunda array");
	        int m = in.nextInt();
	        int[] A = new int[n];
	        for (int i = 0; i < n; i++) {
	        	System.out.println("numero 1");
	            A[i] = in.nextInt();
	        }
	        int[] B = new int[m];
	        for (int i = 0; i < m; i++) {
	        	System.out.println("numero 2");
	            B[i] = in.nextInt();
	        }
	        
	        int cnt = 0;
	        for (int i = 1; i <= 100; i++) {
	            boolean ok = true;
	            for (int j = 0; j < n && ok; j++) {
	                if (i % A[j] != 0) ok = false;
	            }
	            for (int j = 0; j < m && ok; j++) {
	                if (B[j] % i != 0) ok = false;
	            }
	            if (ok) cnt++;
	        }
	        System.out.println(cnt);
	}

}
