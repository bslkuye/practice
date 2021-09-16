package baekjoon.level5.no1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] scoreArr = new int[n];
		int highScore = 0;
		double aveScore = 0.0;
		
		for(int i = 0; i < n; i++) {
			int score = Integer.parseInt(st.nextToken());
			scoreArr[i] = score;
			if(score > highScore) highScore = score;
		}
		
		for(int i = 0; i < n; i++) {
			aveScore = aveScore + (double)scoreArr[i] / highScore * 100;
		}
		System.out.println(aveScore / n);
		br.close();
	}

}
