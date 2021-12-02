package baekjoon.level9.no9020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int caseNum = Integer.parseInt(br.readLine());
        int max = 1;
        for(int i = 0; i < caseNum; i++) {
            int num = Integer.parseInt(br.readLine());
            list.add(num);
            if(max < num) {
                max = num;
            }
        }

        boolean isPrime[] = new boolean[max+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for(int i=2;i*i<=max;i++) {
            for(int j=i*i;j<=max;j+=i) {
                isPrime[j] = false;
            }
        }

        for(int i=0;i<list.size();i++) {
            int cnt = 0;
            String result = "";
            for(int j=2+1;j<=list.get(i)/2;j++) {
                if(isPrime[j]) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

        br.close();
    }

}