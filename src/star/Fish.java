package star;

public class Fish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=6;
		for(int i=0; i<num; i++) {
			
			for(int j=0; (((i+1)%4!=0)&&(j<(2-(i%4)))) || 
					(((i+1)%4==0)&&(j<1)); j++) 
			{
				System.out.print(" ");
			}
			for(int z=0; ((i+1)%4!=0)&&(z<((i%4)*2)+1) ||
					((i+1)%4==0&&(z<3));z++) {	
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
