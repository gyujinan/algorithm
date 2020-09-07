package doit.CH1;

import java.util.Scanner;

public class CH1 {

	static int Q1(int a, int b, int c, int d) {
		int max = a;

		if (max < b)
			max = b;

		if (max < c)
			max = c;

		if (max < d)
			max = d;

		return max;
	}

	static int Q2(int a, int b, int c) {
		int min = a;
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}

		return min;
	}

	static int Q3(int a, int b, int c, int d) {
		int min = a;
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		if (min > d) {
			min = d;
		}
		return min;

	}

	static void Q4() {
		// pass
	}

	static void Q5() {
	}

	static void Q6() {

		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지�?� 합�?� 합니다.");
		System.out.print("n�?� 값: ");
		int n = stdIn.nextInt();

		int sum = 0;
		int i = 1;

		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("1부터" + n + "까지�?� 합�?�" + sum + "입니다.");
		System.out.println("i: " + i);

	}

	static int Q7(int n) {

		int i = 1;
		int sum = 0;
		while (i <= n) {
			sum += i;

			i++;
		}

		return sum;

	}

	static int Q8(int n) {

		return n * (n + 1) / 2;

	}

	static int Q9(int a, int b) {
		int start;
		int end;
		int sum = 0;
		if (a < b) {
			start = a;
			end = b;
		} else {
			start = b;
			end = a;
		}

		while (start <= end) {

			sum += start;

			start++;
		}

		return sum;
	}

	static void Q10() {
		Scanner stdIn = new Scanner(System.in);
		int a;
		int b;
		do {
			System.out.print("a�?� 값 : ");
			a = stdIn.nextInt();
			System.out.print("b�?� 값 : ");
			b = stdIn.nextInt();
			if (a >= b) {
				System.out.println("a보다 �?� 값�?� 입력하세요!");
			}
		} while (a >= b);
		System.out.println("b - a는 " + (b - a) + "입니다.");
	}

	static void Q11() {
		Scanner stdIn = new Scanner(System.in);
		int a;
		int count = 0;

		do {
			System.out.print("양�?� 정수를 입력하세요: ");
			a = stdIn.nextInt();

		} while (a <= 0);

		while (a > 0) {
			a = a / 10;
			count++;
		}

		System.out.println("그 수는 " + count + "�?리입니다.");
	}

	static void Q12() {
		System.out.print("   |");
		for (int i = 1; i <= 9; i++)
			System.out.printf("%3d", i);
		System.out.println("\n---+---------------------------");

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%3d" + "|", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
	}

	static void Q13() {

		System.out.print("   |");
		for (int i = 1; i <= 9; i++)
			System.out.printf("%3d", i);
		System.out.println("\n---+---------------------------");

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%3d" + "|", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i + j);
			}
			System.out.println();
		}
	}

	static void Q14() {
		Scanner stdIn = new Scanner(System.in);
		int a;
		System.out.println("사�?형�?� 출력합니다.");
		System.out.print("단 수: ");
		a = stdIn.nextInt();
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void Q15_triangleLB(int n) {

	}

	static void Q15_triangleLU(int n) {

	}

	static void Q15_triangleRU(int n) {

	}

	static void Q15_triangleRB(int n) {

	}

	static void Q16() {

	}

	static void Q17() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(Q1(1,2,3));
		// System.out.println(Q2(3,2,1));
		// System.out.println(Q3(4,3,2,1));
		// Q6();
		// System.out.println(Q7(10));
		// System.out.println(Q8(10));
		// Q10();
		// Q11();
		// Q12();
		// Q13();
		// Q14();

	}

}
