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
dp[][] 로 2차 배열을 해서 arr 수와 현재 숫자에 대한 result를 저장

0 1 2 3 4 5 6 7 8 9 arr1
0 1 2 3 4 5 6(7)8 9 arr2
0 1 2 3 4 5 6 7 8 9 arr3
0 1 2 3 4 5 6 7 8 9 arr4

저 위치에서 7은 dp[2][7] 이고 값은 4
dp[1][8] = dp[2][7] + dp[2][9]

https://www.acmicpc.net/problem/10844

쉬운 계단 수
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	98810	30747	22029	29.210%
문제
45656이란 수를 보자.

이 수는 인접한 모든 자리의 차이가 1이다. 이런 수를 계단 수라고 한다.

N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구해보자. 0으로 시작하는 수는 계단수가 아니다.

입력
첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.

출력
첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.

예제 입력 1
1
예제 출력 1
9
예제 입력 2
2
예제 출력 2
17
 */