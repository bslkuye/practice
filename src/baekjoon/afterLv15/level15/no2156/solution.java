package baekjoon.afterLv15.level15.no2156;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution {
    public static int N;
    public static int[] wine;
    public static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        wine = new int[N + 1];
        dp = new int[N + 1];

        for(int i=1; i<=N; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = wine[1];
        if(2 <= N) dp[2] = wine[1] + wine[2];

        for(int i=3; i<=N; i++) {
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2], dp[i - 3] + wine[i - 1]) + wine[i]);
            /*
            i 순서를 마시지 않거나 전거만 안먹거나 2개 전거만 안먹거나
             */
        }

        System.out.println(dp[N]);

        br.close();
    }

}
