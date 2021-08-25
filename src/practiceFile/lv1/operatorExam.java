package practiceFile.lv1;

public class operatorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 =  -5;
		int i2 =  +i1;
		int i3 = -i2;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = ++i3;   // i3 + 1 = i3 = i4
		System.out.println(i4);
		System.out.println(i3);

		int i5 = i3++;   // i3 = i4 , i3 + 1 =i3
		
		System.out.println(i5);
		
		int i = 3;
		int j = 4;
		
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j); // = 0  형태가 정수라서 
		System.out.println(i/(double)j);
		System.out.println(i%j); //나머지
	}

}
