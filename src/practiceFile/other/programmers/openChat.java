package practiceFile.other.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import practiceFile.lv1.EnumExam;

import java.util.HashMap;

public class openChat {
	
	class Solution {
	    public String[] solution(String[] record) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ,\"");
			HashMap<String, String> map = new HashMap<String, String>();
			String[] answer = {};
			String text = "";
			String nextText = "";
			int rec = st.countTokens();
			int[] enterExit = new int[rec/3];
			String[] enterExitID = new String[rec/3];
			int j = 0;
			for(int i = 0; i < st.countTokens(); i++) {
				text = st.nextToken();
				if(text == "Enter") {
					text = st.nextToken();
					nextText = st.nextToken();
					enterExitID[j] = text;
					enterExit[j] = 0;
					j++;
					map.put(text, nextText);
				}else if(text == "Leave") {
					text = st.nextToken();
					nextText = st.nextToken();
					enterExitID[j] = text;
					enterExit[j] = 1;
					j++;
					map.put(text, nextText);
				}else if(text == "Change") {
					text = st.nextToken();
					nextText = st.nextToken();
					map.put(text, nextText);
			}
				for(int k = 0; k < j; k++) {
					if(k!=0)System.out.print(", ");
					System.out.print("\"" + map.get(enterExitID[k]));
					if(enterExit[k] == 0) System.out.print("´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.\"");
					if(enterExit[k] == 1) System.out.print("´ÔÀÌ ³ª°¬½À´Ï´Ù.\"");					
				}
	        
	        br.close();
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		solution[];
	}

}
