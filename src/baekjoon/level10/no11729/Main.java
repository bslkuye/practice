package baekjoon.level10.no11729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());


        sb.append((int) (Math.pow(2, num)-1)).append('\n');

        Hanoi(num, 1, 2, 3);
        System.out.println(sb);

        br.close();
    }

    public static void Hanoi(int num, int start, int mid, int dest) {
        if(num == 1) {
            sb.append(start + " " + dest + "\n");
            return;
        }

        Hanoi(num - 1, start, dest, mid);

        sb.append(start + " " + dest + "\n");

        Hanoi(num - 1, mid, start, dest);
    }

}

//1 3

//1 2
//1 3
//2 3

//7
//1 3
//1 2
//3 2
//1 3
//2 1
//2 3
//1 3
