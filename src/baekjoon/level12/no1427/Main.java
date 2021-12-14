package baekjoon.level12.no1427;

import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10];
        int length = (int)(Math.log10(n)+1);

        for(int i = 0; i < length; i++){
            int value = n % 10;
            n /= 10;
            arr[value]++;
        }

        for(int i = 9; i >= 0; i--){
            for(int j = 0; j < arr[i]; j++){
                System.out.print(i);
            }
        }

        br.close();
    }
}
