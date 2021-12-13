package baekjoon.level12.no2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int summ = 0;
        int[] count = new int[8001]; // ÃÖºó°ª¿ë
        for(int i = 0; i < n; i++){
            int input = Integer.parseInt(br.readLine());
            count[input + 4000]++;
            summ += input;
        }


        int countMax = 0;
        for(int i = 0; i <= 8000; i++){
            if(count[i] > countMax) countMax = count[i];
        }
        int result = 0;
        boolean countTwo = false;
        for(int i = 0; i <= 8000; i++){
            if(count[i] == countMax && countTwo == false) {
                result = i;
                countTwo = true;
            }else if(count[i] == countMax && countTwo == true){
                result = i;
                break;
            }
        }
        int max = 0;
        for(int i = 8000; i >= 0; i--){
            if (count[i] != 0) {
                max = i - 4000;
                break;
            }
        }
        int min = 0;
        for(int i = 0; i <= 8000; i++){
            if (count[i] != 0) {
                min = i - 4000;
                break;
            }
        }

        System.out.println(Math.round((double)summ / (double)n));

        int checkMiddle = 0;
        int middleResult = 0;
        for(int i = 0; i <= 8000; i++){
            if (count[i] != 0) {
                checkMiddle++;
                middleResult = i - 4000;
            }
            if(checkMiddle == (n+1)/2 -1){
                System.out.println(i - 4000);
                break;
            }
        }

        System.out.println(result - 4000);
        System.out.println(max - min);
        br.close();
    }
}
