package baekjoon.level4.no10951;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		StringTokenizer st;
		int a,b;
		while((input = br.readLine()) != null) {
			st = new StringTokenizer(input);
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			sb.append(a + b).append("\n");
		}
		System.out.println(sb);
		br.close();
	}

}