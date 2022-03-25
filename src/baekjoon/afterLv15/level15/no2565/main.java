package baekjoon.afterLv15.level15.no2565;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    static int N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken()) * 1000 + Integer.parseInt(st.nextToken());
        }

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