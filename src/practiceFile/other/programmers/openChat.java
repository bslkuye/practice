package practiceFile.other.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class openChat {
	
	class Solution {
	    public String[] solution(String[] record) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ,\"");
			String text = "";
			for(int i = 0; i < st.countTokens(); i++) {
				text = st.nextToken();
				if(text == "Enter") {
					text = st.nextToken();
					
				}
			}
			
	        String[] answer = {};
	        br.close();
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		
	}

}
