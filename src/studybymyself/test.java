package studybymyself;

import java.util.HashMap;

public class test {
	class Solution {
		
	    public int solution(int []A) {
	        // write your code in Java SE 8
	    	int count =0;
	    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    	
	    	for(int a : A) {
	    		if(!map.containsKey(a)) {
	    			map.put(a, 1);
	    		}else {
	    			Integer tmp =  map.get(a);
	    			tmp++;
	    			map.put(a, tmp);
	    		}
	    		
	    	}
	    	
	    	for(int b : map.values()) {
	    		if(b>1) {
	    			count += (b*(b-1))/2;
	    			
	    		}
	    	}	    	
	        return count;
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
