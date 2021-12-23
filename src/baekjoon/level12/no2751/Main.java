package baekjoon.level12.no2751;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[2000001];
        Arrays.fill(arr,false);
        for(int i = 0; i < n; i++){
            int input = Integer.parseInt(br.readLine());
            arr[input + 1000000] = true;
        }
        int count = 0;
        for(int i = -1000000; i <= 1000000; i++){
            if(arr[i + 1000000] == true){
                bw.write(i + "\n");
                count++;
            }
            if(count == n) break;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}