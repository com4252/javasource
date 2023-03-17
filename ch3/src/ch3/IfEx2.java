package ch3;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
	
		int jumsu =0;
		//지역변수 초기화 후 사용
		char grade; //char : 문자 한개
		if(jumsu>=90) {
			grade='A';
		}else if(jumsu>=80) {
			grade='B';
		}else if(jumsu>=70) {
			grade='C';
		}else if(jumsu>=60) {
			grade='D';
		}else if(jumsu>=50) {
			grade='E';
		}else { //0~49 : else는 그밖의 모든것
			grade='F';
		}
		System.out.printf("점수 : %d, 등급 : %c\n",jumsu,grade);
		
		
			}

}
