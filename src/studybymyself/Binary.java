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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
