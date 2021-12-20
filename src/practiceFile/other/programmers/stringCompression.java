package practiceFile.other.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringCompression {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] result = new String[input.length()/2];
        for(int cut = 2; cut <= input.length()/2;cut++){
            String[] cutInput = new String[input.length()/cut];
            int count = 0;
            int cutCount = 0;
            while(count != input.length()){
                for(int i = 0; i < cut; i++){
                    cutInput[cutCount] += input.charAt(count);
                    count++;
                }
                cutCount++;
            }
            count = 1;
            String check = cutInput[0];
            for(int i = 1; i < cutInput.length; i++){
                if(check == cutInput[i]){
                    count++;
                }else if(cutInput[i] == null || check != cutInput[i]){
                    if(count != 1) result[cut] += Integer.toString(count);
                    result[cut] += check;
                    count = 1;
                    check = cutInput[i];
                }

            }

        }
        br.close();
    }
}



/*
https://programmers.co.kr/learn/courses/30/lessons/60057
첫 문자열 저장하고 문자 반복횟수 체크
result에 반복횟수와 문자열 입력

*/