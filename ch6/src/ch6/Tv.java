package ch6;
//변수, 연산자, 조건문, 반복문, 배열 어느 언어든 구조는 비슷
/* 자바 = 객체지향언어
 * 코드의 재사용성높다
 * 코드관리가용이
 * 신뢰성 높은 프로그래밍을 가능하게함
 *
 *자바는 클래스가 필수 >클래스: 객체를 정의해 놓은것
 *				  클래스 용도 : 객체를 생성하는데 사용
 *객체: 실제로 존재하는 것, 사물 or 개념
 */
public class Tv { //↓클래스는 어떻게만들어야할까?↓
	//속성{property) ==>멤버변수
	//크기, 길이, 높이, 색상, 볼륨, 채널....
	String color; //색상
	int channel; //채널
	boolean power; //전원상태
	
	//기능(function) ==>메서드
	//켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널변경....
	
	//메인이 없는 class는 실행을 시켜도 실행이안됨
	void power() {
		power = !power;
	}
	
	void channelup() {
		channel++;
	}

	void channeldown() {
		channel--;
	}
}
