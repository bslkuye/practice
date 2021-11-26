package level8.no1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for(int i = 1;; i++) {
			if(num <= i) {
				if(i % 2 == 1) System.out.println((i - num + 1) + "/" + num);
				if(i % 2 == 0) System.out.println(num + "/" + (i - num + 1));
				break;
			}
			num -= i;
		}
		br.close();
	}

}