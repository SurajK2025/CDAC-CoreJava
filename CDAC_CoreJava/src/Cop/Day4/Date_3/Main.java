package Cop.Day4.Date_3;

import java.util.Scanner;

import Cop.Day4.Person_2.Person;

public class Main {
	public static void main(String[] args) {
		int date, month, year, size;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of days of exams: ");
		size = sc.nextInt();
		Date dt[] = new Date[size];
		
		System.out.println("Enter date in dd mm yyyy fromat");
		
		for(int i=0; i<size; i++) {
			System.out.println("Paper "+(i+1)+": ");
			dt[i] = new Date();
			dt[i].setDate(sc.nextInt());
			dt[i].setMonth(sc.nextInt());
			dt[i].setYear(sc.nextInt());
		}
		
		for(int i=0; i<size; i++) {
			System.out.println("Paper"+(i+1)+dt[i]);
		}
	}
}
