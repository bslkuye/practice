package baekjoon.afterLv15.other.cMake;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MapAndMove {
    public static int N;
    public static int[][][] mapArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        mapArr = new int[N][N][4];

        br.close();
    }

    public static void mapPrint(){
        System.out.println("print!");

        for(int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                System.out.print(mapArr[i][j][3]);
            }
            System.out.println("");
        }
    }
}

/*


¡Ù¡Ú¡Û£À¡Ø
 */