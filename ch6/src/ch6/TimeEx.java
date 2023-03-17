package ch6;

public class TimeEx {
	public static void main(String[] args) {
		Time time = new Time();
		
		System.out.println("현재상태");
		System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());
		//Time.java에 생성자를 명시하지않았음
		//기본생성자를 자동으로생성
		//int의 기본값은 0이기때문에 0:0:0이나옴
		
		//원하는 시,분,초를 세팅
		time.setHour(16);
		time.setMinute(38);
		time.setSecond(22);
		System.out.println("바꾼 후 상태");
		System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());
	}
}
