package ch6;

public class MemberEx {

	public static void main(String[] args) {
		//4개를 넘길떄도 있꼬 5개를넘길때도 있다
		//생성자 오버로딩
		Member member1 = new Member("hong123","hong123@!","hong123@!","01012341234");
		Member member2 = new Member("hong123","hong123@!","hong123@!","01045671234","서울 종로구");
		
		//true 라면 비밀번호가 일치합니다
		//false 라면 비밀번호를 확인해주세요 출력.
		if(member1.passwordAndConfirmPasswordEquals()) {
		//true 라면 비밀번호 일치합니다.
		System.out.println("비밀번호가 일치합니다");
		}else {
			//false 라면 비밀번호를 확인해주세요
			System.out.println("비밀번호를 확인해주세요");
		}
		
		System.out.println(member2.passwordAndConfirmPasswordEquals()?
				"비밀번호가 일치합니다. ":"비밀번호를 확인해주세요");
		
		
		memberInfo(member1); // member1과 member2 내용 출력
		memberInfo(member2); // member1과 member2 내용 출력
	}

	static void memberInfo(Member member) {
		//출력결과
		System.out.println("아이디: "+member.userid);//아이디 :초기값 출력
		System.out.println("비밀번호 : "+member.password);//비밀번호 :초기값 출력
		System.out.println("전화번호 : "+member.hp);//전화번호 :초기값 출력
		System.out.println("주소 : "+member.address);//주소 : 초기값 출력
	}
}
