package ch6;

public class StudentEx {

	//메인은 위에서 아래로 차례실행
	public static void main(String[] args) {
		Student stu = new Student("홍길동",1,1,100,60,70);
		
		String msg =stu.info();//stu.info 먼저 실행
		System.out.println(msg);
		//msg 출력시
		//홍길동,1,1,100,60,70,점수합계,평균

		
		//Student 2 객체 생성
		Student2 stu2 = new Student2("성춘향",2,1,78,89,65);
		System.out.println("이름 : "+stu2.name);
		System.out.println("이름 : "+stu2.getTotal());
		System.out.println("이름 : "+stu2.getAverage());

		//이름 : 성춘향
		//총점 : 236
		//평균 : 78.1223
		
		System.out.println(stu2);
	}

}
