package baekjoon.afterLv15.level15.no2579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] inputArr = new int[N];

        for(int i = 0; i < N; i++){
            inputArr[i] = Integer.parseInt(br.readLine());
        }

    }
}
/*
10 20 30 40 50 60 70 80
10 00 30 00 50 60 00 80

N-1 ,N-2 만큼의 arr을 2,3으로 끊는 경우의 수


시작부터 치면 1,2중 몇으로 끊을지
2,3으로 끊는데 마지막에 1,2 남겨야함
5
2 2 1
10101
11011

0,1 로 구별한다고 치면
1 일때
 뒤 수가 0이면 하나 더 먹을지 건널지(2개)
 뒤 수가 1이면 건너뛰어야함

0일때 하나 더 먹을지 두개 더 먹을지(앞 3개 확인)
앞뒤가 1로 끝나는 배열을 생각한다면
1101101
101
1101
101101

https://www.acmicpc.net/problem/2579

계단 오르기
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	110346	37823	27375	34.383%
문제
계단 오르기 게임은 계단 아래 시작점부터 계단 꼭대기에 위치한 도착점까지 가는 게임이다. <그림 1>과 같이 각각의 계단에는 일정한 점수가 쓰여 있는데 계단을 밟으면 그 계단에 쓰여 있는 점수를 얻게 된다.



<그림 1>

예를 들어 <그림 2>와 같이 시작점에서부터 첫 번째, 두 번째, 네 번째, 여섯 번째 계단을 밟아 도착점에 도달하면 총 점수는 10 + 20 + 25 + 20 = 75점이 된다.



<그림 2>

계단 오르는 데는 다음과 같은 규칙이 있다.

계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다. 즉, 한 계단을 밟으면서 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.
연속된 세 개의 계단을 모두 밟아서는 안 된다. 단, 시작점은 계단에 포함되지 않는다.
마지막 도착 계단은 반드시 밟아야 한다.
따라서 첫 번째 계단을 밟고 이어 두 번째 계단이나, 세 번째 계단으로 오를 수 있다. 하지만, 첫 번째 계단을 밟고 이어 네 번째 계단으로 올라가거나, 첫 번째, 두 번째, 세 번째 계단을 연속해서 모두 밟을 수는 없다.

각 계단에 쓰여 있는 점수가 주어질 때 이 게임에서 얻을 수 있는 총 점수의 최댓값을 구하는 프로그램을 작성하시오.

입력
입력의 첫째 줄에 계단의 개수가 주어진다.

둘째 줄부터 한 줄에 하나씩 제일 아래에 놓인 계단부터 순서대로 각 계단에 쓰여 있는 점수가 주어진다. 계단의 개수는 300이하의 자연수이고, 계단에 쓰여 있는 점수는 10,000이하의 자연수이다.

출력
첫째 줄에 계단 오르기 게임에서 얻을 수 있는 총 점수의 최댓값을 출력한다.

예제 입력 1
6
10
20
15
25
10
20
예제 출력 1
75
 */