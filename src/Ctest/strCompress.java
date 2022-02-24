package Ctest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class strCompress {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] result = new String[input.length()/2];
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

