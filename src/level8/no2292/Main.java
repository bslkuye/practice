package level8.no2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main  {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int roomNum = Integer.parseInt(br.readLine());
		
		for(int i = 1; ;i++) {
			if(roomNum <= 1) {
				System.out.println(i);
				break;
			}
			roomNum = roomNum - i*6;
		}
		br.close();
	}
}
