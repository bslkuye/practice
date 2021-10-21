package baekjoon.level5.no2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int first = Integer.parseInt(br.readLine());
		int second = Integer.parseInt(br.readLine());
		int third = Integer.parseInt(br.readLine());
		
		String val = Integer.toString(first * second * third);
		int[] numArr = new int[10];
		
		for(int i=0;i<val.length();i++) {
			int num = val.charAt(i) - '0';
			numArr[num]++;
		}
		
		for(int i=0;i<numArr.length;i++) {
			System.out.println(numArr[i]);
		}
		
		br.close();
	}

}