package baekjoon.afterLv15.level15.no9461;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int j = 0; j < T; j++){
            int N = Integer.parseInt(br.readLine());
            long[] resultArr = new long[N + 5];
            resultArr[1] = 1;
            resultArr[2] = 1;
            resultArr[3] = 1;
            resultArr[4] = 2;
            resultArr[5] = 2;

            for (int i = 6; i <= N; i++) {
                resultArr[i] = resultArr[i - 1] + resultArr[i - 5];
            }
            sb.append(resultArr[N] + "\n");
        }
        System.out.println(sb);
        br.close();
    }
}
