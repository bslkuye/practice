package baekjoon.level7.no1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		int space = 1;
		int i = 0;
		int length = str.length();
		if(length == 0) {
			System.out.println(0);
		}else if(length == 1 && str.charAt(0) == ' '){
			System.out.println(0);
		}else {
			if(str.charAt(0) == ' ') i = 1;
			if(str.charAt(length-1) == ' ') length--;
			for(;i<length;i++) {
				if(str.charAt(i) == ' ') {
					space++;
				}
			}
			System.out.println(space);
		}
		
		
		
		
		br.close();
	}

}