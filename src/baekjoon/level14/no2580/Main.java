package baekjoon.level14.no2580;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr = new int[9][9];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        br.close();
    }

}
