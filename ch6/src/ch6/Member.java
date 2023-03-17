package ch6;

public class Member {
	String userid;//아이디 userid ex)hong123
	String password;//비밀번호 password ex)hong123@!
	String confirmPassword;//비밀번호확인 confirm password ex)hong123@!
	String hp;//전화번호 hp ex)01012341234
	String address;//주소 address ex)서울
	
	

	public Member(String userid, String password, String confirmPassword, String hp) {
		super();
		this.userid = userid;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.hp = hp;
	}



	public Member(String userid, String password, String confirmPassword, String hp, String address) {
		super();
		this.userid = userid;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.hp = hp;
		this.address = address;
	}



	boolean passwordAndConfirmPasswordEquals(){
		//문자열 비교 == 사용x 
		//equals()  t/f
		//같으면 true로 틀리면 false 로 넘어감
		return password.equals(confirmPassword);
	}
}
