package baekjoon.level14.no9663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int resultCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        makeArr(N);
        System.out.println(resultCount);
        br.close();
    }

    static int[] arr = new int[N];

    public static void makeArr(int n){
        if(n != 0){
            for(int i = 0; i < N; i++) {
                arr[N - n] = i;
                makeArr(n - 1);
            }
        }else{
            for(int i = 0; i < N; i++) {
                arr[N - n] = i;
                if(checkArr(arr)){
                    resultCount++;
                }
            }
        }
    }

    public static boolean checkArr(int[] Arr){
        boolean check = true;
        for(int i = 0; i < N - 1; i++){
            for(int j = i; j < N; j++){
                if(Arr[i] == Arr[j]){
                    check = false;
                }
                if(Arr[i] - Arr[j] == i-j || Arr[i] - Arr[j] == j-i){
                    check = false;
                }
            }
        }
        return check;
    }

}
