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
�Է��� arr�� ���� ũ���� arr�� ���� �� ��ġ���� �ջ��� �ִ�ġ�� �����
ex)
input
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5
�ִ�ġ
7
10 15
23 16 15
25 30 20 19
...

�ƴϸ� ��������?

�������� ®��


https://www.acmicpc.net/problem/1932

�ð� ����	�޸� ����	����	����	���� ���	���� ����
2 ��	128 MB	59133	33042	24767	58.697%
����
        7
      3   8
    8   1   0
  2   7   4   4
4   5   2   6   5
�� �׸��� ũ�Ⱑ 5�� ���� �ﰢ���� �� ����̴�.

�� ���� 7���� �����ؼ� �Ʒ��� �ִ� �� �� �ϳ��� �����Ͽ� �Ʒ������� ������ ��, �������� ���õ� ���� ���� �ִ밡 �Ǵ� ��θ� ���ϴ� ���α׷��� �ۼ��϶�.
 �Ʒ����� �ִ� ���� ���� ������ ���õ� ���� �밢�� ���� �Ǵ� �밢�� �����ʿ� �ִ� �� �߿����� ������ �� �ִ�.

�ﰢ���� ũ��� 1 �̻� 500 �����̴�. �ﰢ���� �̷�� �ִ� �� ���� ��� �����̸�, ������ 0 �̻� 9999 �����̴�.

�Է�
ù° �ٿ� �ﰢ���� ũ�� n(1 �� n �� 500)�� �־�����, ��° �ٺ��� n+1��° �ٱ��� ���� �ﰢ���� �־�����.

���
ù° �ٿ� ���� �ִ밡 �Ǵ� ��ο� �ִ� ���� ���� ����Ѵ�.

���� �Է� 1
5
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5
���� ��� 1
30
 */