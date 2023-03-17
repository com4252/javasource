package abstr;

//void move, stop ==> 모두 동일하게 들어가니까
//추상 메소드가 적합
//stimPack,changeMode 이런건 모두 다름 ==>
public class Marine extends Unit{
	void stimPack() {}
	
	@Override
	void move(int x, int y) {
		System.out.println("Marine [x="+x+", y="+y+"]");
	}
}

class Tank extends Unit{
	void changeMode() {}
	
	@Override
	void move(int x, int y) {
		System.out.println("Tank [x="+x+", y="+y+"]");
	}
}

class DropShip extends Unit{
	void load() {}
	void unload() {}
	
	@Override
	void move(int x, int y) {
		System.out.println("Dropship [x="+x+", y="+y+"]");
	}
}