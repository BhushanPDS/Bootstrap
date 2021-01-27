package day2;

import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		System.out.println("hello");
		Scanner sc = new Scanner(System.in);
		demo(sc);
	}

	private static void demo(Scanner sc) {
		boolean a = true;
		while (a) {
			System.out.println("1/add 2/ sub 3/exit");
			System.out.println("enter ur choice");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				int res = add();
				System.out.println(res);
				break;
			case 2:
				sub();
				break;

			case 3:
				System.out.println("exit");
				a = false;
			default:
				System.out.println("enter proper choice");
			}
		}
	}

	private static void sub() {
		// TODO Auto-generated method stub

	}

	private static int add() {
		int a = 10;
		int b = 10;
			return a;

	}

}
