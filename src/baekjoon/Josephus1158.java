package baekjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Josephus1158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		LinkedList list = new LinkedList();
		int n = scan.nextInt();
		int k = scan.nextInt();
		String input = scan.nextLine();
		String[] tmp = input.split(" ");
		//int n = Integer.parseInt(tmp[0]);
		//int k = Integer.parseInt(tmp[1]);
		
		int index =k-1;
		//int[] result = new int[n];
		ArrayList result = new ArrayList();
		
		for(int i=1; i<=n; i++) {
			list.add(i);
		}
		
		while(!list.isEmpty()) {
			System.out.println(list.size());
			result.add(list.get(index));
			index = (index + (k-1))%(list.size()-1);
			list.remove(index);
			
		}
		
		System.out.println(result.toString());
		
	}

}
