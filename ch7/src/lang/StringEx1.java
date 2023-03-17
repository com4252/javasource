package lang;

/* String 클래스
 * - 변경 불가능한(immutable) 클래스
 * - equals() : 값 비교
 * - equalsIgnoreCase() : 대소문자 구별하지 말고 값 비교
 * 
 */
public class StringEx1 {
	public static void main(String[] args) {
//콘솔 프로그램 작성 시 ==> 화면출력, 입력 ... main()메소드가 있는 클래스가 필요함
//String 클래스의 동작을 구현하기위해 메인 메소드가 있는 클래스를 만든것
		//문자열을 다루는 일이 많기 때문에 new를 사용하지 않아도 인스턴스를 생성할 수 있도록 되어있음
		//문자열 만들기 1) 문자열 리터럴 지정 2)new 사용하는 방식
		String str2 = "Hello"; //1)문자열 리터럴 지정
		String str4 = "Hello";
		String str = new String("안녕하세요"); //2)new 사용
		String str3 = new String("안녕하세요");
		//str2 = str2+str;
		
		//문자열 비교
		System.out.println(str2.equals(str));
		System.out.println(str2.equalsIgnoreCase(str));
		System.out.println(str == str3); //문자열 비교시는 == 사용X
		System.out.println(str2 == str4); //true
	}

}
