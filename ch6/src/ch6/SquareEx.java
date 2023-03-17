package ch6;

public class SquareEx {
	public static void main(String[] args) {
		//객체생성==>초기화
		Square square = new Square(5);
		
		//메소드 호출
		System.out.println("정사각형넓이="+square.getArea());

	}
}
