package ch3;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int input = Integer.parseInt(sc.nextLine());
		
		
		
		
		
		//if~else  == 삼항연산자
		String result=""; // string이어서 허용
		if(input%2==0) {
			result = "짝수";
		}else {
			result = "홀수";
		}
		//result cannot be resolved to a variable
		System.out.println(result);
	}

}
