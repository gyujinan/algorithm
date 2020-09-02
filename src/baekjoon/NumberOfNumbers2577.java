package baekjoon;

import java.util.Scanner;

public class NumberOfNumbers2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Scanner scan = new Scanner(System.in);
    	int sum = 1;
    	int [] parsedata = new int[10];
    	for(int i=0; i<3; i++) {
    		sum*=Integer.parseInt(scan.nextLine());
    	}
    	
    	while(sum != 0) {
    		//System.out.println(sum);
    		int tmp = sum%10;
    		parsedata[tmp]++;
    		
    		sum/=10;
    	}
    	
    	for(int i=0; i<parsedata.length; i++) {
    		System.out.println(parsedata[i]);
    	}
	}

}
