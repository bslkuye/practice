package baekjoon.level8.no1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int pay = Integer.parseInt(st.nextToken());
		int material = Integer.parseInt(st.nextToken());
		int price = Integer.parseInt(st.nextToken());
		
		if(price <= material) System.out.println(-1);
		else System.out.println((pay / (price-material)) + 1);
		
		br.close();
	}

}