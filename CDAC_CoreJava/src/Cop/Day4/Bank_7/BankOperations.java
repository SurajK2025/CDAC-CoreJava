package Cop.Day4.Bank_7;

public class BankOperations {

	private String name;
	private int balance, accountNo;
	private static int baseAccountNo = 56383;
	
	public void accecptUser(String name, int balance) {
		this.name = name;
		this.balance = balance;
		this.accountNo = baseAccountNo;
		System.out.println("Account number for "+this.name+" is: "+this.accountNo);
		baseAccountNo++;
	}	
	
	public void depositeMoney(int amount) {
		this.balance += amount;
	}
	
	public void withdrawMoney(int amount) {
		this.balance -= amount;
	}
	
	public int displayBalance() {
		return this.balance;
	}

	public int getAccountNo() {
		return accountNo;
	}
	
	public String getName() {
		return name;
	}
}