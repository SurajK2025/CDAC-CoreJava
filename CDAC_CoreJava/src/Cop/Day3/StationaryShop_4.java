//4:Write a menu driven program for stationary shop.Items are 1:Pen 2:Pencil 3:NoteBook 4:Bottle 5:ColorBox.
//1 pen cost is 10Rs,Pencil is 5 rs.NoteBook is 20 rs Bottle is 30 rs and ColorBox is at 50 Rs.
//Calculate Total of all purchased items.

package Cop.Day3;

import java.util.Scanner;

public class StationaryShop_4 {

	public static void main(String[] args) {
		int choice, temp, sum=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Menu:\n1.Pen(10Rs)\n2.Pencil(5Rs)\n3.NoteBook(20rs)\n4.Bottle(30Rs)\n5.ColourBox(50Rs)\n6.Display Total Price");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			temp =0;
			switch(choice) {
			case 1:
				System.out.println("Enter number of Pen");
				temp = sc.nextInt();
				sum  += temp*10;
				break;
			case 2:
				System.out.println("Enter number of Pencil");
				temp = sc.nextInt();
				sum  += temp*5;
				break;
			case 3:
				System.out.println("Enter number of Notebook");
				temp = sc.nextInt();
				sum  += temp*20;
				break;
			case 4:
				System.out.println("Enter number of Bottle");
				temp = sc.nextInt();
				sum  += temp*30;
				break;
			case 5:
				System.out.println("Enter number of Colour Box");
				temp = sc.nextInt();
				sum  += temp*50;
				break;
			case 6:
				System.out.println("Total price = "+sum);
				break;
			}
		}while(choice !=6);
	}

}
