package doit.CH5;

public class Q2 {
	static int gcd(int x, int y) {
		int tmp = 0;
		int bigger = 0;
		int smaller = 0;
		
		if(x > y) {
			bigger = x;
			smaller = y;
		}else {
			bigger = y;
			smaller = x;
		}
		
		do {
			tmp = smaller;
			smaller = bigger%smaller;
			bigger = tmp;
			
		}while(smaller != 0);
		
		
		return bigger;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
