package baekjoon.level9.no2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int downNum = Integer.parseInt(bf.readLine());
        int upNum = Integer.parseInt(bf.readLine());
        int sumResult = 0;
        int minimumResult = 0;
        for(int i = upNum; i >= downNum; i--){
            boolean check = false;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    check = true;
                }
            }
            if(check == false && i != 1){
                sumResult += i;
                minimumResult = i;
            }
        }
        if(sumResult != 0){
            System.out.println(sumResult);
            System.out.println(minimumResult);
        }else System.out.println("-1");
        bf.close();
    }
}
