package baekjoon.level11.no7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] weightArr = new int[n];
        int[] highArr = new int[n];
        int[] resultArr = new int[n];
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            weightArr[i] = Integer.parseInt(st.nextToken());
            highArr[i] = Integer.parseInt(st.nextToken());
            resultArr[i] = 1;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
             if(weightArr[i] < weightArr[j] && highArr[i] < highArr[j]) resultArr[i]++;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(resultArr[i] + " ");

        }
        br.close();
    }
}
