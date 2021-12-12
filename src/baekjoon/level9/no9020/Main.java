package baekjoon.level9.no9020;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();
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

        for(int i = 2; i <= max; i++) {
            for(int j=i*i;j<=max;j+=i) {
                isPrime[j] = false;
            }
        }
        for(int i = 0; i < max; i++){
            if(isPrime[i]) resultList.add(i);
        }

        for(int i=0;i<list.size();i++) {
            int frontNum = list.get(i)/2;
            int backNum = list.get(i)/2;
            while(list.get(i)!=4){
                if(isPrime[frontNum] && isPrime[backNum]){
                    bw.write(frontNum + " " + backNum + "\n");
                    break;
                }
                frontNum--;
                backNum++;
            }
            if(list.get(i)==4) bw.write("2 2\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

}