package ch6;

public class Person {
	String name;
	float height;
	float weight;
	
	
	
	void print() {
		System.out.println("이름 : "+name);
		System.out.println("키 : "+height);
		System.out.println("몸무게 : "+weight);
	}
	
	public void setName(String name) {
		//name 이 공백이 아니고 null 아니면
		this.name = name;
		//공백이거나 null 이면 기본값을 홍길동
		if (name.equals("")|| name ==null) {
			this.name = "홍길동";
		}else {
			this.name = name;
		}
		print();
	}
	
	static void print2() {
		Person p = new Person();
		p.setName("");
	}
}
