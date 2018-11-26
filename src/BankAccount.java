public class BankAccount {
	private static long generatedAccountNumber = 100000001L;
	
	private double balance;
	private long accountNumber;
	private AccountHolder accountHolder;
	
	public BankAccount(double balance, AccountHolder accountholder ) {
		this.accountNumber = BankAccount.generatedAccountNumber++;
		this.balance = balance;
		this.accountHolder = accountHolder;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountnumber) {
		this.accountNumber = accountNumber;
	}
	
	
	public AccountHolder getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(AccountHolder accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public int deposit(double amount) {
		if (amount <= 0) {
			return 0;
		} else {
			balance = balance + amount;
			return 1;
		}
	}

	public int withdraw(double amount) {
		if (amount > balance) {
			return 0;
		} else if (amount <= 0) {
			return 1;
		} else {
			balance = balance - amount;	
			return 2;
		}
	}
}
