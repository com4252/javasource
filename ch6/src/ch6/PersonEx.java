package ch6;

public class PersonEx {
	public static void main(String[] args) {
		Person p = new Person(); //Person 인스턴스 가 생성됨
		//=>Person이 가지고 있는 인스턴스변수,메소드 사용가능
		p.setName("");
		p.print();
		
		//다른클래스에서 static 메소드를
		//부를땐 static메소드가 속한
		//클래스.()
		Person.print2();

	}

}
