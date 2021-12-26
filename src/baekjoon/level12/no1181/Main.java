package baekjoon.level12.no1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strArr = new String[N];

        for(int i=0;i<N;i++) {
            strArr[i] = br.readLine();
        }

        Arrays.sort(strArr, (s1, s2) -> {
            if(s1.length() == s2.length()) return s1.compareTo(s2);
            else return s1.length() - s2.length();
        });

        StringBuilder sb = new StringBuilder();
        sb.append(strArr[0]).append("\n");
        for(int i=1;i<strArr.length;i++) {
            if(!strArr[i-1].equals(strArr[i]))
                sb.append(strArr[i]).append("\n");
        }
        System.out.println(sb);

        br.close();
    }

}
