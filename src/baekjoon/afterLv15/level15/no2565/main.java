package baekjoon.afterLv15.level15.no2565;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] pole = new int[N][2];
        int[] dp = new int[N];

        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            pole[i][0] = Integer.parseInt(st.nextToken());
            pole[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(pole, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        for(int i=0; i<N; i++) {
            dp[i] = 1;

            for(int j=0; j<i; j++) {
                if(pole[j][1] < pole[i][1])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(N - max);

        br.close();
    }

}
/*
���� ���� ��ġ�� �������� ���ָ� �� �� ����



https://www.acmicpc.net/problem/2565

������
�ð� ����	�޸� ����	����	����	���� ���	���� ����
1 ��	128 MB	22173	10438	8333	46.844%
����
�� ������ A�� B ���̿� �ϳ� �Ѿ� �������� �߰��ϴ� ���� �������� ���� �����ϴ� ��찡 �߻��Ͽ���. �ռ��� ������ �־� �̵� �� �� ���� �������� ���� �������� �������� �ʵ��� ������� �Ѵ�.

���� ���, < �׸� 1 >�� ���� �������� ����Ǿ� �ִ� ��� A�� 1�� ��ġ�� B�� 8�� ��ġ�� �մ� ������, A�� 3�� ��ġ�� B�� 9�� ��ġ�� �մ� ������, A�� 4�� ��ġ�� B�� 1�� ��ġ�� �մ� �������� ���ָ� �����ִ� ��� �������� ���� �������� �ʰ� �ȴ�.



< �׸� 1 >

�������� �����뿡 ����Ǵ� ��ġ�� ������ ���������� ���ʴ�� ��ȣ�� �Ű�����. �������� ������ �����ٵ��� �� �����뿡 ����Ǵ� ��ġ�� ��ȣ�� �־��� ��, �����ִ� ��� �������� ���� �������� �ʰ� �ϱ� ���� ���־� �ϴ� �������� �ּ� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ��� �� ������ ������ �������� ������ �־�����. �������� ������ 100 ������ �ڿ����̴�. ��° �ٺ��� �� �ٿ� �ϳ��� �������� A������� ����Ǵ� ��ġ�� ��ȣ�� B������� ����Ǵ� ��ġ�� ��ȣ�� ���ʷ� �־�����. ��ġ�� ��ȣ�� 500 ������ �ڿ����̰�, ���� ��ġ�� �� �� �̻��� �������� ����� �� ����.

���
ù° �ٿ� �����ִ� ��� �������� ���� �������� �ʰ� �ϱ� ���� ���־� �ϴ� �������� �ּ� ������ ����Ѵ�.

���� �Է� 1
8
1 8
3 9
2 2
4 1
6 4
10 10
9 7
7 6
���� ��� 1
3
 */