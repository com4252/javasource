package ch1;

public class VariableEx1 {

	public static void main(String[] args) {
		
		int a=128, b=5;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);

		
		double d1 = 0.12345678909;
		float f1= 0.12345678909f;  //리터럴에 붙는 문자는 대소문자 구별 안함
		
		System.out.println("d1 = "+d1);
		System.out.println("f1 = "+f1);
		
		boolean b1 = true;
		System.out.println(b1);
		
		String b2 = "true";
		System.out.println(b2);
		
		char ch1 ='a';
		System.out.println(ch1);
		System.out.println(ch1+1);
	}

}
