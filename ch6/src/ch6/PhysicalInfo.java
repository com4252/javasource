package ch6;

public class PhysicalInfo {
	//생성자 오버로딩
	//오버로딩 : 한 클래스에 동일한 이름의 메소드, 생성자가 존재
	
	String name;
	int age;
	float height;
	float weight;
	//생성자 오버로딩
	//생성자 이름은 같아야함
	//매개변수의 개수 또는 타입이 달라야함
	public PhysicalInfo(String name, int age, float height, float weight) {
//		super();
//		this.name = name;
//		this.age = age;
		
		this(name,age); //생성자에서 다른생성자 호출
		this.height = height;
		this.weight = weight;
//		this(height,weight);//Constructor call must me the first statement in a constructor
	}
		public PhysicalInfo(int age, String name, float height, float weight) {
			super();
			this.name = name;
			this.age = age;
			this.height = height;
			this.weight = weight;
	}
	public PhysicalInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public PhysicalInfo(float height, float weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	
	
}
