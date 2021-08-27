package practiceFile.lv1;

public class StringExam {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";   //hello 라는 변하지 않는 상수값을 가지므로 1,2는 같은 주소값을 가짐
		
		String str3 = new String("hello");  
		String str4 = new String("hello");  //str3과 str4는 다른 주소값을 가진다
		
		if(str1 == str2) {
			System.out.println("1,2같은 레퍼런스");
		}
		
		if(str1 == str3) {
			System.out.println("1,3같은 레퍼런스");
		}		
		
		if(str3 == str4) {
			System.out.println("3,4같은 레퍼런스");
		}
		System.out.println(str1);
		System.out.println(str1.substring(3));
		System.out.println(str1);
		
	}

}
