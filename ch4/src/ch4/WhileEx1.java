package ch4;

import java.util.Iterator;

/*반복문
 *어떤작업을 반복적으로 수행되도록할때 사용
 *종류 : for(주로사용), while, do-while
 */
public class WhileEx1 {

	public static void main(String[] args) {
		//①int i=0; 초기화
		//②i < 10;  조건식(false 일때 반복문 종료)
		//③조건식이 true일 때 블럭안으로 진입
		//④i++ 증감 i=1
		//⑤i < 10; 
		//⑥조건식이 true 일 때 블럭안으로 진입 : 출력문 실행
		// 이런식으로 조건식이 거짓이 될때까지 반복
		
		for (int i=0; i< 10;i++) {
			System.out.print(i+"  ");
		}
		System.out.println();
		for (int i=10; i>=1;i--) {
			System.out.print(i+"  ");
		}
		System.out.println();
		for (int i=1; i<= 10;i++) {
			System.out.print(i+"  ");
		}
		//i+=2  >>> i= i+2;
		//1 3 5 7
		System.out.println();
		for (int i=1; i<= 10;i+=2) {
			System.out.print(i+"  ");
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.println("Hello");
		}
		System.out.println();
		for (int i = 0; i <=100; i++) {
			System.out.print(i+"  ");
		}
		//1~10까지 덧셈 결과 출력
		System.out.println();
		int sum=0;
		for (int i = 1; i <=10; i++) {
			sum = sum+i;
		}
		System.out.println("1~10 합"+sum);
		
		int i= 0;
		while (i < 10) {
			System.out.print(i+"  ");
			i++;
		}

	}
}
