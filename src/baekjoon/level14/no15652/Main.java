package baekjoon.level14.no15652;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[] result;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        result = new int[M];
        loop(M);
        bw.flush();
        bw.close();
        br.close();
    }

    public static void loop(int input) throws IOException {
        if(input > 0){
            for(int i = 1; i <= N; i++){
                result[M-input] = i;
                if(input == 1 && checkDuplication(result)){
                    for(int j = 0; j < result.length; j++){
                        bw.write(result[j] + " ");
                    }
                    bw.write("\n");
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
                if(arr[i] > arr[j] ){
                    check = false;
                }
            }
        }
        return check;
    }

}
//https://www.acmicpc.net/problem/15652