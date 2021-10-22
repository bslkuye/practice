package baekjoon.level2.no2884;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hour, minuit;
		hour = sc.nextInt();
		minuit = sc.nextInt();
		if(minuit < 45) {
			minuit = minuit + 15;
			hour--;
		}else {
			minuit = minuit - 45;
		}
		if(hour < 0) {
			hour = 23;
		} 
		System.out.println(hour + " " + minuit);
	}

}
