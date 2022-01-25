package baekjoon.level15.no1003;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int countZero = 0;
    public static int countOne = 0;

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int N = 0;
        for(int i = 0; i < T; i++){
            N = Integer.parseInt(br.readLine());
            fibonacci(N);
            System.out.println(countZero + " " + countOne);
            countOne = 0;
            countZero = 0;
        }
    }

    public static int fibonacci(int n){
        if (n == 0) {
            countZero++;
            return 0;
        } else if (n == 1) {
            countOne++;
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

}
//https://www.acmicpc.net/problem/1003