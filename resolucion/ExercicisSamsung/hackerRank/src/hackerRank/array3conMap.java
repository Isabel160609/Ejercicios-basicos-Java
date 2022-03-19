package hackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class array3conMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	public static int migratoryBirds(ArrayList<Integer> arr) {
    // Write your code here
        
        
        Map<Integer, Integer> birds = new HashMap<Integer, Integer>();
          
          int maxValue=0;
          int maxKey=0;

        for(int i = 0; i < arr.size(); i++){
            if(birds.containsKey(arr.get(i))){
                birds.put(arr.get(i), birds.get(arr.get(i)) + 1);
            }else{
                birds.put(arr.get(i), 1);
            }
        }
      for (Entry<Integer, Integer> entry : birds.entrySet()) {  
            if (entry.getValue()>maxValue) {
                maxKey=entry.getKey();   
                maxValue=entry.getValue();
            }
        }
        return  maxKey;
    }
}
