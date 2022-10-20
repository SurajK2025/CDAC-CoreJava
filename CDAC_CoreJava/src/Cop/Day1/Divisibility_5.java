package Cop.Day1;
import java.util.Scanner;

public class Divisibility_5{
	public static void main(String[] args){
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers: ");
		num1 = sc.nextInt();
		
		if(num1%5 == 0 && num1%7 == 0)
			System.out.println("Given number is: Divisible by both 5 and 7");
		else if(num1%5 == 0 && num1%7 != 0)
			System.out.println("Given number is: Divisible by 5 but not by 7");
		else if(num1%5 != 0 && num1%7 == 0)
			System.out.println("Given number is: Divisible by 7 but not by 5");
		else
			System.out.println("Given number is: Not Divisible by 7 & 5");
	}

}