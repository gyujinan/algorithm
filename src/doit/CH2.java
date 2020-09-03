package doit;

import java.util.Random;
import java.util.Scanner;

public class CH2 {
	
	private static void Q1() {
		Random r = new Random();
		int num = r.nextInt(10);
		
		int [] student = new int [num];
		
		for(int i =0; i<num;i++) {
			student[i]= 100+r.nextInt(90);
			System.out.println(student[i]);
			
		}
		System.out.println("the number of student: "+num);
		
	}
	
	private static void Q2_printArray(int [] a) {
		for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	private static void Q2() {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		System.out.print("length: ");
		
		int num = scan.nextInt();
		
		int [] array = new int[num];
		
		for(int i=0; i<num; i++) {
			array[i] = r.nextInt(99);
			System.out.print(array[i]+"  ");
		}
		System.out.println();
		for(int i=0; i<num/2; i++) {
			System.out.println("Start to swap");
			int tmp = array[i];
			array[i]=array[num-i-1];
			array[num-i-1]=tmp;
			Q2_printArray(array);
		}
		
		
	}
	private static int Q3(int []a) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	private static void Q4(int[] a, int[] b) {
		
		if(a.length!=b.length) return;
		
		for(int i=0;i<a.length;i++) {
			a[i]=b[i];
		}
	}
	
	private static void Q5(int[]a, int[]b) {
		if(a.length!=b.length) return;
		
		for(int i=0; i<a.length;i++) {
			a[i]=b[b.length-1-i];	
		}
	}
	private static int Q6(int x, int r, char[] d) {
		int digits = 0;
		String num = "0123456789ABCDEF";
		
//		do {
//			d[d.length-1-digits]=num.charAt(x%r);
//			digits++;
//			x=x/r;
//			
//		}while(x != 0);
		
		do{
			d[digits++]=num.charAt(x%r);
			x=x/r;
		}while(x !=0);
		
		for(int i=0; i<digits/2; i++) {
			char tmp = d[i];
			d[i] = d[digits-1-i];
			d[digits-1-i] = tmp;
		}
		return digits;
	}
	
//	private static void Q7(){
//		Scanner stdin = new Scanner(System.in);
//		int target=0;
//		int basenum=0;
//				
//		System.out.println("Convert decimal to base.");
//		do {
//			System.out.print("Nonnegative integer to convert: ");
//			target = stdin.nextInt();
//		}while(target<=0);
//		System.out.println();
//		
//		do {
//			System.out.print("Which number to convert to(2~16): ");
//			basenum = stdin.nextInt();
//			
//		}while(basenum<2 || basenum >16);
//		
//		char[] c = new char[100];
//		int digits =0;
//		String num = "0123456789ABCDEF";
//		System.out.printf("%2d|%8d%n", basenum, target);
//		do{
//			System.out.printf("%2d|%8d%n", basenum, target);
//			System.out.println("  +----------------");
//			
//			int n = target%basenum;
//			c[digits++]=num.charAt(n);
//			target=target/basenum;
//		}while(target !=0);
//		
//	}
	
	static int [][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	private static int Q8_isLeap(int year) {
		return (year % 4 == 0 && year %100 != 0 || year %400 ==0) ? 1:0;
	}
	
	private static int Q8(int y, int m, int d) {
		int i = 1;
		while(i<=m) {
			d+=mdays[Q8_isLeap(y)][i-1];
			i++;
		}
		return d;
	}
	
//	static int dayOfYear(int y, int m, int d) {
//		while (--m != 0)
//			d += mdays[Q8_isLeap(y)][m - 1];
//		return (d);
//	}
	
	private static int Q9(int y, int m, int d) {
		
		d -= mdays[Q8_isLeap(y)][m-1];
		for(int i=m; i<12; m++) {
			d += mdays[Q8_isLeap(y)][i];
		}
			
		return d;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q1();
		//Q2();
		//Q3();
		//Q4();
		//Q5();
		//Q6();
		
		//Q8(); need to check the correct answer
	}

}
