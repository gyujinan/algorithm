package doit.CH3;

public class Q2 {
	
	private static void searchAndPrint(int a[], int key) {
		System.out.printf("%4s","|");
		for(int i=0;i<a.length;i++) {
			
			System.out.printf("%3d", i);
		}
		System.out.println();
		System.out.println("---+----------------------------------");
		
		for(int i=0;i<a.length;i++) {
			System.out.printf("%4s","|");
			for(int j=0;j<=i;j++) {
				
				if(i==j) {
					System.out.println("  *"); break;
				}else {
					System.out.print("   ");
				}
								
			}
			System.out.printf("%3d|", i);
			for(int j=0;j<a.length;j++) {
					
				System.out.printf("%3d", a[j]);
			}
			System.out.println();
			
			if(key==a[i]) {
				System.out.printf("%3s is at index %d\n",key,i);
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a = new int[10];
		int[] a = {5,4,6,7,3,2,8,9};
		searchAndPrint(a, 6);
	}

}
