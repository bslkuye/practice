package baekjoon.afterLv15.level15.no1932;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] inputArr;
    static int maxResult = 0;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        inputArr = new int[N][N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j <= i; j++){
                inputArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        check(N-1);

        br.close();
    }

    public static void check(int n){
        if(n != 0){
            for(int i = 0; i < n; i++){
                if(inputArr[n][i] < inputArr[n][i+1]){
                    inputArr[n-1][i] += inputArr[n][i+1];
                }else{
                    inputArr[n-1][i] += inputArr[n][i];
                }
            }
            check(n-1);
        }else if(n == 0){
            System.out.println(inputArr[0][0]);
        }

    }

}
/*
입력한 arr과 같은 크기의 arr을 만들어서 각 위치에서 합산의 최대치를 기록함
ex)
input
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5
최대치
7
10 15
23 16 15
25 30 20 19
...

아니면 역순으로?

역순으로 짰음


https://www.acmicpc.net/problem/1932

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	59133	33042	24767	58.697%
문제
        7
      3   8
    8   1   0
  2   7   4   4
4   5   2   6   5
위 그림은 크기가 5인 정수 삼각형의 한 모습이다.

맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때, 이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라.
 아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.

삼각형의 크기는 1 이상 500 이하이다. 삼각형을 이루고 있는 각 수는 모두 정수이며, 범위는 0 이상 9999 이하이다.

입력
첫째 줄에 삼각형의 크기 n(1 ≤ n ≤ 500)이 주어지고, 둘째 줄부터 n+1번째 줄까지 정수 삼각형이 주어진다.

출력
첫째 줄에 합이 최대가 되는 경로에 있는 수의 합을 출력한다.

예제 입력 1
5
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5
예제 출력 1
30
 */