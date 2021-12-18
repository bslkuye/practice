package baekjoon.level11.no2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }
        int max = 0;
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                    int result = arr[i]+arr[j]+arr[k];
                    if(result <= m && result > max){
                        max = result;
                    }
                }
            }
        }
        System.out.println(max);
        br.close();
    }
}
//input에서 크기순 정렬을 하면 추후 break로 러닝타임을 줄일 수 있다.
// n값이 100까지 크지는 않지만 3개를 가져다 반복을 해야 하기 때문에 뭐가 좋은지는 모르겠음.
// 반복문은 i j k로 굴릴거고 .