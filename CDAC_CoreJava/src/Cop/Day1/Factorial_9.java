package Cop.Day1;
import java.util.Scanner;

public class Factorial_9{
	public static void main(String[] args){
		int num, sum=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		
		for(int i=num; i>0; i--){
			sum = sum*i;
		}

		System.out.println("Factorial of "+num+" is: "+sum);
	}

}