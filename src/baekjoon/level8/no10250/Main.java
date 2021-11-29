package baekjoon.level8.no10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		for(int i = 0; i < num; i++) {
			StringTokenizer stt = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(stt.nextToken());
			int w = Integer.parseInt(stt.nextToken());
			int n = Integer.parseInt(stt.nextToken());
			if(n % h == 0 && n / (h + 1) + 1 <= w) {
				System.out.println(h * 100 + n / (h + 1) + 1);
			}else if(n / (h + 1) + 1 <= w) System.out.println((n % h) * 100+ n / (h + 1) + 1);
		}
		
		br.close();
	}

}
//			for(int j = 1; j < w + 1; j++) {
//				for(int k = 1; k < h + 1; k++) {
//					n--;
//					if(n == 0) System.out.println(k*100+j);
//				}
//			}  맘에 안들게 풀었음