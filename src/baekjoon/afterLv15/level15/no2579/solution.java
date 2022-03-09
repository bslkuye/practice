package baekjoon.afterLv15.level15.no2579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution {
    public static int N;
    public static int[] dp;
    public static int[] stair;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];
        stair = new int[N + 1];

        for(int i=1;i<=N;i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = stair[1];
        if(2 <= N) dp[2] = stair[1] + stair[2];

        System.out.println(scoreAdd(N));

        br.close();
    }

    public static int scoreAdd(int idx) {
        if(idx <= 0) return 0;

        if(dp[idx] == 0) {
            dp[idx] = Math.max(scoreAdd(idx - 2), scoreAdd(idx - 3) + stair[idx - 1]) + stair[idx];
        }

        return dp[idx];
    }

}
/*
0 0 0 1 0 1 1
 */