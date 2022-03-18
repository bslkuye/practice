package baekjoon.afterLv15.level15.no2156;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] insArr;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        insArr = new int[N + 1];
        dp = new int[N + 1];

        for(int i = 1; i <= N; i++){
            insArr[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = insArr[1];
        if(N >= 2) dp[2] = insArr[1] + insArr[2];
        if(N >= 3) dp[3] = insArr[1] + insArr[2] + insArr[3];

        System.out.println(Math.max(drink(N),drink(N+1)));


        br.close();

    }

    public static int drink(int n){
        if(n <= 0) return 0;

        if(dp[n] == 0){
            dp[n] = Math.max(drink(n - 2) + insArr[n], drink(n - 3) + insArr[n - 1] + insArr[n]);
        }

        return dp[n];
    }

}


/*
�̰� ���� ó���Ÿ� ������ ������ �����ϸ� �ɵ�
dring(0) , drink(1) �̷���

101
1011
10

101
1101
0101
01101

https://www.acmicpc.net/problem/2156

������ �ý�
�ð� ����	�޸� ����	����	����	���� ���	���� ����
2 ��	128 MB	93320	31726	22759	32.767%
����
ȿ�ִ� ������ �ý�ȸ�� ����. �� ���� ������, ���̺� ���� �پ��� �����ְ� ����ִ� ������ ���� �Ϸķ� ���� �־���. ȿ�ִ� ������ �ý��� �Ϸ��� �ϴµ�, ���⿡�� ������ ���� �� ���� ��Ģ�� �ִ�.

������ ���� �����ϸ� �� �ܿ� ����ִ� �����ִ� ��� ���ž� �ϰ�, ���� �Ŀ��� ���� ��ġ�� �ٽ� ���ƾ� �Ѵ�.
�������� ���� �ִ� 3���� ��� ���� ���� ����.
ȿ�ִ� �� �� �ִ� ��� ���� ���� �����ָ� ������ ���ؼ� � ������ ���� �����ؾ� ���� ����ϰ� �ִ�. 1���� n������ ��ȣ�� �پ� �ִ� n���� ������ ���� ������� ���̺� ���� ���� �ְ�,
�� ������ �ܿ� ����ִ� �������� ���� �־����� ��, ȿ�ָ� ���� ���� ���� ���� �����ָ� ���� �� �ֵ��� �ϴ� ���α׷��� �ۼ��Ͻÿ�.

���� ��� 6���� ������ ���� �ְ�, ������ �ܿ� ������� 6, 10, 13, 9, 8, 1 ��ŭ�� �����ְ� ��� ���� ��, ù ��°, �� ��°, �� ��°, �ټ� ��° ������ ���� �����ϸ� �� ������ ���� 33���� �ִ�� ���� �� �ִ�.

�Է�
ù° �ٿ� ������ ���� ���� n�� �־�����. (1 �� n �� 10,000) ��° �ٺ��� n+1��° �ٱ��� ������ �ܿ� ����ִ� �������� ���� ������� �־�����. �������� ���� 1,000 ������ ���� �ƴ� �����̴�.

���
ù° �ٿ� �ִ�� ���� �� �ִ� �������� ���� ����Ѵ�.

���� �Է� 1
6
6
10
13
9
8
1
���� ��� 1
33
 */
