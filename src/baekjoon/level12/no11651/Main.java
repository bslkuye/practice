package baekjoon.level12.no11651;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        ArrayList<Long> l=new ArrayList();

        for(int i=s.nextInt();i>0;i--)
            l.add(s.nextLong()+s.nextLong()*1000000);

        l.sort(null);
        for(Long i:l) {
            Long m=(Long)Math.round((double)i/1000000);
            System.out.println((i-m*1000000)+" "+m);
        }
    }
}