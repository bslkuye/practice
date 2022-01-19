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
        if(n == N/2){
            for(int i = n; i < N; i++){
                teamArr[n] = true;
                checkStatus();
                teamArr[n] = false;
            }
        }else{
            for(int i = n; i < N; i++){
                teamArr[i] = true;
                loop(i+1);
                teamArr[i] = false;
            }
        }
    }
    public static void checkStatus(){
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(teamArr[i] == teamArr[j] && teamArr[i]){//true team
                    teamA += statusArr[i][j];
                }else if(teamArr[i] == teamArr[j] && !teamArr[i]){//false team
                    teamB += statusArr[i][j];
                }
            }
        }
        System.out.println("result = " + Math.abs(teamA - teamB));
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
