package baekjoon.level3.no2739;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		for(int i = 1; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + "" + n*i);
		}
	}

}
