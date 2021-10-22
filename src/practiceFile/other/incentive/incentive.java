package practiceFile.other.incentive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class incentive {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("인원");
		int person = Integer.parseInt(br.readLine());
		System.out.println("자금");
		double funds = Double.parseDouble(br.readLine());
		System.out.println("10단 인원");
		int lv10 = Integer.parseInt(br.readLine());
		System.out.println("5단 인원");
		int lv5 = Integer.parseInt(br.readLine());
		System.out.println("제외 인원");
		int leaf = Integer.parseInt(br.readLine());
		int otherPerson = person - lv10 - lv5 - leaf;
		double incenPer = (double)funds * 0.4 / ((double)lv10 * 10.0 + (double)lv5 * 5.0 + (double)otherPerson);
		System.out.println(person + " " + funds + " " + lv10 + " " + lv5);
		System.out.println("10단 = " + 10 * Math.round(incenPer));
		//1
		br.close();
	}

}
