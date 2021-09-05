package baekjoon.level1.no2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a * (b % 10));
		System.out.println(a * (b % 100 - b % 10) / 10);
		System.out.println(a * (b % 1000 - b % 100) / 100);
		System.out.println(a * b);
	}

}
