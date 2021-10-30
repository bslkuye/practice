package practiceFile.other;

import java.util.Random;

public class test {
	static int gridLength = 50;
	static int[][] grid = new int[gridLength][gridLength];
	static int[][] finder = new int[gridLength][gridLength];
	static boolean endCheck = false;
	
	public static void roadPrint() {
		System.out.println("rPrint");
		for(int i = 0; i < gridLength; i++) {
			for(int j = 0; j < gridLength; j++) {
				if(grid[i][j] == 1 ) {//가능한길
					System.out.print("□ ");
				}else if(grid[i][j] == 2){//벽
					System.out.print("■ ");
				}else if(grid[i][j] == 0) {
					System.out.print("  ");
				}
			}
			System.out.println("");

		}
	}
	
	public static void roadFindPrint() {
		System.out.println("rFindPrint");
		for(int i = 0; i < gridLength; i++) {
			for(int j = 0; j < gridLength; j++) {
				if(finder[i][j] == 1 ) {//가능한길
					System.out.print("  ");
				}else if(finder[i][j] == 0){//벽
					System.out.print("■ ");
				}else if(finder[i][j] > 2){//길
//					System.out.print((finder[i][j] - 2) % 10 + " ");
					System.out.print("  ");
				}else System.out.print("o ");
				
			}
			System.out.println("");
		}
	}
	
	public static void roadMake(int x, int y) {
		System.out.println("rMaker");
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		
		for(int i = 0; i < 100000 ; i++) {
			int move = random.nextInt(4);
			switch(move) {
			case 0: //상 y++
				if(grid[x][y+1]==1) {
					y++;
					grid[x][y] = -1;
					grid[x+1][y]++;
					grid[x-1][y]++;
//					grid[x][y-1]++;
					grid[x][y+1]++;
				}else if (grid[x][y+1]<=0) {
					y++;
				}
				break;
			case 1: //하 y--
				if(grid[x][y-1]==1) {
					y--;
					grid[x][y] = -1;
					grid[x+1][y]++;
					grid[x-1][y]++;
					grid[x][y-1]++;
//					grid[x][y+1]++;
				}else if (grid[x][y-1]<=0) {
					y--;
				}
				break;
			case 2: //좌 
				if(grid[x-1][y]==1) {
					x--;
					grid[x][y] = -1;
//					grid[x+1][y]++;
					grid[x-1][y]++;
					grid[x][y-1]++;
					grid[x][y+1]++;
				}else if (grid[x-1][y]<=0) {
					x--;
				}
				break;
			case 3: //우 
				if(grid[x+1][y]==1) {
					x++;
					grid[x][y] = -1;
					grid[x+1][y]++;
//					grid[x-1][y]++;
					grid[x][y-1]++;
					grid[x][y+1]++;
				}else if (grid[x+1][y]<=0) {
					x++;
				}
			}
			if(x == gridLength - 2 && y == gridLength - 2) {
				System.out.println("end!");
				if(grid[gridLength-2][gridLength-3] == 1)
					grid[gridLength-2][gridLength-3] = 2;
				if(grid[gridLength-3][gridLength-2] == 1)
					grid[gridLength-3][gridLength-2] = 2;
				endCheck = true;
				break;
			}
		}
		for(int i = 0; i < gridLength; i++) {
			for(int j = 0; j < gridLength; j++) {
				if(grid[i][j] == 1 ) {//가능한길
					grid[i][j] = 1;
				}
				if(grid[i][j] >= 2){//벽
					grid[i][j] = 2;
				}
				if(grid[i][j] <= 0){//길
					grid[i][j] = 0;
				}
			}
		}
		grid[1][1] = 0;
	}
	
	public static void roadFind() {
		System.out.println("rFind1");
		for(int i = 0; i < gridLength; i++) {
			for(int j = 0; j < gridLength ; j ++) {
				if(grid[i][j] == 2) {
					finder[i][j] = 0;//벽 0
				}else {
					finder[i][j] = 1;//길 1
				}
			}
		}
		System.out.println("rFind2");

		finder[1][1] = 3;
		int stack = 1;			
		while(finder[gridLength-2][gridLength-2] == 1 && stack < 1000) {
			if(stack == 999) System.out.println("stack999" + stack);
			stack++;
			for(int i = 1; i < gridLength-1; i++) {
				for(int j = 1; j < gridLength-1; j++) {
					if(finder[i][j] == stack) {
						if(finder[i - 1][j] == 1) finder[i - 1][j] = stack + 1;
						if(finder[i + 1][j] == 1) finder[i + 1][j] = stack + 1;
						if(finder[i][j - 1] == 1) finder[i][j - 1] = stack + 1;
						if(finder[i][j + 1] == 1) finder[i][j + 1] = stack + 1;
					}
				}
			}
		}
		System.out.println("rFind3" + stack);

		int a = gridLength - 2;
		int b = gridLength - 2;
		int astack = stack;
		while(astack > 1) {
			finder[a][b] = -1;
			if(finder[a - 1][b] == astack) {
				a--;
			}else if(finder[a + 1][b] == astack) {
				a++;
			}else if(finder[a][b - 1] == astack) {
				b--;
			}else if(finder[a][b + 1] == astack) b++;			
			astack--;
		}
		
	}
	
	public static void main(String[] args) {
		
		while(endCheck == false) {
			for(int i = 0; i < gridLength; i++) {
				for(int j = 0; j < gridLength; j++) {
					grid[i][j] = 0; // 0 길 1 길이뻗을수 있음 2 벽
				}
			} // 격자생성, 초기화
			
			for(int i = 0; i < gridLength; i++) {
				for(int l = 0; l < gridLength; l++) {
					grid[i][0] = 2;
					grid[i][gridLength-1] = 2;
					grid[0][l] = 2;
					grid[gridLength-1][l] = 2;
				}
			}
			
			grid[1][1] = 1; //길 시작점
			grid[2][1] = 1;
			grid[1][2] = 1;
			for(int i = 0; i < gridLength; i++) {
				for(int j = 0; j < gridLength; j++) {
					if(grid[i][j]==1) {
						roadMake(i,j);
					}
				}
			}
		}
		roadFind();
		roadFindPrint();
//		roadPrint();
//		System.out.println(finder[1][1] + " " + finder[1][2] + " " + finder[2][1]);
	}

}

//road maker 로 벽2 길0 외1
//
//finder에서 처음 시작지점 길에 1값 부여
//인접한 길에 ++1 반복문으로 값이 없는값 찾고 근처에 값이 있으면 그 값의 ++1








