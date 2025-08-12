package ch10.exs;

public class Account {

	// fields
	private String accountNumber;
	private String accountOwner;
	private long balance;
	private String password;

	// Constructor
	public Account(String accountNumber, String accountOwner, long balance, String password) {
		super();
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		this.balance = balance;
		this.password = password;
	}

	// Getters

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public long getBalance() {
		return balance;
	}

	// Methods

	// Override Methods
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s \t %s \t %d", accountNumber, accountOwner, balance);
	}
}
