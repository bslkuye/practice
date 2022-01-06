package baekjoon.level14.no2580;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr = new int[9][9];
    static boolean[] checkArr = new boolean[10];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        boolean fix = true;

        while(fix == true){
            fix = false;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (arr[i][j] == 0) {
                        fix = true;
                        Arrays.fill(checkArr, false);
                        shipJaSearch(i, j);
                        squareSearch(i / 3, j / 3);
                        int check = 0;
                        for (int k = 0; k < 10; k++) {
                            if (checkArr[k] == false) {
                                check++;
                            }
                        }
                        if (check == 1) {
                            for (int k = 0; k < 10; k++) {
                                if (checkArr[k] == false) {
                                    arr[i][j] = k;
                                }
                            }
                        }
                    }
                }
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

    public static void shipJaSearch(int x, int y){
        for(int i = 0; i < 9; i++){
            checkArr[arr[i][y]] = true;
            checkArr[arr[x][i]] = true;
        }
    }

    public static void squareSearch(int x, int y){
        int firstX = x * 3;
        int firstY = y * 3;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                checkArr[arr[firstX+i][firstY+j]] = true;
            }
        }

    }


}
//https://www.acmicpc.net/problem/2580