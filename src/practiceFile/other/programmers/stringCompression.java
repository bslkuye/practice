package practiceFile.other.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringCompression {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] result = new String[input.length()/2 + 1];
        int count = 0;
        for(int i = 0; i < input.length()/2 + 1; i++){ //i = 자르는 갯수
            for(int j = 0; j < input.length(); j = j + i + 1){ //j 로 input 문자열 반복
                if(input.substring(j, j+i) == input.substring(j+i+1, j+2*i+1)){
                    count++;
                }else if(input.substring(j, j+i) != input.substring(j+i+1, j+2*i+1)){
                    if(count != 0){
                        result[i] += count + input.substring(j, j+i);
                    }else {
                        result[i] += input.substring(j, j+i);
                    }
                }

            }

        }
        int min = result[0].length();
        for(int i = 0; i < input.length()+1; i++){
            if(min > result[0].length()){
                min = result[0].length();
            }
        }
        System.out.println(min);

//        for(int cut = 1; cut <= input.length()/2;cut++){
//            String[] cutInput = new String[input.length()/cut];
//            int count = 0;
//            int cutCount = 0;
//            while(count != input.length()){
//                for(int i = 0; i < cut; i++){
//                    cutInput[cutCount] += input.charAt(count);
//                    count++;
//                }
//                cutCount++;
//            }
//            count = 1;
//            String check = cutInput[0];
//            for(int i = 1; i < cutInput.length; i++){
//                if(check == cutInput[i]){
//                    count++;
//                }else if(cutInput[i] == null || check != cutInput[i]){
//                    if(count != 1) result[cut] += Integer.toString(count);
//                    result[cut] += check;
//                    count = 1;
//                    check = cutInput[i];
//                }
//
//            }
//
//        }
        br.close();
    }
}



/*
https://programmers.co.kr/learn/courses/30/lessons/60057


*/