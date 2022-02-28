package baekjoon.afterLv15.level15.no1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.BatchUpdateException;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] paintCost;
    static int[] paintArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        paintCost = new int[3][N];
        paintArr = new int[N];
        for(int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                paintCost[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        br.close();
    }

    public static void ArrMake(int n){

    }

    //재귀함수로 N만큼의 수열 돌리고 만들때 조건을 만족하도록 돌림
    //아니면 0,1 2진수 수열 만들어서 전거 제외 위 아레중 하나로?
    //N자릿수의 2진수 만드는 함수
}

//https://www.acmicpc.net/problem/1149