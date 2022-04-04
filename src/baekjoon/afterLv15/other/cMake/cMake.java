package baekjoon.afterLv15.other.cMake;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cMake {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while(true){
            System.out.print("input order : ");
            input = br.readLine();
            switch (input){
                case "make":
                    System.out.print("input name, personality, job : ");
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    Human hum = new Human(st.nextToken(), st.nextToken(), st.nextToken());
                    break;

                case "print":
                    System.out.print("input name : ");
                    StringTokenizer st1 = new StringTokenizer(br.readLine());
                    break;

                case "end":
                    break;

            }

        }


    }

}
