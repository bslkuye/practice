package baekjoon.level6.no15596;
public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sum(arr));
    }

    static long sum(int[] a) {
        long result = 0;

        for(int i=0;i<a.length;i++) {
            result += a[i];
        }

        return result;
    }

}