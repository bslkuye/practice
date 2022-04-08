package baekjoon.afterLv15.level15.no2565;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] pole = new int[N][2];
        int[] dp = new int[N];

        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            pole[i][0] = Integer.parseInt(st.nextToken());
            pole[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(pole, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        for(int i=0; i<N; i++) {
            dp[i] = 1;

            for(int j=0; j<i; j++) {
                if(pole[j][1] < pole[i][1])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(N - max);

        br.close();
    }

}
