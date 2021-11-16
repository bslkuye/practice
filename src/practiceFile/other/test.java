package practiceFile.other;

import java.util.Random;

public class test {
	static int gridLength = 49;
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
				}else if (grid[x][y-1]<=0) {
					y--;
				}
				break;
			case 2: //좌 
				if(grid[x-1][y]==1) {
					x--;
					grid[x][y] = -1;
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
				if(grid[i][j] == 1 ) {
					grid[i][j] = 1;
				}
				if(grid[i][j] >= 2){
					grid[i][j] = 2;
				}
				if(grid[i][j] <= 0){
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
		while(finder[gridLength-2][gridLength-2] == 1) {
			stack++;
			for(int i = 1; i < gridLength-1; i++) {
				for(int j = 1; j < gridLength-1; j++) {
					if(finder[i][j] == stack) {
						if(finder[i - 1][j] < stack && finder[i - 1][j] !=0) finder[i - 1][j] = stack + 1;
						if(finder[i + 1][j] < stack && finder[i + 1][j] !=0) finder[i + 1][j] = stack + 1;
						if(finder[i][j - 1] < stack && finder[i][j - 1] !=0) finder[i][j - 1] = stack + 1;
						if(finder[i][j + 1] < stack && finder[i][j + 1] !=0) finder[i][j + 1] = stack + 1;
					}
				}
			}
		}
	

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
	
	public static void checkMake() {
		Random random = new Random();
		int move = random.nextInt(4);
		for(int i = 1; i < gridLength; i += 2) {
			for(int j = 1; j < gridLength; j += 2) {
				if(grid[i][j] == 2) {
					if(move == 0 && grid[i-1][j] == 0) {
						grid[i+1][j] = 2;
						grid[i][j-1] = 2;
						grid[i][j+1] = 2;
						grid[i][j] = 0;
					} else if(move == 1 && grid[i+1][j] == 0) {
						grid[i-1][j] = 2;
						grid[i][j-1] = 2;
						grid[i][j+1] = 2;
						grid[i][j] = 0;
					} else if(move == 2 && grid[i][j-1] == 0) {
						grid[i-1][j] = 2;
						grid[i+1][j] = 2;
						grid[i][j+1] = 2;
						grid[i][j] = 0;
					} else if(move == 3 && grid[i][j+1] == 0) {
						grid[i-1][j] = 2;
						grid[i+1][j] = 2;
						grid[i][j-1] = 2;
						grid[i][j] = 0;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		while(endCheck == false) {
			for(int i = 0; i < gridLength; i++) {
				for(int j = 0; j < gridLength; j++) {
					grid[i][j] = 0; 
					if(i % 2 == 0 && j % 2 == 0) grid[i][j] = 2;
				}
			} 
			
			for(int i = 0; i < gridLength; i++) {
				for(int l = 0; l < gridLength; l++) {
					grid[i][0] = 2;
					grid[i][gridLength-1] = 2;
					grid[0][l] = 2;
					grid[gridLength-1][l] = 2;
				}
			}
			
			grid[1][1] = 1; 
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
		for(int i = 1; i < gridLength; i += 2) {
			for(int j = 1; j < gridLength; j += 2) {
				if(grid[i][j]==2) {
					checkMake();
					i = 1;
					j = 1;
				}
			}
		}
		roadFind();
		roadFindPrint();
	}

}







