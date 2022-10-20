package Cop.Day4.Person_2;

import java.util.Scanner;
public class Person {

	private String name, city;
	private int age;
	Scanner sc = new Scanner(System.in);
	
	public Person() {
		super();
	}
	
	public void accecptPerson() {
		System.out.println("Enter name: ");
		name = sc.next();
		
		System.out.println("Enter city: ");
		city = sc.next();
		
		System.out.println("Enter age: ");
		age = sc.nextInt();
	}
	
	@Override
	public String toString() {
		return "Name=" + name + ", City=" + city + ", Age=" + age;
	}
}
