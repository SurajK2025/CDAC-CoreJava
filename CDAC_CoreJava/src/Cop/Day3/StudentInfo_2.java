package Cop.Day3;
import java.util.Scanner;

public class StudentInfo_2 {

	public static void main(String[] args) {
		int[] marks = new int[5];
		int rollno;
		String name;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll no: ");
		rollno = sc.nextInt();
		
		System.out.println("Enter name: ");
		name = sc.next();
		
		System.out.println("Enter marks of 5 subjects: ");
		for(int i=0; i<5; i++)
			marks[i] = sc.nextInt();
		
		int total=0;
		for(int i=0; i<5; i++)
			total += marks[i];
	
		int per = (total/5);
		System.out.println("Name: "+name+"\nRoll No: "+rollno);
		System.out.println("Total = "+total+ "\nPercentage = "+per+"%");

		if(per >= 75)
			System.out.println("Grade = A");
		else if(per > 60 && per < 75)
			System.out.println("Grade = B");
		else if(per < 59)
			System.out.println("Grade = C");
		else
			System.out.println("You failed.");

	}

}
