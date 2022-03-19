package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class arraysConMap {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
			ArrayList<Integer> arr=new ArrayList<Integer>();
			Map<Integer, Integer> birds = new HashMap<Integer, Integer>();
	        int key = 0;

	        for(int i = 0; i < arr.size(); i++){
	            if(birds.containsKey(arr.get(i))){
	                birds.put(arr.get(i), birds.get(arr.get(i)) + 1);
	            }else{
	                birds.put(arr.get(i), 1);
	            }
	        }
	        key = Collections.max(birds.entrySet(), Map.Entry.comparingByValue()).getKey();
	        
	    }
	    
	}


