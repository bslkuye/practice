package practiceFile.other;

import java.util.Random;

public class test {
	static int gridLength = 10;
	static int[][] grid = new int[gridLength][gridLength];
	static int[][] finder = new int[gridLength][gridLength];
	static boolean endCheck = false;
	
	public static void roadPrint() {
		
		for(int i = 0; i < gridLength; i++) {
			for(int j = 0; j < gridLength; j++) {
				if(grid[i][j] == 1 ) {//가능한길
					System.out.print("□ ");
				}else if(grid[i][j] == 2){//벽
					System.out.print("■ ");
				}else if(grid[i][j] > 2){//길
					if(grid[i][j] < 20) {
						System.out.print("1 ");
					}else if(grid[i][j] < 40) {
						System.out.print("2 ");
					}else if(grid[i][j] < 80) {
						System.out.print("3 ");
					}else if(grid[i][j] < 160) {
						System.out.print("4 ");
					}else {
						System.out.print("5 ");
					}
				}else if(grid[i][j] == 0) {
					System.out.print("- ");
				}
			}
			System.out.println("");

		}
	}
	
public static void roadFindPrint() {
		
		for(int i = 0; i < gridLength; i++) {
			for(int j = 0; j < gridLength; j++) {
				if(finder[i][j] == 1 ) {//가능한길
					System.out.print("□ ");
				}else if(finder[i][j] == 0){//벽
					System.out.print("■ ");
				}else if(finder[i][j] > 2){//길
					if(finder[i][j] < 20) {
						System.out.print("1 ");
					}else if(finder[i][j] < 40) {
						System.out.print("2 ");
					}else if(finder[i][j] < 80) {
						System.out.print("3 ");
					}else if(finder[i][j] < 160) {
						System.out.print("4 ");
					}else {
						System.out.print("5 ");
					}
				}else 
					System.out.print("- ");
				
			}
			System.out.println("");
		}
	}
	
	public static void roadMake(int x, int y) {
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
	}
	
	public static void roadFind() {
		for(int i = 0; i < gridLength; i++) {
			for(int j = 0; j < gridLength ; j ++) {
				if(grid[i][j] == 2) {
					finder[i][j] = 0;
				}else {
					finder[i][j] = 1;
				}
			}
		}
		
		finder[1][1] = 3;
		int count = 0;
		while(count < 2500) {
			for(int i = 0; i < gridLength; i++) {
				for(int j = 0; j < gridLength; j ++) {
					count ++;
					if(finder[i][j] == 1) {
						if(finder[i - 1][j] > 1) {
							finder[i - 1][j] = finder[i][j] + 1;
						}else if(grid[i - 1][j] > 1) {
							finder[i + 1][j] = finder[i][j] + 1;
						}else if(grid[i - 1][j] > 1) {
							finder[i][j - 1] = finder[i][j] + 1;
						}else if(grid[i - 1][j] > 1) {
							finder[i][j + 1] = finder[i][j] + 1;
						}
					}
				}
			}
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
			
			grid[1][1] = 0; //길 시작점
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
		roadPrint();
		for(int i = 0; i < gridLength; i++) {
			for(int j = 0; j < gridLength; j++) {
				if(grid[i][j] == 1 ) {//가능한길
					System.out.print("□ ");
				}
				if(grid[i][j] == 2){//벽
					System.out.print("■ ");
				}
				if(grid[i][j] > 2){//길
					if(grid[i][j] < 20) {
						System.out.print("1 ");
					}else if(grid[i][j] < 40) {
						System.out.print("2 ");
					}else if(grid[i][j] < 80) {
						System.out.print("3 ");
					}else if(grid[i][j] < 160) {
						System.out.print("4 ");
					}else {
						System.out.print("5 ");
					}
				}else if(true)System.out.print("6 ");
			}
			System.out.println("");
		} //print
	}

}