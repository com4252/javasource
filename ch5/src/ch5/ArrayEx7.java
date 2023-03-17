package ch5;
/*참조타입에서 특정한값이 할당x인상태 : null
 * 
 * String:char배열에 기능을 추가한 개념
 */
public class ArrayEx7 {
	public static void main(String[] args) {
		
		System.out.println(args[0]);
		
		
		//int numArr[]=new int[3];
		
		String name[] = new String[3];
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		System.out.println(name[0]); //null(값이 할당x 상태)
		
		//초기화
		name[0]="Kim";
		name[1]="Park";
		name[2]="Yi";
		
		System.out.println(name[0]);
		System.out.println(name[0].charAt(1));
		
		String str = "ABCDE"; // 0부터1234
		
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		
		//문자열(String)비교 == (!=)을사용하지않음
		//equals(), equalsIgnoreCase() 전자는 대소문자 비교 
		//후자는 대소문자 무시하고비교
		System.out.println(str.equals("abcde"));
		System.out.println(str.equalsIgnoreCase("abcde"));
		
		System.out.print(str.equals("abcde")?"일치함":"일치하지 않음");
		
		if (str.equals("abcde")) {
			System.out.println("일치함");
		} else {
			System.out.println("일치하지 않음");
		}
	}
}