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
���� ���� ���� ������ ���� �迭�ε�
2���� ���ؾ���
������ ���۰� ������ ��
���������ΰ�? �ƴѰ�?
�����ϴ� �����̴ϱ� ������ �ϸ� �ǳ�

https://www.acmicpc.net/problem/11053

���� �� �����ϴ� �κ� ����
�ð� ����	�޸� ����	����	����	���� ���	���� ����
1 ��	256 MB	98178	38503	25259	37.192%
����
���� A�� �־����� ��, ���� �� �����ϴ� �κ� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

���� ���, ���� A = {10, 20, 10, 30, 20, 50} �� ��쿡 ���� �� �����ϴ� �κ� ������ A = {10, 20, 10, 30, 20, 50} �̰�, ���̴� 4�̴�.

�Է�
ù° �ٿ� ���� A�� ũ�� N (1 �� N �� 1,000)�� �־�����.

��° �ٿ��� ���� A�� �̷�� �ִ� Ai�� �־�����. (1 �� Ai �� 1,000)

���
ù° �ٿ� ���� A�� ���� �� �����ϴ� �κ� ������ ���̸� ����Ѵ�.

���� �Է� 1
6
10 20 10 30 20 50
���� ��� 1
4
 */