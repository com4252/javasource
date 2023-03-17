package ch6;

import java.util.Scanner;

public class StudentEx3 {

	public static void main(String[] args) {
		//Studen2 인스턴스 생성
		//사용자로 부터 입력을 받은 정보를 가지고 생성
		
		Scanner sc = new Scanner(System.in);
		//이름, 반, 번호, 국어, 영어, 수학 입력받기
//		System.out.print("이름 >>");
//		String name = sc.nextLine();
//		
//		System.out.print("반 >>");
//		int ban = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("번호 >>");
//		int no = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("국어 >>");
//		int kor = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("영어 >>");
//		int eng = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("수학 >>");
//		int math = Integer.parseInt(sc.nextLine());
//		
//		Student2 student = new Student2(name, ban, no, kor, eng, math);
//		//주소 ==> 인스턴스 변수가 가지고있는 값으로 출력(toString())
//		System.out.println(student);
		
		//입력값으로 Student2 인스턴스를 3개 생성
		
		//배열 선언
		Student2 stu2[]= new Student2[3];
		
		//초기화
		for (int i = 0; i < stu2.length; i++) {
			System.out.print("이름>>");
			String name = sc.nextLine();
			System.out.print("반");
			int ban = Integer.parseInt(sc.nextLine());
			System.out.print("번호");
			int no = Integer.parseInt(sc.nextLine());
			System.out.print("국어");
			int kor = Integer.parseInt(sc.nextLine());
			System.out.print("영어");
			int eng = Integer.parseInt(sc.nextLine());
			System.out.print("수학");
			int math = Integer.parseInt(sc.nextLine());
			//입력값으로 인스턴스 생성
			stu2[i]=new Student2(name, ban, no, kor, eng, math);
		}
		//확인
		for (int i = 0; i < stu2.length; i++) {
			System.out.println(stu2[i]);
		}
		
		//향상된 for
		int arr[]=new int[3];
		for (int num:arr) {
			System.out.println(num);
		}

	}
}
