package baekjoon.afterLv15.level15.no1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.BatchUpdateException;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] paintCost;
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        paintCost = new int[N+1][3];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            paintCost[i][0] = Integer.parseInt(st.nextToken());
            paintCost[i][1] = Integer.parseInt(st.nextToken());
            paintCost[i][2] = Integer.parseInt(st.nextToken());
        }
        int costA = costCheck(0,0);
        int costB = costCheck(0,1);
        int costC = costCheck(0,2);

        System.out.println(Math.min(costA,Math.min(costB, costC)));

        br.close();
    }

    public static int costCheck(int n , int color){
        result += paintCost[n][color];

        int caseA = Math.min(paintCost[n][0]+paintCost[n+1][1],paintCost[n][0]+paintCost[n+1][2]); // color == 0일때 최소값
        int caseB = Math.min(paintCost[n][1]+paintCost[n+1][0],paintCost[n][1]+paintCost[n+1][2]); // 1
        int caseC = Math.min(paintCost[n][2]+paintCost[n+1][0],paintCost[n][2]+paintCost[n+1][1]); // 2

        if (n != N){
            if (color == 0) {
                if(caseC < caseB){ //0 선택하고
                    costCheck(n+1, 2);
                }else{
                    costCheck(n+1, 1);
                }

            } else if (color == 1) {
                if(caseA < caseC){ //0 선택하고
                    costCheck(n+1, 0);
                }else{
                    costCheck(n+1, 2);
                }

            } else if (color == 2) {
                if(caseA < caseB){ //0 선택하고
                    costCheck(n+1, 0);
                }else{
                    costCheck(n+1, 1);
                }

            }
        }else{
            int returnResutl = result;
            result = 0;
            return returnResutl;
        }
        return 0;
    }


}
/*
재귀함수로 N만큼의 수열 돌리고 만들때 조건을 만족하도록 돌림
아니면 0,1 2진수 수열 만들어서 전거 제외 위 아레중 하나로?
N자릿수의 2진수 만드는 함수

https://www.acmicpc.net/problem/1149

1 100 100
1 1000 100
1000000000 100 100000000000000
그냥 다음수 둘중에 작은거 선택하면 될듯? - 안됨

다음 두 번의 페인트를 미리 계산해서 낮은 코스트를 선택함
1 2 3
4 5 6
7 8 9
라고 할 때 1을 골랐다면 다음 계산하는 근거는 5+7 5+9 6+7 6+8 중 낮은 코스트의 앞 수를 고름
5+9가 가장 낮다면 5를 선택하고 789에 대해서도 같은 방법 반복(가장 낮은 코스트를 선택하는 경우의 수를 계산)

 */