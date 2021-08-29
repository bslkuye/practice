
package practiceFile.other;

import java.util.Random;

public class fractalSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gridLength = 100;
		int gl = gridLength;
		boolean[][] grid = new boolean[gl][gl];
		
		for(int i = 0; i < gl; i++) {
			for(int l = 0; l < gl; l++) {
				grid[i][l] = false;
			}
		} // 격자생성, 초기화
		
		grid[gl / 2][gl / 2] = true; //최초의 입자, 중심점
		
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		boolean contact = false;  //픽셀 움직임에 쓰일 접촉 여부 확인용
		
//		System.out.print(random.nextInt(4));
		int pixelSum = 0;
		for(;pixelSum < 3000 ; ) { //생성된 픽셀 수 확인
			
			int x = random.nextInt(gl);
			int y = random.nextInt(gl);
			int check = (x - 50) * (x - 50) + (y - 50) * (y - 50);
			
			if(check > 0 && grid[x][y] == false) {   //중점에서 일정거리 이상 떨어져 있으면 위치에 픽셀 생성
				pixelSum++; //생성 성공, 픽셀 총합 1증가
				
				//시각화
				
//				System.out.println(check+"c "+x+"x "+y+"y "+pixelSum+"ps ");
					
				while(contact == false) {  //픽셀의 움직임 시작 접촉할 때까지
//					System.out.println("move");
					grid[x][y] = true; //위치에 생성

					if(x == 0) {
						grid[x][y] = false;
						grid[x+1][y] = true;
						x++;
//						System.out.println("move"+x+" "+y);
					}
					if(x == gl - 1) {
						grid[x][y] = false;
						grid[x-1][y] = true;
						x--;
//						System.out.println("move"+x+" "+y);
					}
					if(y == 0) {
						grid[x][y] = false;
						grid[x][y+1] = true;
						y++;
//						System.out.println("move"+x+" "+y);
					}
					if(y == gl - 1) {
						grid[x][y] = false;
						grid[x][y-1] = true;
						y--;//픽셀의 위치가 최 외곽일 경우 안으로 한칸
//						System.out.println("move"+x+" "+y);
					}
					
					
					if(grid[x + 1][y] == true || grid[x - 1][y] == true || grid[x][y + 1] == true || grid[x][y - 1] == true) {
//						System.out.println(x+" "+y);
						break;   //픽셀이 고정픽셀과 접해있으면 픽셀 고정
					}
					int move = random.nextInt(4);
					
					switch(move) {
					case 0: //상 y++
//						System.out.println(move);
						grid[x][y] = false;
						grid[x][y+1] = true;
						y++;
						break;
					case 1: //하 y--
//						System.out.println(move);
						grid[x][y] = false;
						grid[x][y-1] = true;
						y--;
						break;
					case 2: //좌 x--
//						System.out.println(move);
						grid[x][y] = false;
						grid[x-1][y] = true;
						x--;
						break;
					case 3: //우 x++
//						System.out.println(move);
						grid[x][y] = false;
						grid[x+1][y] = true;
						x++;
					}
					
					
				}
			}
		}
		for(int i = 0; i < gl; i++) {
			for(int j = 0; j < gl; j++) {
				if(grid[i][j] == true) {
					System.out.print("■ ");
				}else {
					System.out.print("□ ");
				}
			}
			System.out.println("");
		}
		//다끝나고 시각화
		
	}

}
