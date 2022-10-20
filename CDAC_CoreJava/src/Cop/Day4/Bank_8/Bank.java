package Cop.Day4.Bank_8;

public class Bank {
	private String name;
	private int balance,amount;
	private static int accno=100;

	public void acceptUser(String name, int balance){
		this.name=name;
		this.balance=balance;
		accno++;
	}

	public void DisplayInfo(){
		System.out.println(this.name);
		System.out.println(this.balance);
	}
	public void deposit(int d){
		balance=balance+d;
		System.out.println(balance);
	}

	public void withdraw(int w){
		balance=balance-w;
		System.out.println(balance);
	}

	public void checkBalance(){
		System.out.println(balance);

	}
}