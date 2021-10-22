package baekjoon.level3.no2439;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			for(int j = 0; j < t - i - 1; j++) {
				sb.append(" ");
			}
			for(int j = 0; j <= i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		br.close();
		System.out.println(sb);
		
	}

}