package Cop.Day4.Bank_7;

import java.util.Scanner;
public class Main {

	public static int noOfAcc=0, index=0;
	static BankOperations[] bnk = new BankOperations[20];
	
	private static void findAccount(int accountNo) {
		for(int i=1; i<=noOfAcc; i++) {
			if(bnk[i].getAccountNo() == accountNo) {
				System.out.println("Welcome "+bnk[i].getName());
				index = i;
			}
		}
	}
	
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("********************************");
			if(index != 0) System.out.println("Now Open Account: " + bnk[index].getName());
			System.out.println("\n1.Open a new bank account. \n2.Deposite Money. \n3.Withdraw Money. \n4.Check Balance.");
			System.out.println("5.Transfer funds.");
			System.out.println("6.Make transactions on an old account.");
			System.out.println("7.Exit\n");
			System.out.println("Make a choice: ");
			choice = sc.nextInt(); 

			switch(choice) {
			case 1:
				index++;
				noOfAcc++;
				if(index<noOfAcc) index = noOfAcc;
				bnk[index] = new BankOperations();
				System.out.println("Enter your name and opening balance: ");
				bnk[index].accecptUser(sc.next(), sc.nextInt());
				break;

			case 2:
				if(index == 0) break;
				System.out.println("Enter the amount you want to depostie: " + "\n");
				bnk[index].depositeMoney(sc.nextInt());
				break;

			case 3:
				System.out.println("Enter the amount of money you want to withdraw: " + "\n");
				bnk[index].withdrawMoney(sc.nextInt());
				break;

			case 4:
				System.out.println("Current balance of" + bnk[index].getName() + ": " + bnk[index].displayBalance() + "\n");
				break;

			case 5:
				boolean account_found = false;
				int amount=0;
				System.out.println("Enter the account number of receiver: ");
				int receiver_accNo = sc.nextInt();

				for(int i=1; i<=noOfAcc; i++) {
					if(bnk[i].getAccountNo() == receiver_accNo) {
						account_found = true;
						System.out.println("Enter amount you want to send: ");
						amount = sc.nextInt();
						bnk[i].depositeMoney(amount);
						bnk[index].withdrawMoney(amount);
						System.out.println("\nTransaction Completed.");
					}
					else if (!account_found) {
						System.out.println("Account not found! Try again.");
						break;
					}
				}
				break;

			case 6:
				System.out.println("Enter your account number: ");
				findAccount(sc.nextInt());
				break;

			default:
				System.out.println("Invalid choice. Try again" + "\n");
			}
		}while(choice != 7);

	}

}
