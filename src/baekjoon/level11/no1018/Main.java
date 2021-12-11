package baekjoon.level11.no1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        boolean[][] chessBoard = new boolean[x][y];
        for(int i = 0; i < x; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            String input = st1.nextToken();
            for(int j = 0; j < y; j++){
                if(input.charAt(j) == 'B'){ // b = true / w = false
                    chessBoard[i][j] = true;
                }else chessBoard[i][j] = false;
            }
        }
        int smol = 64;

        for(int i = 0; i < x - 7; i++){
            for(int j = 0; j < y - 7; j++) {

                int count1 = 0;
                int count2 = 0;

                for(int a = 0; a < 8; a+=2){
                    for(int b = 0; b < 8; b+=2){
                        if(chessBoard[i+a][j+b] == true){
                            count1++;
                        }else count2++;
                        if(chessBoard[i+a][j+b+1] == true){
                            count2++;
                        }else count1++;
                    }
                    for(int b = 0; b < 8; b+=2){
                        if(chessBoard[i+a+1][j+b] == true){
                            count2++;
                        }else count1++;
                        if(chessBoard[i+a+1][j+b+1] == true){
                            count1++;
                        }else count2++;
                    }
                }
                if(count1 < smol) smol = count1;
                if(count2 < smol) smol = count2;
            }
        }
        System.out.println(smol);
        br.close();
    }
}
