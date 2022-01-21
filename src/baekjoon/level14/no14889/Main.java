package baekjoon.level14.no14889;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int[][] statusArr;
    public static boolean[] teamArr;
    public static int N;
    public static int teamA = 0;
    public static int teamB = 0;
    public static int result = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        statusArr = new int[N][N];
        teamArr = new boolean[N];
        Arrays.fill(teamArr,false);

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                statusArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        loop(0);

        System.out.println("result = "+result);
        br.close();
    }

    public static void loop(int n){
        for(int i = n; i < N/2+n; i++){
            teamArr[i] = true;
            if(n == N/2 - 1){
                checkStatus();
                for(int j = 0; j < N; j++){
                    System.out.print(teamArr[j] + " ");
                }
                System.out.println("");
            }else loop(i+1);
            teamArr[i] = false;
        }
    }
    public static void checkStatus(){
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(teamArr[i] == teamArr[j] && teamArr[i]){
                    teamA += statusArr[i][j];
                }else if(teamArr[i] == teamArr[j] && !teamArr[i]){
                    teamB += statusArr[i][j];
                }
            }
        }
        if(result == -1){
            result = Math.abs(teamA - teamB);
        }else if(result > Math.abs(teamA - teamB)){
            result = Math.abs(teamA - teamB);
        }
        teamB = 0;
        teamA = 0;
    }

}
//https://www.acmicpc.net/problem/14889
