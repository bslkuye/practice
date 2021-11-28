package baekjoon.level7.no2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int result = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			char nextCh = '0';
			if(i < str.length()-1) {
				nextCh = str.charAt(i+1);
			}
			char nnextCh = '0';
			if(i < str.length()-2) {
				nnextCh = str.charAt(i+2);
			}
			result++;
			if(ch == 'c') {
				if(nextCh == '=' || nextCh == '-')
					i++;
			}else if(ch == 'd'){
				if(nextCh == 'z' && nnextCh == '=') {
					i+=2;
				}else if(nextCh == '-')
					i++;
			}else if(ch == 'l') {
				if(nextCh == 'j') 
					i++;
			}else if(ch == 'n') {
				if(nextCh == 'j')
					i++;
			}else if(ch == 's') {
				if(nextCh == '=')
					i++;
			}else if(ch == 'z') {
				if(nextCh == '=')
					i++;
			}
		}
		System.out.println(result);
		br.close();
	}

}
//		int result = 0;
//		
//		for(int i=0;i<str.length();i++) {
//			char ch = str.charAt(i);
//			if(ch == 'c') {
//				if(i+1 < str.length()) {
//					char nextCh = str.charAt(i+1);
//					if(nextCh == '=' || nextCh == '-') {
//						i++;
//					}
//				}
//			} else if(ch == 'd') {
//				if(i+1 < str.length()) {
//					char nextCh = str.charAt(i+1);
//					if(nextCh == 'z') {
//						if(i+2 < str.length()) {
//							if(str.charAt(i+2) == '=') {
//								i = i+2;
//							}
//						}
//					} else if(nextCh == '-') {
//						i++;
//					}
//				}
//				
//			} else if(ch == 'l' || ch == 'n') {
//				if(i+1 < str.length()) {
//					char nextCh = str.charAt(i+1);
//					if(nextCh == 'j') {
//						i++;
//					}
//				}
//			} else if(ch == 's' || ch == 'z') {
//				if(i+1 < str.length()) {
//					char nextCh = str.charAt(i+1);
//					if(nextCh == '=') {
//						i++;
//					}
//				}
//			}
//			result++;
//		}
//		
		