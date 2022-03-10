package baekjoon.afterLv15.level15.no1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] paintCost;
    static int result;
    static int minResult = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        paintCost = new int[N+2][3];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            paintCost[i][0] = Integer.parseInt(st.nextToken());
            paintCost[i][1] = Integer.parseInt(st.nextToken());
            paintCost[i][2] = Integer.parseInt(st.nextToken());
        }
        costCheck(0,0);
        costCheck(0,1);
        costCheck(0,2);

        System.out.println(minResult);
        br.close();
    }

    public static void costCheck(int n , int color){
        result += paintCost[n][color];
        int caseA = Math.min(paintCost[n+1][0]+paintCost[n+2][1],paintCost[n+1][0]+paintCost[n+2][2]); // color == 0�϶� �ּҰ�
        int caseB = Math.min(paintCost[n+1][1]+paintCost[n+2][0],paintCost[n+1][1]+paintCost[n+2][2]); // 1
        int caseC = Math.min(paintCost[n+1][2]+paintCost[n+2][0],paintCost[n+1][2]+paintCost[n+2][1]); // 2

        if (n != N-1){
            if (color == 0) {
                if(caseC < caseB){ //0 �����ϰ�
                    costCheck(n+1, 2);
                }else if(caseC == caseB && paintCost[n+1][1] > paintCost[n+1][2]){ // ���� ������ ����ó��
                    costCheck(n+1,2);
                }else {
                    costCheck(n+1, 1);
                }

            } else if (color == 1) {
                if(caseA < caseC){ //1 �����ϰ�
                    costCheck(n+1, 0);
                }else if(caseC == caseB && paintCost[n+1][2] > paintCost[n+1][0]){
                    costCheck(n+1,0);
                }else {
                    costCheck(n+1, 2);
                }

            } else if (color == 2) {
                if(caseA < caseB){ //2 �����ϰ�
                    costCheck(n+1, 0);
                }else if(caseC == caseB && paintCost[n+1][1] > paintCost[n+1][0]){
                    costCheck(n+1,0);
                }else {
                    costCheck(n+1, 1);
                }

            }
        }
        if(n == N-1){
            if(minResult == -1) {
                minResult = result;
            }else if(minResult > result){
                minResult = result;
            }

        }
        result = 0;

    }


}
/*
����Լ��� N��ŭ�� ���� ������ ���鶧 ������ �����ϵ��� ����
�ƴϸ� 0,1 2���� ���� ���� ���� ���� �� �Ʒ��� �ϳ���?
N�ڸ����� 2���� ����� �Լ�

https://www.acmicpc.net/problem/1149

1 100 100
1 1000 100
1000000000 100 100000000000000
�׳� ������ ���߿� ������ �����ϸ� �ɵ�? - �ȵ�

���� �� ���� ����Ʈ�� �̸� ����ؼ� ���� �ڽ�Ʈ�� ������
1 2 3
4 5 6
7 8 9
��� �� �� 1�� ����ٸ� ���� ����ϴ� �ٰŴ� 5+7 5+9 6+7 6+8 �� ���� �ڽ�Ʈ�� �� ���� ��
5+9�� ���� ���ٸ� 5�� �����ϰ� 789�� ���ؼ��� ���� ��� �ݺ�(���� ���� �ڽ�Ʈ�� �����ϴ� ����� ���� ���)


���� �����Էµ� �߳�����
5
1 10 10
1 10 10
1 10 10
1 10 10
1 10 10 ó�� ����ó���� �ߴµ� ����ó���� �ȵ�
���� ������ �𸣰ھ ���� ������ ����ϴ� Ǯ��߰���


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
���� �Է� 2
3
1 100 100
100 1 100
100 100 1
���� ��� 2
3
���� �Է� 3
3
1 100 100
100 100 100
1 100 100
���� ��� 3
102
���� �Է� 4
6
30 19 5
64 77 64
15 19 97
4 71 57
90 86 84
93 32 91
���� ��� 4
208
���� �Է� 5
8
71 39 44
32 83 55
51 37 63
89 29 100
83 58 11
65 13 15
47 25 29
60 66 19
���� ��� 5
253
 */