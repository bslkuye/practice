package baekjoon.level14.no14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] operatorArr = new int [N-1];
        int operatorArrCount = 0;

        for(int i = 0; i < 4; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int cost = Integer.parseInt(st1.nextToken());
            for(int j = 0; j < cost; j++){
                operatorArr[operatorArrCount] = i;
                operatorArrCount++;
            }
        }
        br.close();

    }

    public static int operator(int num, int x, int y){
        if(num == 0){
            return x + y;
        }else if(num == 1){
            return x - y;
        }else if(num == 2){
            return x * y;
        }else return x / y;
    }
}
//https://www.acmicpc.net/problem/14888
/*
input
ù° �ٿ� ���� ���� N(2 �� N �� 11)�� �־�����.
��° �ٿ��� A1, A2, ..., AN�� �־�����. (1 �� Ai �� 100)
��° �ٿ��� ���� N-1�� 4���� ������ �־����µ�, ���ʴ�� ����(+)�� ����,
  ����(-)�� ����, ����(��)�� ����, ������(��)�� �����̴�.

���� ������ �ȹٲ㵵 ��

������ ����
����
 */