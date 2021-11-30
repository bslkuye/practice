package baekjoon.level9.no1929;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int downNum = Integer.parseInt(st.nextToken());
        int upNum = Integer.parseInt(st.nextToken());
        for(int i = downNum; i <= upNum; i += 2){
            boolean check = false;
            if(i <= 2 && upNum == 2){// 12 22 23
                bw.write("2\n");
                break;
            }else if(i <= 2){
                bw.write("2\n");
                i = 3;
            }
            for(int j = 3; j <= Math.sqrt(i); j += 2){
                if(i % j == 0){
                    check = true;
                }
            }
            if(check == false){
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}

//import java.io.*;
//import java.util.HashMap;
//import java.util.StringTokenizer;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int downNum = Integer.parseInt(st.nextToken());
//        int upNum = Integer.parseInt(st.nextToken());
//        int numNum = 2;
//        map.put(1,2); //ù��° �Ҽ�
//        for(int i = 2; i <= upNum; i++){ //�ι�° �Ҽ����� ã�� ����
//            boolean check = false;
//            for(int j = 1; j < map.size(); j++){ //������ �� i�� ������ ã�� �Ҽ��� ����������
//                if(i % map.get(j) == 0){ // �������� �Ҽ��� �ƴ�
//                    check = true;
//                }
//                if(i > Math.sqrt(i)) break; // ���μ����ذ� �������� ������ break
//            }
//            if(check == false) {
//                map.put(numNum,i);
//                numNum++;
//            }
//        }
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        for(int i = 1; i < map.size(); i++) bw.write(map.get(i) + "\n");
//        bw.flush();
//        bw.close();
//        bf.close();
//    }
//} ����

