package baekjoon.level9.no3053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double r = Double.parseDouble(br.readLine());
        System.out.println(r*r*Math.PI);
        System.out.println(r*r*2);
        br.close();
    }
}
