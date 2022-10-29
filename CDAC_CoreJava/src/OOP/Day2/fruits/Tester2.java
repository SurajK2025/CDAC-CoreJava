package OOP.Day2.fruits;
import java.util.Scanner;

public class Tester2 {

	private static void countFruits(Fruit[] fruit) {
		int cntMango=0, cntApple=0, cntOrange=0;
		for (Fruit frt : fruit) {
			if(frt != null) {
				if(frt.getName().equals("Mango"))
					cntMango++;
				else if(frt.getName().equals("Apple"))
					cntApple++;
				else
					cntOrange++;
			}
		}
		System.out.println("------------------------------");
		System.out.println("List of all fruits: \nApples: "+cntApple+"\nMangos: "
				+cntMango+"\nOranges: "+cntOrange);
	}

	private static void freshFruits(Fruit[] fruit) {
		int cntMango=0, cntApple=0, cntOrange=0;
		for (Fruit frt : fruit) {
			if(frt != null) {
				if(frt.getName().equals("Mango") && frt.getIsFresh())
					cntMango++;
				else if(frt.getName().equals("Apple") && frt.getIsFresh())
					cntApple++;
				else if(frt.getIsFresh())
					cntOrange++;
			}
		}
		System.out.println("------------------------------");
		System.out.println("List of fresh fruits: \nApples: "+cntApple+"\nMangos: "
				+cntMango+"\nOranges: "+cntOrange);
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of fruits to enter in basket");
		int size = sc.nextInt();

		Fruit fruits[] = new Fruit[size];
		int count=0, choice;

		do {
			System.out.println("1.Add Apple\t2.Add Mango\t3.Add Orange\t4.Exit\nMake a Choice");
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

		countFruits(fruits);
		freshFruits(fruits);
		sc.close();
	}
}