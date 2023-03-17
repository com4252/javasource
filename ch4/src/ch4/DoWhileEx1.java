package ch4;
/* do~while
 * while 문 변형으로 조건식과 블럭의 순서를 바꿔놓은 것
 * 조건식이 만족하지 않아도 블럭이 한 번은 수행됨
 * 
 */
public class DoWhileEx1 {
	public static void main(String[] args) {
		//do-while : 먼저 실행 후 (while) 조건을 검사
		// 조건이 맞지않아도 한번은 실행을 함
		
		int input=0;
		
		do {
			System.out.println("Hello");
		} while (input!=0);

	}
}
