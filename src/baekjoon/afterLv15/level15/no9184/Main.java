package baekjoon.afterLv15.level15.no9184;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int[][][] wArr = new int[21][21][21];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == -1 && b == -1 && c == -1) break;

            sb.append("w(" + a + ", " + b + ", " + c + ") = " + w(a,b,c) + "\n");
        }

        System.out.println(sb);

        br.close();
    }

    public static int w(int a,int b,int c){
        if(0 <= a && 0 <= b && 0 <= c && a < 21 && b < 21 && c < 21) {
            if(wArr[a][b][c] != 0) return wArr[a][b][c];
        }

        if(a <= 0 || b <= 0 || c <= 0) return 1;
        if(20 < a || 20 < b || 20 < c) return wArr[20][20][20] = w(20, 20, 20);
        if(a < b && b < c) return wArr[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);

        return wArr[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
    }


}
/*
if a <= 0 or b <= 0 or c <= 0, then w(a, b, c) returns:
    1

if a > 20 or b > 20 or c > 20, then w(a, b, c) returns:
    w(20, 20, 20)

if a < b and b < c, then w(a, b, c) returns:
    w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c)

otherwise it returns:
    w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1)
 */