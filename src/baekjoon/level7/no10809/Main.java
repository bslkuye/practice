package baekjoon.level7.no10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] alpabet = new int[26];
		for(int i=0;i<26;i++) alpabet[i] = -1;
		
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<26;j++) {
				if(str.charAt(i) == j+97 && alpabet[j]==-1) {
					alpabet[j] = i;
					break;
				}
			}
		}
		for(int i=0;i<26;i++) {
			System.out.print(alpabet[i] + " ");
		}
		
		br.close();
	}

}