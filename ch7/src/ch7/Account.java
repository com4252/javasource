package ch7;

public class Account {
		//속성
		//계좌번호(110-10-10000)accountNo
		//계좌주 owner(홍길동)
		//잔액 (정수) balance
		
		String accountNo;
		String owner;
		int balance;
		
		
		public Account(String accountNo, String owner, int balance) {
			super();
			this.accountNo = accountNo;
			this.owner = owner;
			this.balance = balance;
		}
		
		//기능 - 예금하다(deposit, 인출하다(withdraw)
		//예금하다:현재잔액=잔액+입금,현재 잔액 리턴
		int deposit(int amount) {
			balance += amount; // balance = balance+amount
			return balance;
		}
		//인출하다:잔액>출금액, 현재잔액=잔액-출금액, 현재 잔액 리턴
		int withdraw(int amount) {
			 if (balance<amount) {
				 throw new BalanceInsufficientException("잔액부족");
			}
			 balance -= amount;
			return balance;
		}
}
