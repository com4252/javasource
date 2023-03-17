package ch6;

//스택이란 : 입,출구가 같음
public class DataEx {
	public static void main(String[] args) {
		Data data = new Data();
		
		//초기화
		data.x = 10;
		System.out.println("main() : x="+data.x);
		
		//값만 넘어감 (data.x)
		change(data.x);
		System.out.println("After change(data.x)");
		System.out.println("main() : x = "+data.x);

		//주소가 넘어감 (data)
		change2(data);
		System.out.println("After change2(data.x)");
		System.out.println("main() : x = "+data.x);
	}
		//기본형 매개변수 : 값만 받게됨
		//int x: x가 가지고있는 값만 넘기는 방식
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x="+x);
	
	}
	
	//참조형 매개변수 : 값을 읽고 수정가능
	static void change2(Data d) {
		d.x = 1000;
		System.out.println("change() : x="+d.x);
	
	}
}
