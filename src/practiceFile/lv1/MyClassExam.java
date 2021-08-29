package practiceFile.lv1;

public class MyClassExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myclass = new MyClass();
		myclass.method1();
		myclass.method2(10);
		myclass.method3();
		myclass.method4(1, 2);
		myclass.method5(4);
		
		int value = myclass.method3();
		System.out.println("m3이 리턴한 값" + value);
		int value2 = myclass.method5(55);
		System.out.println("m5가 리턴한 값" + value2);
		
	}

}
