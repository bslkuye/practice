package baekjoon.level7.no1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		int max = 0;
		char result = '?';
		
		for(Entry<Character, Integer> ent : map.entrySet()) {
			int value = ent.getValue();
			char key = ent.getKey();
			if(max < value) {
				max = value;
				result = key;
			}else if(max == value) {
				result = '?';
			}
		}
		
		System.out.println(result);
		
		br.close();
	}

}