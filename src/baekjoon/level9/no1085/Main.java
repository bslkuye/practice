package baekjoon.level9.no1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result;
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int rx = Integer.parseInt(st.nextToken()) - x;
        int ry = Integer.parseInt(st.nextToken()) - y;
        int arr[] = {x, y , rx , ry};
        System.out.println(Arrays.stream(arr).min().getAsInt());

    }
}
