package doit.CH2;

public class Q10 {
	static final int VMAX = 21;
	
	static class PhyscData{
		String home;
		int height;
		double vision;
		
		PhyscData(String home, int height, double vision){
			
			this.home = home;
			this.height = height;
			this.vision = vision;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PhyscData [] x = {
				new PhyscData("",0,0.3),
				new PhyscData("",0,0.7),
				new PhyscData("",0,2.0),
				new PhyscData("",0,1.5),
				new PhyscData("",0,0.4),
				new PhyscData("",0,1.2),
				new PhyscData("",0,0.8),
		};
		
		int [] dist = new int[VMAX];
		
		for(PhyscData tmp: x) {
			int index = (int)(tmp.vision*10);
			dist[index]++;
			
		}
		
		for(int i=0; i<dist.length;i++) {
			System.out.print((double)i/10+"~:");
			for(int j=0; j<dist[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
