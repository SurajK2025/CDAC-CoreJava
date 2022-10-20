package Cop.Day1;
import java.util.Scanner;

public class Salary_6{
	public static void main(String[] args){
		float salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary: ");
		salary = sc.nextFloat();
		
		if(salary < 50000)
			System.out.println("Tax: 0");
		else if(salary > 50000 && salary < 300000)
			System.out.println("Tax: "+(salary*0.2));
		else
			System.out.println("Tax: "+(salary*0.3));
	}

}