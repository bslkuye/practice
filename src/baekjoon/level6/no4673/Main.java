package baekjoon.level6.no4673;

public class Main {

	public static void main(String[] args) {
		int N = 10000;
		boolean[] selfNum = new boolean[N+1];
		
		for(int i=1;i<=N;i++) {
			int idx = check(i);
			
			if(idx <= N) {
				selfNum[idx] = true;
			}
		}
		
		for(int i=1; i<=N; i++) {
			if(!selfNum[i]) {
				System.out.println(i);
			}
		}
		
	}
	
	static int check(int num) {
		int sum = num;
		while(num!=0) {
			sum += num%10;
			num /= 10;
		}
		
		return sum;
	}

}//as