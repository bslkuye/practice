package baekjoon.afterLv15.level15.no1904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] resultArr = new int[N+2];
        resultArr[1] = 1;
        resultArr[2] = 2;

        for(int i = 3; i <= N; i++){
            resultArr[i] = (resultArr[i-1] + resultArr[i-2]) % 15746;
        }

        System.out.println(resultArr[N]);
        br.close();

    }
}
/*
1 - 1

2 - 11 00

3 - 111 100 001

4 - 1111 1100 1001 0011 0000

5 - 11111 11100 11001 10011 00111 10000 00100 00001

6 - 111111 111100 111001 110011 100111 001111 110000 100100 001100 100001 000011 000000
피보나치? 1 2 3 5 8 13
7 - 1111111 1111100 1111001 1110011 1100111 1001111 0011111 1110000 1100100 1001100 0011100
    1100001 1001001 0011001 1000011 0010011 0000111 1000000 0010000 0000100 0000001 -21
 */