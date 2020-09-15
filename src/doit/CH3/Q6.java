package doit.CH3;

import java.util.Arrays;

public class Q6 {
	
	private static int binarySearch(int[] x, int key) {
		int lp =0;
		int rp =x.length-1;
		int cp = 0; 
				
		
		do {
			cp = (lp+rp)/2;
			if(x[cp]==key) {
				return cp;
			}else {
				if(x[cp]>key) {
					rp = cp-1;
				}else {
					lp = cp+1;
				}
			}
			
		}while(lp<=rp);
		
		if(x[cp]>key) {
			return cp;
		}else {
			return ++cp;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sample = {15, 27, 39, 77, 92, 108, 121};
		int result = binarySearch(sample, 100);
		System.out.println(result);
		int idx = Arrays.binarySearch(sample, 100);
		
		System.out.println(-idx-1);
		
	}

}
