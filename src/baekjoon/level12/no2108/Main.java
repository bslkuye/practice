package baekjoon.level12.no2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int input = Integer.parseInt(br.readLine());
        int max = input;
        int min = input;
        int summ = input;
        int[] arr = new int[n];
        int[] count = new int[8001];
        arr[0] = input;
        for(int i = 1; i < n; i++){
            input = Integer.parseInt(br.readLine());
            arr[i] = input;
            summ += input;
            if(input > max) {
                max = input;
            }else if(input < min) min = input;
        }
        if(n != 1){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n-1; j++){
                    int a = arr[j];
                    int b = arr[j+1];
                    if(a > b){
                        arr[j+1] = a;
                        arr[j] = b;
                    }
                }
            }
        }
        System.out.println(summ);
        System.out.println(arr[(n+1)/2]);
        System.out.println();
        System.out.println(max - min);
        br.close();
    }
}
