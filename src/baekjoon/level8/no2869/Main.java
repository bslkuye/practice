package baekjoon.level8.no2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		double result = ((double)v-(double)b)/((double)a-(double)b);
		System.out.println((int)Math.ceil(result));
		
		br.close();
	}

}

//		for(int i = 1;;i++) {
//			v -= a;
//			if(v <= 0) {
//				System.out.println(i);
//				break;
//			}
//			v += b;
//		}