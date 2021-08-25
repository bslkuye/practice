package practiceFile.lv1;

public class ConstantExam {

	public static void main(String[] args) {
		int i;
		i =10;
		final int J;
		J = 10;
		
		double circleArea;
		final double PI;  // 상수는 항상 대문자
		PI = 3.14159;
//		circleArea = 3*3*3.14;
		circleArea = 3 * 3 * PI;
		System.out.println(circleArea);
		
		final int OIL_PRICE = 1450; //상수 두글자 이상 표현
		
	}

}
