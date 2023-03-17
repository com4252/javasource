package ch6;

public class Square {
	//정사각형 넓이
	
	//속성
	int length;
	//한변의 길이 : Length
	
	public Square(int length) {
		super();
		this.length = length;
	}
	//넓이
	int getArea() {
		return length*length;
	}

}
