package baekjoon.level12.no2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        for(int i = -1000; i <= 1000; i++){
            for(int j = 0; j < n; j++){
                if(i == arr[j]){
                    System.out.println(i);
                    count++;
                }
            }
            if(count == n) break;
        }

        br.close();
    }
}
//������ ���� �������� �����ؼ� ����ϴ� ����� max��ġ�� ã�Ƽ� 1���� �������� ã�Ƽ� ����ϴ� ���
// ������ -1000 ���� 1000����
