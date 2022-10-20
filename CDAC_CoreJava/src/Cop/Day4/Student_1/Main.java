package Cop.Day4.Student_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int count, rollno;
		String name;
		int[] marks = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		count = sc.nextInt();
		
		
		Student[] st = new Student[count];
		for(int i=0; i<count; i++) {
			System.out.println("Enter student "+(i+1)+"'s info: ");
			System.out.println("Name: ");
			name = sc.next();
			
			System.out.println("Roll No: ");
			rollno = sc.nextInt();
			
			System.out.println("Enter marks of 5 subjects: ");
			for(int j=0; j<5; j++)
				marks[j] = sc.nextInt();
			
			st[i] = new Student(name, rollno, marks);
			st[i].calcPercentage();
			System.out.println("-------------------\n");
		}
	}
}