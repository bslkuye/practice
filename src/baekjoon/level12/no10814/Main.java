package baekjoon.level12.no10814;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] nameArr = new String[n];
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken()) * 10000000 + i;
            nameArr[i] = (arr[i] / 10000000) + " " + st.nextToken();
        }
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            bw.write(nameArr[arr[i] % 10000000] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

}

//https://www.acmicpc.net/problem/10814