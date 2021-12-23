package baekjoon.level12.no1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[51][n];


        for(int i = 0; i < n; i++){
            String input = br.readLine();
            for(int j = 0; j < n; j++){
                if(arr[input.length()][j] == null){
                    arr[input.length()][j] = input;
                    break;
                }
            }
        }

        for(int i = 0; i < n; i++){
            String result;
            for(int j = 0; j < n; j++){
                if(arr[i][j] != null){
                    System.out.println(arr[i][j]);
                }else break;
            }

        }

        br.close();
    }
}
