package practiceFile.other;

import java.util.Random;

public class mazeMake {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int gridLength = 100;
		int[][] grid = new int[gridLength][gridLength];
		
		for(int i = 0; i < gridLength; i++) {
			for(int l = 0; l < gridLength; l++) {
				grid[i][l] = 0; // 0 길 1 길이뻗을수 있음 2 벽
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
		
		grid[1][1] = -1; //길 시작점
		int x = 1;
		int y = 1;
		grid[x+1][y] = 1;
		grid[x][y+1] = 1;
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
//		boolean finish = false;
		
		
		for(int i = 0; i < 10000 ; i++) {
			int move = random.nextInt(4);
			switch(move) {
			case 0: //상 y++
				if(grid[x][y+1]==1) {
					y++;
					grid[x][y] = -1;
					grid[x+1][y]++;
					grid[x-1][y]++;
					grid[x][y-1]++;
					grid[x][y+1]++;
				}
				break;
			case 1: //하 y--
				if(grid[x][y-1]==1) {
					y--;
					grid[x][y] = -1;
					grid[x+1][y]++;
					grid[x-1][y]++;
					grid[x][y-1]++;
					grid[x][y+1]++;
				}
				break;
			case 2: //좌 
				if(grid[x-1][y]==1) {
					x--;
					grid[x][y] = -1;
					grid[x+1][y]++;
					grid[x-1][y]++;
					grid[x][y-1]++;
					grid[x][y+1]++;
				}
				break;
			case 3: //우 
				if(grid[x+1][y]==1) {
					x++;
					grid[x][y] = -1;
					grid[x+1][y]++;
					grid[x-1][y]++;
					grid[x][y-1]++;
					grid[x][y+1]++;
				}
			}
		}
		grid[x][y] = 0;
		
		for(int i = 0; i < gridLength; i++) {
			for(int j = 0; j < gridLength; j++) {
				if(grid[i][j] == 1 ) {//가능한길
					System.out.print("□ ");
				}
				if(grid[i][j] >= 2){//벽
					System.out.print("■ ");
				}
				if(grid[i][j] == 0){//길
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}

}