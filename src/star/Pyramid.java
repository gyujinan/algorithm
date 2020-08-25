package star;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		for(int i=0; i<num; i++) {
			
			for(int j=0; j<(num-1)-i; j++) {
				System.out.print(" ");
			}
			for(int z=0; z<(2*i)+1;z++) {	
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
