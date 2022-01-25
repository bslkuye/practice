package baekjoon.level9.no1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numCount = 0;
        for(int i = 0; i < caseNum; i++){
            for(int j = 0; j < st.countTokens(); ){
                int num = Integer.parseInt(st.nextToken());
                boolean check = false;
                for(int k = 2; k < num; k++){
                    if(num % k == 0) {
                        check = true;
                        break;
                    }
                }
                if(check == false && num != 1) numCount++;
            }
        }
        System.out.println(numCount);
        br.close();
    }
}
