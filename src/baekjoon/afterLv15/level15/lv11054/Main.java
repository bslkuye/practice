package baekjoon.afterLv15.level15.lv11054;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] dpL;
    static int[] dpR;
    static int N;
    static int[] inpArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        inpArr = new int[N+1];
        dpL = new int[N+1];
        dpR = new int[N+1];

        for (int i = 1; i <= N; i++){
            inpArr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        for(int i = 1; i <= N; i++){
            Arrays.fill(dpL,0);
            Arrays.fill(dpR,0);
            sequenceL(i);
            sequenceR(i);
            if (result < dpL[i] + dpR[i] -1){
                result = dpL[i] + dpR[i] -1;
            }
        }

        System.out.println(result);


        br.close();
    }

    public static int sequenceL(int n){
        if (dpL[n] == 0) {
            dpL[n] = 1;
            for (int i = n - 1; i >= 1; i--){
                if(inpArr[n] > inpArr[i]){
                    dpL[n] = Math.max(sequenceL(i)+1,dpL[n]);
                }
            }
        }

        return dpL[n];
    }

    public static int sequenceR(int n){
        if (dpR[n] == 0) {
            dpR[n] = 1;
            for (int i = n + 1; i <= N; i++){
                if(inpArr[n] > inpArr[i]){
                    dpR[n] = Math.max(sequenceR(i)+1,dpR[n]);
                }
            }
        }

        return dpR[n];
    }


}


/*
������ �� N�� ���� �¿�� �۶߸��� �ɵ�?


https://www.acmicpc.net/problem/11054

���� �� ������� �κ� ����
�ð� ����	�޸� ����	����	����	���� ���	���� ����
1 ��	256 MB	32755	16669	13045	50.876%
����
���� S�� � �� Sk�� �������� S1 < S2 < ... Sk-1 < Sk > Sk+1 > ... SN-1 > SN�� �����Ѵٸ�, �� ������ ������� �����̶�� �Ѵ�.

���� ���, {10, 20, 30, 25, 20}�� {10, 20, 30, 40}, {50, 40, 25, 10} �� ������� ����������,  {1, 2, 3, 2, 1, 2, 3, 2, 1}�� {10, 20, 30, 40, 20, 30} �� ������� ������ �ƴϴ�.

���� A�� �־����� ��, �� ������ �κ� ���� �� ������� �����̸鼭 ���� �� ������ ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� A�� ũ�� N�� �־�����, ��° �ٿ��� ���� A�� �̷�� �ִ� Ai�� �־�����. (1 �� N �� 1,000, 1 �� Ai �� 1,000)

���
ù° �ٿ� ���� A�� �κ� ���� �߿��� ���� �� ������� ������ ���̸� ����Ѵ�.

���� �Է� 1
10
1 5 2 1 4 3 4 5 2 1
���� ��� 1
7
��Ʈ
������ ��� {1. 5 2. 1 4 3. 4. 5. 2. 1.}�� ���� �� ������� �κ� �����̴�.
 */