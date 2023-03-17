package ch6;
/*클래스 구성요소
 * 1. 멤버변수- 속성
 * 2. 메소드- 기능
 * 3. 생성자- 인스턴스 초기화 담당
 * ①매개변수가 없는 생성자(기본생성자
 * ②매개변수가 있는 생성자
 */
public class Car3 {
	//속성(property):멤버변수
	//제조사,모델,색상,최대속도...
	String company;
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	//[source]-[Generate Constructor using fields...]
	//생성자의 이름은 클래스 이름과 동일해야함*무조건
	//리턴값이 없음(메소드 만들때 void가 리턴값)
	//생성자는 여러개 존재 가능(생성자 오버로딩)
	
	//목적 : 인스턴스가 생성될 때 호출됨
	//		인스턴스 초기화 담당
	public Car3() {//기본(default)생성자
		super();
	}
	//생성자 오버로딩
	//매개변수가 있는 생성자
	public Car3(String company, String model, String color, int maxSpeed) {
//		super();
//		this.company = company;
//		this.model = model;
//		this.color = color;
		this(company,model,color);
		this.maxSpeed = maxSpeed;
	}
	
	public Car3(String company, String model, String color) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
	}

	//기능(function)
	//전진,후진
	void forward() {
		System.out.println("전진");
	}
	void backward() {
		System.out.println("후진");
	}
	
	@Override
	public String toString() {
		return "Car3 [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
}
