package doit.CH3;

public class Q5 {
	
	
	private static int binSearchX(int [] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		int pc = (pl+pr)/2;
		int answer = 0;
		
		do {
			if(a[pc]==key) {
				answer = a[pc];
				int i = pc;
				while(i != 0 && a[i]==a[i-1]) {
					answer = a[--i];
					System.out.println(i);
					
				}
				
				return answer;
				
			}else {
				if(a[pc]>key) {
					pr = pc-1;
					
				}else {
					pl = pc +1;
				}
			}
			pc = (pl+pr)/2;
			
			
		}while(pl<=pr);
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7,7,7,7,7,7,7,8,8,9,9};
		System.out.println("the answer: "+binSearchX(a, a.length, 7));
		
	}

}
