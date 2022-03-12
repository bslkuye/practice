package baekjoon.afterLv15.level15.no1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];

        if(N >= 2){
            dp[2] = 1;
            if(N >= 3){
                dp[3] = 1;
            }
        }

        for(int i = 4; i <= N; i++){
            if(i % 6 == 0){
                dp[i] = Math.min(dp[i / 3], Math.min(dp[i / 2], dp[i - 1])) + 1;
            } else if (i % 3 == 0) {
                dp[i] = Math.min(dp[i / 3], dp[i - 1]) + 1;
            } else if (i % 2 == 0) {
                dp[i] = Math.min(dp[i / 2], dp[i - 1]) + 1;
            }else {
                dp[i] = dp[i - 1] + 1;
            }
        }

        System.out.println(dp[N]);


        br.close();
    }

}

/*
https://www.acmicpc.net/problem/1463

1�� �����
�ð� ����	�޸� ����	����	����	���� ���	���� ����
0.15 �� (�ϴ� ����)	128 MB	187911	60638	38560	32.019%
����
���� X�� ����� �� �ִ� ������ ������ ���� �� ���� �̴�.

X�� 3���� ������ ��������, 3���� ������.
X�� 2�� ������ ��������, 2�� ������.
1�� ����.
���� N�� �־����� ��, ���� ���� ���� �� ���� ������ ����ؼ� 1�� ������� �Ѵ�. ������ ����ϴ� Ƚ���� �ּڰ��� ����Ͻÿ�.

�Է�
ù° �ٿ� 1���� ũ�ų� ����, 106���� �۰ų� ���� ���� N�� �־�����.

���
ù° �ٿ� ������ �ϴ� Ƚ���� �ּڰ��� ����Ѵ�.

���� �Է� 1
2
���� ��� 1
1
���� �Է� 2
10
���� ��� 2
3
 */
