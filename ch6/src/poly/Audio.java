package poly;

public class Audio extends Product {
	public Audio() {
		super(50);
	}
	
	@Override //부모의 메소드를 새로 재정의(부모는 무조건 toString갖고있음)
	//모든클래스는 오브젝트 클래스를 상속받음(오브젝트엔 무조건 toString이있음)
	//
	public String toString() {
		return "Audio";
	}
}
