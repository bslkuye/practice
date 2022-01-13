package baekjoon.level14.no14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int N;
    public static int[] nums;
    public static int[] opers = new int[4];
    public static int min = Integer.MAX_VALUE;
    public static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        nums = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<4;i++) {
            opers[i] = Integer.parseInt(st.nextToken());
        }

        dfs(nums[0], 1);

        System.out.println(max);
        System.out.println(min);

        br.close();
    }

    public static void dfs(int num, int idx) {
        if(idx==N) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for(int i=0;i<4;i++) {
            if(0 < opers[i]) {
                opers[i]--;
                if(i==0) dfs(num + nums[idx], idx+1);
                else if(i==1) dfs(num - nums[idx], idx+1);
                else if(i==2) dfs(num * nums[idx], idx+1);
                else if(i==3) dfs(num / nums[idx], idx+1);
                opers[i]++;
            }
        }
    }

}
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int[] arr = new int[N];
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        for(int i = 0; i < N; i++){
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        int[] operatorArr = new int [N-1];
//        int operatorArrCount = 0;
//
//        for(int i = 0; i < 4; i++){
//            StringTokenizer st1 = new StringTokenizer(br.readLine());
//            int cost = Integer.parseInt(st1.nextToken());
//            for(int j = 0; j < cost; j++){
//                operatorArr[operatorArrCount] = i;
//                operatorArrCount++;
//            }
//        }
//
//
//        br.close();
//
//    }
//
//    public static int operator(int num, int x, int y){
//        if(num == 0){
//            return x + y;
//        }else if(num == 1){
//            return x - y;
//        }else if(num == 2){
//            return x * y;
//        }else return x / y;
//    }
//}
//https://www.acmicpc.net/problem/14888
/*
input
ù° �ٿ� ���� ���� N(2 �� N �� 11)�� �־�����.
��° �ٿ��� A1, A2, ..., AN�� �־�����. (1 �� Ai �� 100)
��° �ٿ��� ���� N-1�� 4���� ������ �־����µ�, ���ʴ�� ����(+)�� ����,
  ����(-)�� ����, ����(��)�� ����, ������(��)�� �����̴�.

���� ������ �ȹٲ㵵 ��

������ ����
����
 */