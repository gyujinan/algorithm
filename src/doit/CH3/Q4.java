package doit.CH3;

public class Q4 {
	private static void binarySearchAndPrint(int a[], int key) {
		System.out.printf("%4s","|");
		for(int i=0;i<a.length;i++) {
			
			System.out.printf("%3d", i);
		}
		System.out.println();
		System.out.println("---+----------------------------------");
		int pl = 0;
		int pr = a.length-1;
		int pc = (pl+pr)/2;
		
		
		do {
			System.out.printf("%4s","|");
			for(int i=0; i<a.length; i++) {
				if(i==pl) {
					System.out.printf("%3s", "<-");
				}else if(i==pc) {
					System.out.printf("%3s", "*");
				}else if(i==pr) {
					System.out.printf("%3s", "->");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
			System.out.printf("%3d|",pc);
			for(int tmp : a) {
				System.out.printf("%3d", tmp);
			}
			System.out.println();
			if(a[pc]==key) {
				System.out.printf("%2d는 x[%d]에 있습니다",key,pc);
				return;
			}else {
				if(a[pc]>key) {
					pr = pc-1;
				}else {
					pl = pc+1;
				}
				pc = (pl+pr)/2;
			}
			
		}while(pl<=pr);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,5,6,8,9};
		binarySearchAndPrint(a, 2);
		
	}

}
