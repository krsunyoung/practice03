package prob2;

public class Account {
	private String accountNo;
	private int balance;
	
	public void save(int balance1){
		balance= balance+balance1;
		System.out.println(accountNo+" 계좌에 "+balance1 +"만원이 입금되었습니다.");

	}
	public void deposit(int balance1){
		balance= balance-balance1;
		System.out.println(accountNo+" 계좌에 "+balance1 +"만원이 출금되었습니다.");
		
	}
	public Account(String accountNo){
		this.accountNo=accountNo;
		System.out.println(accountNo+" 계좌가 개설되었습니다.");
	}
	
	public Account(String accountNo, int balance)
	{

		this.accountNo=accountNo;
		this.balance=balance;
		
		System.out.println(accountNo+" 계좌의 잔고는 "+balance+"만원 입니다.");	
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//public save, deposit
	
}
