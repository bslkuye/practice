package baekjoon.afterLv15.level15.no10844;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int[] resultArr;
    static long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        resultArr = new int[N+1];
        dp = new long[N+1][10];

        for(int i = 0; i < 10; i++){
            dp[0][i] = 1;
        }

        long result = 0;
        for(int i = 1; i < 10; i++){
            result += stairsNum(N-1,i);
        }
        System.out.println(result % 1000000000);

        br.close();

    }

    public static long stairsNum(int arrNum, int bNum){
        if(dp[arrNum][bNum] == 0){
            if (bNum != 0 && bNum != 9) {
                dp[arrNum][bNum] += stairsNum(arrNum - 1, bNum + 1) % 1000000000;
                dp[arrNum][bNum] += stairsNum(arrNum - 1, bNum - 1) % 1000000000;
            } else if (bNum == 0) {
                dp[arrNum][bNum] = stairsNum(arrNum - 1, bNum + 1) % 1000000000;
            } else if (bNum == 9) {
                dp[arrNum][bNum] = stairsNum(arrNum - 1, bNum - 1) % 1000000000;
            }
        }

        return dp[arrNum][bNum];
    }
}


/*
dp[][] �� 2�� �迭�� �ؼ� arr ���� ���� ���ڿ� ���� result�� ����

0 1 2 3 4 5 6 7 8 9 arr1
0 1 2 3 4 5 6(7)8 9 arr2
0 1 2 3 4 5 6 7 8 9 arr3
0 1 2 3 4 5 6 7 8 9 arr4

�� ��ġ���� 7�� dp[2][7] �̰� ���� 4
dp[1][8] = dp[2][7] + dp[2][9]

https://www.acmicpc.net/problem/10844

���� ��� ��
�ð� ����	�޸� ����	����	����	���� ���	���� ����
1 ��	256 MB	98810	30747	22029	29.210%
����
45656�̶� ���� ����.

�� ���� ������ ��� �ڸ��� ���̰� 1�̴�. �̷� ���� ��� ����� �Ѵ�.

N�� �־��� ��, ���̰� N�� ��� ���� �� �� �� �ִ��� ���غ���. 0���� �����ϴ� ���� ��ܼ��� �ƴϴ�.

�Է�
ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 100���� �۰ų� ���� �ڿ����̴�.

���
ù° �ٿ� ������ 1,000,000,000���� ���� �������� ����Ѵ�.

���� �Է� 1
1
���� ��� 1
9
���� �Է� 2
2
���� ��� 2
17
 */