package star;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		for(int i=0; i<num; i++) {
			
			for(int j=0; (j<((num/2)-i))||((i>(num/2))&&(j<(i-(num/2)))); j++) {
				System.out.print(" ");
			}
			for(int z=0; (((i<(num/2)+1)&&(z<(2*i)+1)) || ((i>(num/2)))&&(z<(2*num)-(2*i+1)));z++) {	
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
