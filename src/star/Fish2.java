package star;

public class Fish2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		for(int i=0; i<num; i++) {
			
			for(int j=0;(((i+1)%4!=0)&&(j<(3+(i%4)))) ||
					((((i+1)%4==0)&&(j<4))); j++) 
			{
				if((((i+1)%4!=0)&&(j<(2-(i%4)))) || ((((i+1)%4==0)&&(j<1)))) 
				{
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}

}
