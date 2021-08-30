package practiceFile.lv1;

public class VariableScopeExam {
	int globalScope = 10;
	static int staticVal = 7;
	
	
	public void scopeTest(int value) {
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest2(int value2) {

		System.out.println(globalScope);
//		System.out.println(localScope);  사용불가
//		System.out.println(value);
		System.out.println(value2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);       static 이 아니어서 static 내부에서 사용 불가
		System.out.println(staticVal);
		
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope);
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		v1.staticVal = 50;
		v2.staticVal = 100;
		
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal);  //static 변수는 값을 저장할 수 있는 공간이 하나밖에 없다.
		System.out.println(VariableScopeExam.staticVal); //클래스명을 직접 사용하는게 인스턴스를 만들지 않아도 돼서 바람직한 방법
		
		
	}

}
