package practiceFile.other;

import java.util.Random;

public class test {
	static int gridLength = 100;
	static int[][] grid = new int[gridLength][gridLength];
	static boolean endCheck = false;

	public static void roadMake(int x, int y) {
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		
		for(int i = 0; i < 100000 ; i++) {
			int move = random.nextInt(4);
			switch(move) {
			case 0: //�� y++
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
			case 1: //�� y--
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
			case 2: //�� 
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
			case 3: //�� 
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
	}
	
	public static void main(String[] args) {
		
		while(endCheck == false) {
			for(int i = 0; i < gridLength; i++) {
				for(int j = 0; j < gridLength; j++) {
					grid[i][j] = 0; // 0 �� 1 ���̻����� ���� 2 ��
				}
			} // ���ڻ���, �ʱ�ȭ
			
			for(int i = 0; i < gridLength; i++) {
				for(int l = 0; l < gridLength; l++) {
					grid[i][0] = 2;
					grid[i][gridLength-1] = 2;
					grid[0][l] = 2;
					grid[gridLength-1][l] = 2;
				}
			}
			
			grid[1][1] = 0; //�� ������
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
		
		
		for(int i = 0; i < gridLength; i++) {
			for(int j = 0; j < gridLength; j++) {
				if(grid[i][j] == 1 ) {//�����ѱ�
					System.out.print("�� ");
				}
				if(grid[i][j] >= 2){//��
					System.out.print("�� ");
				}
				if(grid[i][j] <= 0){//��
					System.out.print("  ");
				}
			}
			System.out.println("");
		} //print
	}

}