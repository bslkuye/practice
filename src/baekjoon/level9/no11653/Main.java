package baekjoon.level9.no11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(bf.readLine());
        if(inputNum != 1){
            for(int i = 2; i <= Math.sqrt(inputNum); i++){
                while(inputNum % i == 0){
                    System.out.println(i);
                    inputNum /= i;
                }
            }
            if(inputNum != 1) System.out.println(inputNum);
        }
        bf.close();
    }
}
