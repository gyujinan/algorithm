package doit.CH3;

public class Q3 {
	
	private static int searchIdx(int[] a, int n, int key, int[] idx) {
		int index=0;
		for(int i=0; i<a.length;i++) {
			if(a[i]==key) {
				idx[index]=a[i];
				index++;
			}
			
		}
		for(int r : idx) {
			System.out.print(r+", ");
		}
		System.out.println();
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1, 9, 2, 9, 4, 6, 7, 9 };
		int[] idx = new int[x.length];
		System.out.println(searchIdx(x, x.length, 9 ,idx));
		
		
	}

}
