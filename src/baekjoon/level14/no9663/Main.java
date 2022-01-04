package baekjoon.level14.no9663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int N;
    static int resultCount = 0;
    static int[] arr;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        check = new boolean[N];
        Arrays.fill(check,false);

        if(N > 3){
            makeArr(N);
            System.out.println(resultCount);
        }else{
            System.out.println("0");
        }

        br.close();
    }


    public static void makeArr(int n){
        if(n != 1){
            for(int i = 0; i < N; i++) {
                if(check[i] == false){
                    check[i] = true;
                    arr[n - 1] = i;
                    makeArr(n - 1);
                    check[i] = false;
                }
            }
        }else{
            for(int i = 0; i < N; i++) {
                if(check[i] == false){
                    arr[n - 1] = i;
                    if (checkArr(arr)) {
                        resultCount++;
                    }
                }
            }
        }
    }

    public static boolean checkArr(int[] Arr){
        for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j < N; j++){
                if(Arr[i] - Arr[j] == i-j || Arr[i] - Arr[j] == j-i){
                    return false;
                }
            }
        }
        return true;
    }

}
//https://www.acmicpc.net/problem/9663