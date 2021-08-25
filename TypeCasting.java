
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 50000;
		long y = x;  //큰 형태의 함수에 작은 형태를 넣는건 괜찮음
		
		long x2 = 5;
//		int y2 = x2;  //반대는 컴파일 오류가 남
		int y2 = (int) x2; //강제 형변환
		
		
		
	}

}
