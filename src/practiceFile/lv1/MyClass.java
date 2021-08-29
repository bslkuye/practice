package practiceFile.lv1;

public class MyClass { 
	public void method1() {  //매개변수도 없고 리턴 타입도 없는 경우
		System.out.println("m1이 실행됨."); 
	}
	
	public void mehtod2(int x) { //매개변수가 있고 리턴 타입이 없는 경우
		System.out.println(x + "를 이용한 m2실행됨.");
	}
	
	public int method3() {  // 
		System.out.println("m3이 실행됨.");
		return 10;
	}
	
	public void method4(int x, int y) {
		System.out.println(x + y + "m4이 실행됨.");
	}
	
	public int method5(int y) {
		System.out.println(y + "m5이 실행됨");
		return y*2;
	}
	
}
