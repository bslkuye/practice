package baekjoon.afterLv15.level15.no9184;

public class Main {

    public static void main(String[] args) {

    }

    public static void w(int a,int b,int c){
        if (a <= 0 || b <= 0 || c <= 0){
            return;
        }
    }


}
/*
if a <= 0 or b <= 0 or c <= 0, then w(a, b, c) returns:
    1

if a > 20 or b > 20 or c > 20, then w(a, b, c) returns:
    w(20, 20, 20)

if a < b and b < c, then w(a, b, c) returns:
    w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c)

otherwise it returns:
    w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1)
 */