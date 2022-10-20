package Cop.Day1;

import java.util.Scanner;

public class PizzaShop_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum=0, choice, pizOne=0, pizTwo=0, pizThree=0, pizFour=0;
		int[] intChoice = new int[20];

		System.out.println("Welcome to Pizza Shop: \n");
		System.out.println("1.Veggie Pizza. 150Rs \n2.Ham and crab stick Pizza. 200Rs "
				+ "\n3.Magherita Pizza. 100Rs \n4.Chicken Pizza. 200Rs"
				+ "\n5.Place Order");
		System.out.println("Make choice (one or multiple): ");

		do {
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				pizOne++;
				sum += 150;
				break;
			case 2:
				pizTwo++;
				sum += 100;
				break;
			case 3:
				pizThree++;
				sum += 100;
				break;
			case 4:
				pizFour++;
				sum += 200;
				break;
			case 5:
				System.out.println("Order placed successfully."
						+ "\nTotal bill = "+sum+"\nVeg Pizza:"+pizOne+"\nHam and crab stick Pizza:"+pizTwo+
						"\nMagherita Pizza:"+pizThree+"\nChicken Pizza:"+pizFour);
				break;
			default:
				System.out.println(choice+" was an invalid choice. Please try again !");
			}
		}while(choice != 5);
	}
}
