package abstr;

public abstract class Unit {
	int x,y;
	void move (int x, int y){
		System.out.println("움직인다");
	}
	void stop () {
		//자손 클래스에서 해야하는일이 동일하다면
		//구현해서 상속 시키기
		System.out.println("정지한다.");
	}
}
