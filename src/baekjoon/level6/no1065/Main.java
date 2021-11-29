package baekjoon.level6.no1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int result = 0;
		if(num < 100) {
			result = num;
		}else {
			result += 99;
			for(int i=100;i<=num;i++) {
				if(check(i)) result++;
			}
		}
		
		System.out.println(result);
		
		br.close();
	}
	
	public static boolean check(int num) {
		int len = Integer.toString(num).length();
		int[] numArr = new int[len]; 
		int first = num % 10;
		
		int before = 0;
		for(int i=0;i<len;i++) {
			int remain = num % 10;
			numArr[i] = remain - before - first;
			before = numArr[i];
			num /= 10;
		}
		
		for(int i=1;i<len-1;i++) {
			if(numArr[i] != numArr[i+1]) return false;
		}
		
		return true;
	}

}