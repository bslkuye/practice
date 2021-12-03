package baekjoon.level9.no4948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int num = Integer.parseInt(br.readLine());
        int max = num;
        while(num != 0) {
            list.add(num);
            if(max < num) {
                max = num;
            }
            num = Integer.parseInt(br.readLine());
        }

        int checkEnd = 2 * max;
        boolean isPrime[] = new boolean[checkEnd+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for(int i=2;i*i<=checkEnd;i++) {
            for(int j=i*i;j<=checkEnd;j+=i) {
                isPrime[j] = false;
            }
        }

        for(int i=0;i<list.size();i++) {
            int cnt = 0;
            for(int j=list.get(i)+1;j<=list.get(i)*2;j++) {
                if(isPrime[j]) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

        br.close();
    }

}

//import java.io.*;
//import java.util.StringTokenizer;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int input = 1;
//        while(true){
//            input = Integer.parseInt(bf.readLine());
//            if(input == 0) break;
//            int result = 0;
//            for(int i = input + 1; i <= input * 2; i += 2){
//                boolean check = false;
//                if(i % 2 == 0) i++;
//                for(int j = 3; j <= Math.sqrt(i); j += 2){
//                    if(i % j == 0){
//                        check = true;
//                    }
//                }
//                if(check == false){
//                    result++;
//                }
//            }
//            bw.write(result + "\n");
//        }
//        bw.flush();
//        bw.close();
//        bf.close();
//    }
//}