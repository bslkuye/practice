package baekjoon.level12.no18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer,Integer> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }
        int[] sortArr = arr.clone();
        Arrays.sort(sortArr);
        int count = 0;
        for(int i = 0; i < N; i++){
            if(!map.containsKey(sortArr[i])){
                map.put(sortArr[i],count++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            sb.append(map.get(arr[i])).append(" ");
        }
        System.out.println(sb);

        br.close();
    }
}

//https://www.acmicpc.net/problem/18870