package practiceFile.other.incentive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class incentive {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int person = Integer.parseInt(br.readLine());
		int funds = Integer.parseInt(br.readLine());
		int lv10 = Integer.parseInt(br.readLine());
		int lv5 = Integer.parseInt(br.readLine());
		int leaf = Integer.parseInt(br.readLine());
		int otherPerson = person - lv10 - lv5 - leaf;
		double incenPer = funds * 0.4 / (lv10 * 10 + lv5 * 5 + otherPerson);
		System.out.println(person + " " + funds + " " + lv10 + " " + lv5);
		System.out.println("10´Ü = " + 10 * incenPer+"¾ï");
		//1
		br.close();
	}

}
