package baekjoon.afterLv15.level15.no1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solution {
    public static int N;
    public static int[][] colorCost;
    public static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        colorCost = new int[N][3];
        dp = new int[N][3];

        for(int i=0;i<N;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            colorCost[i][0] = Integer.parseInt(st.nextToken());
            colorCost[i][1] = Integer.parseInt(st.nextToken());
            colorCost[i][2] = Integer.parseInt(st.nextToken());
        }

        dp[0][0] = colorCost[0][0];
        dp[0][1] = colorCost[0][1];
        dp[0][2] = colorCost[0][2];

        System.out.println(Math.min(paint(N - 1, 0), Math.min(paint(N - 1, 1), paint(N - 1, 2))));

        br.close();
    }

    public static int paint(int idx, int color) {
        if(dp[idx][color] == 0) {
            if(color == 0) {
                dp[idx][0] = Math.min(paint(idx - 1, 1), paint(idx - 1, 2)) + colorCost[idx][0];
            }else if(color == 1) {
                dp[idx][1] = Math.min(paint(idx - 1, 0), paint(idx - 1, 2)) + colorCost[idx][1];
            }else if(color == 2) {
                dp[idx][2] = Math.min(paint(idx - 1, 0), paint(idx - 1, 1)) + colorCost[idx][2];
            }
        }

        return dp[idx][color];
    }

}

/*
����
RGB�Ÿ����� ���� N�� �ִ�. �Ÿ��� �������� ��Ÿ�� �� �ְ�, 1�� ������ N�� ���� ������� �ִ�.
���� ����, �ʷ�, �Ķ� �� �ϳ��� ������ ĥ�ؾ� �Ѵ�. ������ ���� ����, �ʷ�, �Ķ����� ĥ�ϴ� ����� �־����� ��, �Ʒ� ��Ģ�� �����ϸ鼭 ��� ���� ĥ�ϴ� ����� �ּڰ��� ���غ���.
1�� ���� ���� 2�� ���� ���� ���� �ʾƾ� �Ѵ�.
N�� ���� ���� N-1�� ���� ���� ���� �ʾƾ� �Ѵ�.
i(2 �� i �� N-1)�� ���� ���� i-1��, i+1�� ���� ���� ���� �ʾƾ� �Ѵ�.
�Է�
ù° �ٿ� ���� �� N(2 �� N �� 1,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� �� ���� ����, �ʷ�, �Ķ����� ĥ�ϴ� ����� 1�� ������ �� �ٿ� �ϳ��� �־�����. ���� ĥ�ϴ� ����� 1,000���� �۰ų� ���� �ڿ����̴�.
���
ù° �ٿ� ��� ���� ĥ�ϴ� ����� �ּڰ��� ����Ѵ�.
���� �Է� 1
3
26 40 83
49 60 57
13 89 99
���� ��� 1
96
*/