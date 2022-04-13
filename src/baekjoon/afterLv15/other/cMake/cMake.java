package baekjoon.afterLv15.other.cMake;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cMake {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        boolean endInput = true;
        while(endInput){
            System.out.print("input order : ");
            input = br.readLine();


            switch (input){
                case "make":
                    System.out.print("input name, personality, job : ");
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    Human name = new Human(st.nextToken(), st.nextToken(), st.nextToken());
                    break;

                case "print":
                    System.out.print("input name : ");
                    StringTokenizer st1 = new StringTokenizer(br.readLine());
                    break;

                case "change" :
                    System.out.print("input change :");
                    StringTokenizer st2 = new StringTokenizer(br.readLine());
                    break;

                case "end":
                    endInput = false;
                    break;

            }

        }

        System.out.println("it's over.");

        br.close();


    }

}
