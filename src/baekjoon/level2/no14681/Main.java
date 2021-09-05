package baekjoon.level2.no14681;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		if(a > 0) {
			if(b > 0) {
				System.out.println("1");
			}else {
				System.out.println("4");
			}
		}else if(a < 0) {
			if(b > 0) {
				System.out.println("2");
			}else {
				System.out.println("3");
			}
		}
	}

}
