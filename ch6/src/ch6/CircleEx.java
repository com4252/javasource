package ch6;

public class CircleEx {
	public static void main(String[] args) {
		//객체생성
		Circle circle = new Circle(3.5);
		//호출
		System.out.println("원의넓이"+circle.getArea());
		
		Circle circle1 = new Circle(4.5);
		System.out.println("원의넓이"+circle1.getArea());
	}
}
