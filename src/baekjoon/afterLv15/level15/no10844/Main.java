package baekjoon.afterLv15.level15.no10844;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int[] resultArr;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        resultArr = new int[N+1];
        stairsNum(0,1);

        System.out.println(result);
        br.close();

    }

    public static void stairsNum(int arrNum, int bNum){
        resultArr[arrNum] = bNum;
        if(arrNum != N - 1){
            if (bNum == 0) {
                stairsNum(arrNum + 1, 1);
            } else if (bNum == 9) {
                stairsNum(arrNum + 1, 8);
            } else {
                stairsNum(arrNum + 1, bNum + 1);
                stairsNum(arrNum + 1, bNum - 1);
            }
        } else if (arrNum == N - 1) {
            result++;
            if(result > 1000000000){
                result -= 1000000000;
            }
//            for(int i = 0; i < N; i ++){
//                System.out.print(resultArr[i] + " ");
//            }
//            System.out.println("");
        }

        if(bNum != 9 && arrNum == 0){
            stairsNum(arrNum, bNum + 1);
        }

    }
}


/*
dp[][] 로 2차 배열을 해서 arr 수와 현재 숫자에 대한 result를 저장



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