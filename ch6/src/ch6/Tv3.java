package ch6;

//private:외부접근불가

public class Tv3 { 
	
	private String color; //색상
	private int channel; //채널
	private boolean power; //전원상태
	
	
	public Tv3() {
		super();
	}
	public Tv3(String color, int channel, boolean power) {
		super();
		this.color = color;
		this.channel = channel;
		this.power = power;
	}
	void power() {
		power = !power;
	}
	//채널을 증가하고 현재 채널을 리턴
	//int: 메소드가 실행이 끝난후 int값을 가지고 리턴
	int channelup() {
		channel++;
		return channel;
	}

	void channeldown() {
		channel--;
	}
	//getter/setter 메소드
	//getter : 변수의 값을 리턴하는 형태
	public String getColor() {
		return color;
	}
	//setter : 변수의 값을 변경하는 형태
	public void setColor(String color) {
		this.color = color;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	
	
	
	
}
