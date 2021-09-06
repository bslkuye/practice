package baekjoon.level3.no8393;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, su;
		su = 0;
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			su = su + i + 1;
		}
		System.out.println(su);
	}

}
