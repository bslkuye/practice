package baekjoon.level5.no8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine()) ;
		
		for(int i = 0;i < caseNum;i++) {
			String answer = br.readLine();
			int scoreAdd = 1;
			int score = 0;
			for(int j = 0; j < answer.length(); j++) {
				if(answer.charAt(j) == 'O') {
					score += scoreAdd;
					scoreAdd++;
				}else {
					scoreAdd = 1;
				}
				
			}
			System.out.println(score);
		}
		br.close();
	}

}
