package Cop.Day1;
import java.util.Scanner;

public class OddEven_4{
	public static void main(String[] args){
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers: ");
		num1 = sc.nextInt();
		
		if(num1%2 == 0)
			System.out.println("Given number is: Even");
		else
			System.out.println("Given number is: Odd");
	}

}