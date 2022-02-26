package Ctest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class strCompress {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] result = new int[input.length()/2];
        for(int cut = 2; cut <= input.length()/2;cut++){
            String[] cutInput = new String[input.length()];
            int count = 0;
            int cutCount = 0;

            count = 1;
            String check = cutInput[0];
            for(int i = 1; i < cutInput.length; i++){
                if(check == cutInput[i]){
                    count++;
                }else if(cutInput[i] == null || check != cutInput[i]){
                    count = 1;
                    check = cutInput[i];
                }

            }

        }
        br.close();
    }

    class Solution {
        public int solution(String s) {
            int answer = s.length();

            for (int i = 1; i < s.length() / 2 + 1; i++) {
                String prev = s.substring(0, i);
                int count = 1;
                String enc = "";
                String last = "";
                for (int j = i; j < s.length(); j += i) {
                    if (j + i > s.length()) {
                        last = s.substring(j);
                        continue;
                    }
                    if (prev.equals(s.substring(j, j + i))) {
                        count++;
                    } else {
                        enc += prev;
                        if (count != 1) {
                            enc = count + enc;
                        }
                        prev = s.substring(j, j + i);
                        count = 1;
                    }
                }
                enc += prev + last;
                if (count != 1) {
                    enc = count + enc;
                }

                answer = Math.min(answer, enc.length());
            }

            return answer;
        }
    }
}

