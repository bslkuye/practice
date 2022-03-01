package baekjoon.afterLv15.level15.no1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.BatchUpdateException;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] paintCost;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        paintCost = new int[N][3];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++){
                paintCost[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(costCheck(0) + " "+ costCheck(1)+" "+costCheck(2));
        System.out.println(Math.min(costCheck(0), Math.min(costCheck(1), costCheck(2))));

        br.close();
    }

    public static int costCheck(int n){
        int sumResult = paintCost[0][n];
        int a = n;
        for(int i = 1; i < N; i++){
            System.out.println(a + " " + sumResult);
            if(a == 0){
                if(paintCost[i][1] > paintCost[i][2]){
                    a = 2;
                    sumResult += paintCost[i][2];
                }else {
                    a = 1;
                    sumResult += paintCost[i][1];
                }
            }else if(a == 1){
                if(paintCost[i][0] > paintCost[i][2]){
                    a = 2;
                    sumResult += paintCost[i][2];
                }else {
                    a = 0;
                    sumResult += paintCost[i][0];
                }
            } else if (a == 2) {
                if(paintCost[i][0] > paintCost[i][1]){
                    a = 1;
                    sumResult += paintCost[i][1];
                }else {
                    a = 0;
                    sumResult += paintCost[i][0];
                }

            }

        }
        System.out.println(a + " "+ sumResult + "\n");


        return sumResult;
    }


}
/*
재귀함수로 N만큼의 수열 돌리고 만들때 조건을 만족하도록 돌림
아니면 0,1 2진수 수열 만들어서 전거 제외 위 아레중 하나로?
N자릿수의 2진수 만드는 함수

https://www.acmicpc.net/problem/1149

1 100 100
1 1000 100
1000000000 100 100000000000000
그냥 다음수 둘중에 작은거 선택하면 될듯? - 안됨


 */