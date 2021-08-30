package practiceFile.lv1;

public class EnumExam {
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		gender1 = "boy";
				//gender에 한 가지 값만 저장하고 싶음
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
//		gender2 = "boy";  //에러
	}

}
enum Gender{
	MALE,FEMALE; //이 값들만 들어가게 됨
}