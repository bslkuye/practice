package baekjoon.afterLv15.level15.no1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.BatchUpdateException;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] paintCost;
    static int[] paintArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        paintCost = new int[3][N];
        paintArr = new int[N];
        for(int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                paintCost[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        br.close();
    }

    public static void ArrMake(int n){

    }

    //����Լ��� N��ŭ�� ���� ������ ���鶧 ������ �����ϵ��� ����
    //�ƴϸ� 0,1 2���� ���� ���� ���� ���� �� �Ʒ��� �ϳ���?
    //N�ڸ����� 2���� ����� �Լ�
}

//https://www.acmicpc.net/problem/1149