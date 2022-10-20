package Cop.Day7.Library;

import java.util.Scanner;

public class Main {

	static int bookCount = 4, bookId=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char doContinue, isAdminChoice;
		int userChoice, adminChoice;

		Book book[] = new Book[10];
		book[0] = new Book("Metamorphoses", 300, 3);
		book[1] = new Book("The Book Theif" , 400, 5);
		book[2] = new Book("South of the Border",500,6);
		book[3] = new Book("West of the Sun",350,4);

		do {
			System.out.println("Do you wish to login? Y/N");
			doContinue = sc.next().charAt(0);
			if(doContinue == 'N') break; 

			System.out.println("Are you a Admin? Y/N");
			isAdminChoice = sc.next().charAt(0);
			
			//Admin Panel
			if(isAdminChoice == 'Y') {
				do {

					System.out.println("Admin Panel: \\n");
					System.out.println("1.Enter new book. \n2.Add stock of old book. \n3.Display inventory \n4.Logout \nMake a choice:");
					adminChoice = sc.nextInt();

					switch(adminChoice) {
					case 1: 
						System.out.println("Enter book name, price, stock");
						book[bookCount] = new Book(sc.next(), sc.nextInt(), sc.nextInt());
						bookCount++;
						break;

					case 2: 
						System.out.println("Enter book id: ");
						bookId = sc.nextInt();
						for(int i=0; i<bookCount; i++) {
							if(bookId == book[i].getBookId()) {
								System.out.println("Enter number of new stock to add: ");
								book[i].addStock(sc.nextInt());
							}
						}
						break;

					case 3: 
						for(int i=0; i<bookCount; i++) {
							System.out.println(book[i]);
						}
						break;
					case 4: System.out.println("Logout Successfully!!!");
						break;

					default: System.out.println("Invalid Choice !!! Please try again");

					}
				}while(adminChoice != 4);
			}
			//User Panel
			else {
				do {

					System.out.println("\nUser Panel \n1.Purchase/borrow book\n2.Return book \n3.Display All Books available \n4.Logout");
					System.out.println("\nEnter your choice:");
					userChoice = sc.nextInt();

					switch(userChoice) {
					case 1:
						System.out.println("Enter book id: ");
						bookId = sc.nextInt();
						for(int i=0; i<bookCount; i++) {
							if(bookId == book[i].getBookId()) {
								book[i].removeStock();
								System.out.println("Book delivered");
							}
						}
						break;

					case 2:
						System.out.println("Enter book id: ");
						bookId = sc.nextInt();
						for(int i=0; i<bookCount; i++) {
							if(bookId == book[i].getBookId()) {
								System.out.println("Book received");
								book[i].addStock(1);
							}
						}
						break;

					case 3:
						for(int i=0; i<bookCount; i++) {
							System.out.println(book[i]);
						}
						break;
					}


				}while(userChoice!=4);	
			}
		}while(doContinue != 'N');
		
		sc.close();

	}

}
