package ch6;

public class TvEx3 {
	public static void main(String[] args) {
		//객체 생성
		Tv3 tv = new Tv3();
		Tv3 tv2 = new Tv3("white",7,false);
		
		//초기화==>직접접근X
		//1.생성자
		//2.멤버 변수의 값 변경 위한 메소드 제공

		
		//현재 채널 정보를 알고싶다면?	
		System.out.println("현재 채널 "+tv2.getChannel());
		System.out.println("현재 색상 "+tv2.getColor());
		System.out.println("현재 전원 "+tv2.isPower());
		
		//tv2 채널 변경
		tv.setChannel(150);
		System.out.println("현재채널 "+tv.getChannel());
		
		
		//tv 속성 값 변경
		//색상 변경
		//메소드 호출시 void인경우 호출만 가능
		//syso에 넣지못함
		tv.setColor("black");
		System.out.println("tv color "+tv.getColor());
		System.out.println("현재 전원 "+tv.isPower());
	}
}
