package ch1;

//형변환 : 강제형변환(casting), 자동형변환(작은=>큰)
//		boolean을 제외한 나머지 7개의 기본형은 서로 형변환 가능
//정수형 ==> 실수형 (큰것 => 작은것 손실X)
//실수형 ==> 정수형 (작은것 => 큰것 손실O)
//자동형변환  (왼쪽부터 작은순)
//byte =>short, char => int => long => float => double
public class VariableEx8 {
	public static void main(String[] args) {
		int i = 91234567;
		float f = (float)i;
		// 큰 타입을 작은 타입에 담을 때는 오류가 남 ==>
		// 변경 타입을 앞에 꼭 써야함(캐스팅 casting)
		int i2 = (int)f;
		System.out.printf("i=%d\n",i);
		System.out.printf("f=%f i2=%d\n",f,i2);
		//위의 경우에는 큰것을 작은것에 옮겨담아서 손실이 생긴다(값이 다르다)
		
		//자동형변환 : 변경 타입 생략 가능
		byte byteValue = 10;
		int intVal = byteValue;
		System.out.printf("intVal = %d\n",intVal);
		
		char charVal = 'a';
		intVal = charVal;
		System.out.printf("intVal = %d\n",intVal);
		System.out.printf("charVal = %c\n",charVal);
		
		double d = 5.5;
		double result = intVal + d;
		System.out.printf("result = %f\n",result);
		//  \n : 엔터, \t ; tab
		
		System.out.println("abc\tdef");
		System.out.println("abc\\def");
		System.out.println("c:\\");
		// \자체에 의미가 있기때문에 \만쓰고싶으면 \\로 입력
	}
}
