package baekjoon.afterLv15.level15.no10844;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int[] resultArr;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        resultArr = new int[N+1];
        stairsNum(0,1);

        System.out.println(result);
        br.close();

    }

    public static void stairsNum(int arrNum, int bNum){
        resultArr[arrNum] = bNum;
        if(arrNum != N - 1){
            if (bNum == 0) {
                stairsNum(arrNum + 1, 1);
            } else if (bNum == 9) {
                stairsNum(arrNum + 1, 8);
            } else {
                stairsNum(arrNum + 1, bNum + 1);
                stairsNum(arrNum + 1, bNum - 1);
            }
        } else if (arrNum == N - 1) {
            result++;
            if(result > 1000000000){
                result -= 1000000000;
            }
//            for(int i = 0; i < N; i ++){
//                System.out.print(resultArr[i] + " ");
//            }
//            System.out.println("");
        }

        if(bNum != 9 && arrNum == 0){
            stairsNum(arrNum, bNum + 1);
        }

    }
}


/*
dp[][] �� 2�� �迭�� �ؼ� arr ���� ���� ���ڿ� ���� result�� ����



https://www.acmicpc.net/problem/10844

���� ��� ��
�ð� ����	�޸� ����	����	����	���� ���	���� ����
1 ��	256 MB	98810	30747	22029	29.210%
����
45656�̶� ���� ����.

�� ���� ������ ��� �ڸ��� ���̰� 1�̴�. �̷� ���� ��� ����� �Ѵ�.

N�� �־��� ��, ���̰� N�� ��� ���� �� �� �� �ִ��� ���غ���. 0���� �����ϴ� ���� ��ܼ��� �ƴϴ�.

�Է�
ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 100���� �۰ų� ���� �ڿ����̴�.

���
ù° �ٿ� ������ 1,000,000,000���� ���� �������� ����Ѵ�.

���� �Է� 1
1
���� ��� 1
9
���� �Է� 2
2
���� ��� 2
17
 */