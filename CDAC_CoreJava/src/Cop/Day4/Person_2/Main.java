package Cop.Day4.Person_2;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of persons to accecpt: ");
		count = sc.nextInt();
		
		Person[] pr = new Person[count];
		for(int i=0; i<count; i++) {
			pr[i] = new Person();
			System.out.println("Enter person "+(i+1)+"'s info-");
			pr[i].accecptPerson();
			System.out.println("-------------------\n");
		}
		
		for(int i=0; i<count; i++) {
			System.out.println("Person "+(i+1)+": "+pr[i]);
			System.out.println("-------------------\n");
		}
	}
}
