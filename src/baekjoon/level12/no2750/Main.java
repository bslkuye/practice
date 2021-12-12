package baekjoon.level12.no2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        for(int i = -1000; i <= 1000; i++){
            for(int j = 0; j < n; j++){
                if(i == arr[j]){
                    System.out.println(i);
                    count++;
                }
            }
            if(count == n) break;
        }

        br.close();
    }
}
//수열을 만들어서 수열에서 정렬해서 출력하는 방법과 max수치를 찾아서 1부터 수열에서 찾아서 출력하는 방법
// 범위는 -1000 에서 1000으로
