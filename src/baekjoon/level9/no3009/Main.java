package baekjoon.level9.no3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] xArr = new int[3];
        int[] yArr = new int[3];

        for(int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            xArr[i] = Integer.parseInt(st.nextToken());
            yArr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(search(xArr) + " " + search(yArr));
        br.close();
    }

    public static int search(int[] arr){
        if(arr[0] == arr[1]){
            return arr[2];
        }else if(arr[0] == arr[2]){
            return arr[1];
        }else return arr[0];
    }
}
