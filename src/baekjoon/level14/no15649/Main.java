package baekjoon.level14.no15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        loop(M);

        br.close();
    }

    static int[] result = new int[N+1];

    public static void loop(int input){
        if(input != 0){
            for(int i = 1; i <= N; i++){
                result[M-input] = i;
                loop(input - 1);
            }
        }else if(input == 1){
            System.out.println(result);
        }
    }

}

//https://www.acmicpc.net/problem/15649