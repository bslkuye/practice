package practiceFile.other.cotest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
		
		System.out.println(st.countTokens());
		double N = Math.sqrt(st.countTokens());
		int maxHeat = 0;
		int nowHeat = 0;
		int[][] office = new int[(int)N][(int)N];
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br1.readLine()); // ¿ÂÇ³±â Å©±â
		for(int i = 0; i < (int)N; i++) {
			for(int j = 0; j < (int)N; j++) {
				office[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int[] a = new int[(int)N];
		for(int i = 0; i < (int)N; i++) a[i] = i;
		
		for(int i = 0; a[i] < k; i++) {
			for(int j = 0; a[j] < k; j++) {
				
			}
		}
		
	}

}
