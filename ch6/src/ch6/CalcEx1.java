package ch6;

public class CalcEx1 {

	public static void main(String[] args) {
		//사칙연산
		//클래스 사용= 객체생성
		Calc1 calc = new Calc1();
		
		//메소드 호출
		//호출할때는 메소드 원형에 맞춰호출해야함
		//메소드의 리턴타입이 void가 아닌경우 리턴타입에 대한 준비 해야함
		//1)출력문안에 넣고 출력
		System.out.println("5+3="+calc.add(5,3));
		
		//2)변수에 받기
		int result=calc.add(15,3);
		//변수에 받은후 출력/ 변수에 받은 후 다른연산이나 작업을 추가로함
		result += 65;
		System.out.println("result="+result);
		
		System.out.println("10-3="+calc.subtract(10,3));
		System.out.println("10*3="+calc.multiple(10,3));
		System.out.println("10/3="+calc.divide(10,3));
		

	}
}
