package baekjoon.level9.no4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0 && c == 0) break;
            String result = "wrong";
            if(a*a + b*b == c*c) result = "right";
            if(a*a + c*c == b*b) result = "right";
            if(b*b + c*c == a*a) result = "right";

            System.out.println(result);
        }
    }
}
