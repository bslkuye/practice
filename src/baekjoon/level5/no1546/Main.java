package baekjoon.level5.no1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(br.readLine());
		int[] scoreArr = new int[n];
		int highScore = 0;
		double aveScore = 0.0;
		
		for(int i = 0; i < scoreArr.length; i++) {
			int score = Integer.parseInt(st.nextToken());
			scoreArr[i] = score;
			
			if(score > highScore) highScore = score;
		}
		
		for(int i = 0; i < scoreArr.length; i++) {
			if(scoreArr[i] < highScore) scoreArr[i] = scoreArr[i] / highScore * 100;
			aveScore = aveScore + (double)scoreArr[i];
		}
		aveScore += highScore;
		System.out.println(aveScore / n);
	}

}
