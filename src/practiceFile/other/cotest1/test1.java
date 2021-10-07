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

//		while(st.countTokens() != 0) {
//			System.out.print(st.nextToken());
//		}
//		System.out.println();
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br1.readLine());
	}

}
