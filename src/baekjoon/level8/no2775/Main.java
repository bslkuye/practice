package baekjoon.level8.no2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for(int i = 0; i < testCase; i++){
            int k = Integer.parseInt(br.readLine());//Ãþ
            int n = Integer.parseInt(br.readLine());//È£
            int person[][] = new int[k+4][n+4];
            person[1][0] = 1;
            for(int j = 0; j < n + 2; j++) person[0][j] = j + 1;
            for(int a = 1; a < k + 1; a++){
                for(int b = 0; b < n + 1; b++){
                    person[a][b] = 0;
                    for(int c = 0; c <= b; c++) person[a][b] += person[a-1][c];
                }
            }
            System.out.println(person[k][n-1]);
        }
        br.close();
    }
}
