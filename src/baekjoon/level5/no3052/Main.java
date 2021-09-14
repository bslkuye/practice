package baekjoon.level5.no3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int difCount = 0;
		int[] numArr = new int[10];
		for(int i = 0; i < 10; i++) {
			numArr[i] = Integer.parseInt(br.readLine()) % 42;
		}
		boolean count = false;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(numArr[i] == numArr[j] && i != j) count = true;
			}
			if(count == true) {
				count = false;
			}else difCount++;
		}
		System.out.println(difCount);
	}

}
