package baekjoon.level14.no9663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] cols;
    static int cnt = 0;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        cols = new int[N];

        dfs(0);
        System.out.println(cnt);

        br.close();
    }

    public static void dfs(int idx) {
        if(idx == N) {
            cnt++;
            return;
        }

        for(int i=0;i<N;i++) {
            cols[idx] = i;

            if(check(idx)) {
                dfs(idx+1);
            }
        }
    }

    public static boolean check(int col) {
        for(int i=0;i<col;i++) {
            if(cols[col] == cols[i]) return false;
            else if(Math.abs(col-i) == Math.abs(cols[col]-cols[i])) return false;
        }
        return true;
    }
}

//https://www.acmicpc.net/problem/9663