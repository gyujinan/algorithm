package doit.CH3;

public class Q1 {
	
	static int seqSearchSen(int []a, int n, int key) {
		a[n]=key;
		int i;
		for(i=0; i<a.length; i++) {
			if(a[i]==key) break;			
		}
		
		return i == n ? -1:i;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
