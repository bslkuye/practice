package baekjoon.level5.no4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCaseNum = Integer.parseInt(br.readLine());
		for(int i = 0; i < testCaseNum; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int testNum = Integer.parseInt(st.nextToken());
			int[] testArr = new int[testNum];
			double testAve = 0.0;
			for(int j = 0; j < testNum; j++) {
				testArr[j] = Integer.parseInt(st.nextToken());
				testAve += testArr[j];
			}
			testAve = testAve / testNum;
			int aveCount = 0;
			for(int j = 0; j < testNum; j++) {
				if(testArr[j] > testAve) aveCount++;
			}
			DecimalFormat df = new DecimalFormat("0.000%");
			double avePer = (double)aveCount / (double)testNum;
			System.out.println(df.format(avePer));
		}
		
		
		br.close();
	}

}
