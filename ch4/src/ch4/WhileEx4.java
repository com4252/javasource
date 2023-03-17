package ch4;

public class WhileEx4 {
	public static void main(String[] args) {
		//while, Math.random()사용
		//두개의 주사위를 던져 나오는 값을 (값1,값2)형태로 출력하고
		//값의 합이 5가아니면 계속 주사위를 던지고, 5인경우 실행종료
		
		while (true) {
			int dice1 = (int)(Math.random()*6+1);
			int dice2 = (int)(Math.random()*6+1);
			
			System.out.printf("(%d, %d)\n",dice1,dice2);
			
			if (dice1+dice2==5) break;
		}	
		//for, if 수행할 문장이 하나라면 블럭 생략가능
		//EX)if(ture)
		//	System.out.println("True");
		//EX2)if(ture) -이경우엔 블럭이없어서 2번째문장은실행x
		//	System.out.println("True");
		//	System.out.println("123");
	}
}
