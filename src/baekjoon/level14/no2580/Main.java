package baekjoon.level14.no2580;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[][] board = new int[9][9];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i=0;i<9;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        sudoku(0, 0);

        br.close();
    }

    public static void sudoku(int y, int x) {
        if(x==9) {
            sudoku(y+1, 0);
            return;
        }

        if(y==9){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<9;i++) {
                for(int j=0;j<9;j++) {
                    sb.append(board[i][j]).append(" ");
                }
                sb.append("\n");
            }
            System.out.println(sb);
            System.exit(0);
        }

        if(board[y][x]==0) {
            for(int i=1;i<=9;i++) {
                if(check(y, x, i)) {
                    board[y][x] = i;
                    sudoku(y, x+1);
                }
            }
            board[y][x] = 0;
            return;
        }

        sudoku(y, x+1);
    }

    public static boolean check(int y, int x, int num) {
        if(!checkLine(y, x, num)) return false;
        if(!checkSection(y, x, num)) return false;

        return true;
    }

    public static boolean checkLine(int y, int x, int num) {
        for(int i=0;i<9;i++) {
            if(board[y][i]==num) return false;
            if(board[i][x]==num) return false;
        }

        return true;
    }

    public static boolean checkSection(int y, int x, int num) {
        int sectionY = (y/3)*3;
        int sectionX = (x/3)*3;

        for(int i=sectionY;i<sectionY+3;i++) {
            for(int j=sectionX;j<sectionX+3;j++) {
                if(board[i][j]==num) return false;
            }
        }

        return true;
    }

}
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class Main {
//    static int[][] arr = new int[9][9];
//    static boolean[] checkArr = new boolean[10];
//    static int nullCount = 0;
//    static int[] ableArr;
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        for(int i = 0; i < 9; i++){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for(int j = 0; j < 9; j++){
//                arr[i][j] = Integer.parseInt(st.nextToken());
//                if(arr[i][j] == 0){
//                    nullCount++;
//                }
//            }
//        }
//        ableArr = new int[nullCount];
//
//        boolean fix = true;
//
//        while(fix == true){
//            fix = false;
//            for (int i = 0; i < 9; i++) {
//                for (int j = 0; j < 9; j++) {
//                    if (arr[i][j] == 0) {
//                        fix = true;
//                        Arrays.fill(checkArr, false);
//                        shipJaSearch(i, j);
//                        squareSearch(i / 3, j / 3);
//                        int check = 0;
//                        for (int k = 0; k < 10; k++) {
//                            if (checkArr[k] == false) {
//                                check++;
//                            }
//                        }
//                        if (check == 1) {
//                            for (int k = 0; k < 10; k++) {
//                                if (checkArr[k] == false) {
//                                    arr[i][j] = k;
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        for(int i = 0; i < 9; i++){
//            for(int j = 0; j < 9; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println("");
//        }
//
//
//        br.close();
//    }
//
//    public static void shipJaSearch(int x, int y){
//        for(int i = 0; i < 9; i++){
//            checkArr[arr[i][y]] = true;
//            checkArr[arr[x][i]] = true;
//        }
//    }
//
//    public static void squareSearch(int x, int y){
//        int firstX = x * 3;
//        int firstY = y * 3;
//        for(int i = 0; i < 3; i++){
//            for(int j = 0; j < 3; j++){
//                checkArr[arr[firstX+i][firstY+j]] = true;
//            }
//        }
//
//    }
//
//
//}
//https://www.acmicpc.net/problem/2580