package ch10.exs;

public class Account {
	private String accountNo;
	private String accountOwner;
	private long balance;
	private String password; // 4자리 숫자형태

	// 생성자
	public Account(String accountNo, String accountOwner, String password, long balance) {
		this.accountNo = accountNo;
		this.accountOwner = accountOwner;
		this.password = password;
		this.balance = balance;
	}

	// 접근자
	public String getAccountNo() {
		return accountNo;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public String getPassword() {
		return password;
	}

	public long getBalance() {
		return balance;
	}

	// 설정자
	public void setPassword(String oldPassword, String newPassword) {
		if (getPassword().equals(oldPassword) && !oldPassword.equals(newPassword)) {
			this.password = newPassword;
		} else {
			System.out.println("암호 불일치 등으로 암호를 변경할 수 없습니다.");
		}
	}

	// 입금/출금 메서드
	public void deposit(long money) {
		balance += money;
	}

	public void withdraw(long money) {
		if (balance < money) {
			System.out.println("출금 잔액이 부족합니다");
		} else {
			balance -= money;
			System.out.println("출금이 완료되었습니다.");
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s \t %s \t %d", accountNo, accountOwner, balance);
	}
}

//public class Account {
//
//	// fields
//	private String accountNumber;
//	private String accountOwner;
//	private long balance;
//	private String password;
//
//	// Constructor
//	public Account(String accountNumber, String accountOwner, long balance, String password) {
//		super();
//		this.accountNumber = accountNumber;
//		this.accountOwner = accountOwner;
//		this.balance = balance;
//		this.password = password;
//	}
//
//	// Getters
//
//	public String getAccountNumber() {
//		return accountNumber;
//	}
//
//	public String getAccountOwner() {
//		return accountOwner;
//	}
//
//	public long getBalance() {
//		return balance;
//	}
//
//	// Methods
//
//	// Override Methods
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return String.format("%s \t %s \t %d", accountNumber, accountOwner, balance);
//	}
//}
