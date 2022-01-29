package baekjoon.afterLv15.level15.no1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int countZero = 0;
    public static int countOne = 0;
    public static int[] zeroArr = new int[41];
    public static int[] oneArr = new int[41];
    public static void main(String[] args)throws IOException{
        Arrays.fill(zeroArr,-1);
        Arrays.fill(oneArr,-1);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int N = 0;
        for(int i = 0; i < T; i++){
            N = Integer.parseInt(br.readLine());
            fibonacci(N);
            System.out.println(countZero + " " + countOne);
            countOne = 0;
            countZero = 0;
        }
    }

    public static int fibonacci(int n){
        if(oneArr[n] == -1){
            if (n == 0) {
                zeroArr[n]++;
                return 0;
            } else if (n == 1) {
                oneArr[n]++;
                return 1;
            } else {
                zeroArr[n] = zeroArr[n-1] + zeroArr[n-2];
                oneArr[n] = oneArr[n-1] + oneArr[n-2];
                return zeroArr[n];
            }
        }else return fibArr[n];


    }
}
//https://www.acmicpc.net/problem/1003
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[][] numArr = new int[41][2];
		numArr[0][0] = 1;
		numArr[0][1] = 0;
		numArr[1][0] = 0;
		numArr[1][1] = 1;

		for(int i=2;i<41;i++) {
			numArr[i][0] = numArr[i-1][0] + numArr[i-2][0];
			numArr[i][1] = numArr[i-1][1] + numArr[i-2][1];
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0;i<T;i++) {
			int N = Integer.parseInt(br.readLine());
			sb.append(numArr[N][0]).append(" ").append(numArr[N][1]).append("\n");
		}

		System.out.println(sb);

		br.close();
	}


 */