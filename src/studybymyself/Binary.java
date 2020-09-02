package studybymyself;

public class Binary {
	public static String getBinary(int decimal) {
		
		String binary="";
		String remainder="";
		
		if(decimal==0) {
			return "0";
		}
		for(int i=decimal; i>0; i=i/2) {
			remainder = Integer.toString(i%2);
			binary = remainder+binary;
		}
		
		return binary;
	}
	
	private static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String num = "0123456789ABCDEF";
		
		do {
			d[digits++]=num.charAt(x%r);
			x=x/r;
			
		}while(x != 0);
		return digits;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
