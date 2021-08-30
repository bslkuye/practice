package practiceFile.lv1;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("소방차");
		Car c2 = new Car("구급차");
		
//		c1.name = "소방차"; 기본생성자
		c1.number = 1234;
		
//		c2.name = "구급차"; 기본생성자
		c2.number = 1111;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
		
	}

}
