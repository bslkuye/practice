package baekjoon.level7.no5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int result = 0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if('A' <= ch && ch <='C') {
				result += 3;
			} else if('D' <= ch && ch <='F') {
				result += 4;
			} else if('G' <= ch && ch <='I') {
				result += 5;
			} else if('J' <= ch && ch <='L') {
				result += 6;
			} else if('M' <= ch && ch <='O') {
				result += 7;
			} else if('P' <= ch && ch <='S') {
				result += 8;
			} else if('T' <= ch && ch <='V') {
				result += 9;
			} else if('W' <= ch && ch <='Z') {
				result += 10;
			}
		}
		
		System.out.println(result);
		
		br.close();
	}

}
