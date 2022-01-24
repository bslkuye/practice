package baekjoon.level14.no15650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        result = new int[M];
        loop(M);

        br.close();
    }

    public static void loop(int input){
        if(input > 0){
            for(int i = 1; i <= N; i++){
                result[M-input] = i;
                if(input == 1 && checkDuplication(result)){
                    for(int j = 0; j < result.length; j++){
                        System.out.print(result[j] + " ");
                    }
                    System.out.println("");
                }
                loop(input - 1);
            }
        }
    }
    static boolean check = true;
    public static boolean checkDuplication(int[] arr){
        check = true;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] >= arr[j] ){
                    check = false;
                }
            }
        }
        return check;
    }

}
//https://www.acmicpc.net/problem/15650