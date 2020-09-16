package doit.CH3;

import java.util.Arrays;
import java.util.Comparator;

class PhyscData{
	private String name;
	private int height;
	private double vision;
	public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();
	
	
	private static class VisionOrderComparator implements Comparator<PhyscData>{
		
		@Override
		public int compare(PhyscData o1, PhyscData o2) {
			// TODO Auto-generated method stub
			
			return (o1.vision>o2.vision) ? 1 : 
				   (o1.vision<o2.vision) ? -1 : 0;
		}
		
	}
	
	public PhyscData(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}
	
	public String toString() {		
		return name+", "+height+", "+vision;
	}
}
public class Q7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhyscData [] x = {
				new PhyscData("a", 0, 0.0),
				new PhyscData("b", 0, 0.1),
				new PhyscData("c", 0, 0.2),
				new PhyscData("d", 0, 0.3),
				new PhyscData("e", 0, 0.4),
				new PhyscData("f", 0, 0.5),
				new PhyscData("g", 0, 0.6),
				new PhyscData("h", 0, 0.7),
				new PhyscData("i", 0, 0.8),
				new PhyscData("j", 0, 0.9),
		};
		
		int index = Arrays.binarySearch(
				x,
				new PhyscData("g",0,0.6),
				PhyscData.VISION_ORDER
				);
		System.out.println(x[index].toString());
		
	}

}
