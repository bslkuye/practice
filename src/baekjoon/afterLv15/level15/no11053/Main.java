package baekjoon.afterLv15.level15.no11053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] insArr = new int[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++){
            insArr[i] = Integer.parseInt(st.nextToken());
        }


        br.close();
    }
}
/*
수열 같은 차를 가지는 수의 배열인데
2가지 정해야함
수열의 시작과 수열의 차
등차수열인가? 아닌가?
증가하는 수열이니까 증가만 하면 되나

https://www.acmicpc.net/problem/11053

가장 긴 증가하는 부분 수열
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	98178	38503	25259	37.192%
문제
수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.

예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.

입력
첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.

둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)

출력
첫째 줄에 수열 A의 가장 긴 증가하는 부분 수열의 길이를 출력한다.

예제 입력 1
6
10 20 10 30 20 50
예제 출력 1
4
 */