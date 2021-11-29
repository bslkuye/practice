package baekjoon.level5.no2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		int location = 0;
		
		for(int i=1;i<=9;i++) {
			int num = Integer.parseInt(br.readLine());
			if(max < num) {
				max = num;
				location = i;
			}
		}
		
		System.out.println(max);
		System.out.println(location);
		
		br.close();
	}

}
