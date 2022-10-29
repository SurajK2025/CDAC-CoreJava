package OOP.Day2.fruits;

import java.util.Scanner;

public class Tester1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of fruits to enter in basket");
		int size = sc.nextInt();

		Fruit fruits[] = new Fruit[size];
		int count=0, choice;

		do {
			System.out.println("1.Add an Apple \n2.Add a Mango \n3.Add an Orange \n4.Exit \nMake a Choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				fruits[count] = new Apple();
				count++;
				break;

			case 2:
				fruits[count] = new Mango();
				count++;
				break;

			case 3:
				fruits[count] = new Orange();
				count++;
				break;

			case 4:
				System.out.println("Visit Again.");
				break;

			default: 
				System.out.println("Invalid Choice");
				break;
			}
		}while(choice!=4 && count < size);


		int cntMango=0, cntApple=0, cntOrange=0;
		for (Fruit fruit : fruits) {
			if(fruit != null) {
				if(fruit.getName().equals("Mango"))
					cntMango++;
				else if(fruit.getName().equals("Apple"))
					cntApple++;
				else
					cntOrange++;
			}
		}

		System.out.println("------------------------------");
		System.out.println("List of all fruits: \nMangos: "+cntMango+"\nApples: "
				+cntApple+"\nOranges: "+cntOrange);
		sc.close();
	}
}
