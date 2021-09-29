package baekjoon.level7.no2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(br.readLine());
		
		int result = 0;
		for(int i=0;i<s;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			StringBuilder sb = new StringBuilder();
			int len = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			for(int j=0;j<str.length();j++) {
				char ch = str.charAt(j);
				for(int k=0;k<len;k++) {
					sb.append(ch);
				}
			}
			System.out.println(sb);
		}
		
		System.out.println(result);
		
		br.close();
	}

}
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main {
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int loop = Integer.parseInt(br.readLine());
//		
//		for(int i=0;i<loop;i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//			StringBuilder sb = new StringBuilder();
//			int len = Integer.parseInt(st.nextToken());
//			String str = st.nextToken();
//			for(int j=0;j<str.length();j++) {
//				char ch = str.charAt(j);
//				for(int k=0;k<len;k++) {
//					sb.append(ch);
//				}
//			}
//			System.out.println(sb);
//		}
//				
//		br.close();
//	}
//}