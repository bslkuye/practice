package baekjoon.level7.no2908;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int first = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int second = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		if(first <= second) System.out.println(second);
		else System.out.println(first); 
		
		br.close();
	}

}

//public class Main {
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int s = Integer.parseInt(br.readLine());
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		StringBuilder sb = new StringBuilder();
//		String firstNum = st.nextToken();
//		String secondNum = st.nextToken();
//		String changeNum = "";
//		int firstLength = firstNum.length();
//
//		for(int i = 0; i < firstNum.length(); i++) {
//			changeNum += firstNum(firstLength-i);
//		}
//		System.out.println(changeNum.subSequence(s, firstLength));
//		System.out.println(firstNum);
//		for(int i=0;i<s;i++) {
//			int len = Integer.parseInt(st.nextToken());
//			String str = st.nextToken();
//			
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
//
//}