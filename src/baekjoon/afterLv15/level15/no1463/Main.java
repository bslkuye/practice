package baekjoon.afterLv15.level15.no1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        calculate(N);

        br.close();
    }

    public static void calculate(int n){
        if (n == 1){
            System.out.println(result);
        }else{
            if(n % 3 == 0){
                result++;
                calculate(n / 3);
            }else if (n % 2 == 0){
                result++;
                calculate(n / 2);
            }else {
                result++;
                calculate(n - 1);
            }
        }

    }
}

/*
https://www.acmicpc.net/problem/1463

1�� �����
�ð� ����	�޸� ����	����	����	���� ���	���� ����
0.15 �� (�ϴ� ����)	128 MB	187911	60638	38560	32.019%
����
���� X�� ����� �� �ִ� ������ ������ ���� �� ���� �̴�.

X�� 3���� ������ ��������, 3���� ������.
X�� 2�� ������ ��������, 2�� ������.
1�� ����.
���� N�� �־����� ��, ���� ���� ���� �� ���� ������ ����ؼ� 1�� ������� �Ѵ�. ������ ����ϴ� Ƚ���� �ּڰ��� ����Ͻÿ�.

�Է�
ù° �ٿ� 1���� ũ�ų� ����, 106���� �۰ų� ���� ���� N�� �־�����.

���
ù° �ٿ� ������ �ϴ� Ƚ���� �ּڰ��� ����Ѵ�.

���� �Է� 1
2
���� ��� 1
1
���� �Է� 2
10
���� ��� 2
3
 */
