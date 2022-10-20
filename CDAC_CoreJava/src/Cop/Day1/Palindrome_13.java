package Cop.Day1;
import java.util.Scanner;

public class Palindrome_13{
	public static void main(String[] args){
		int num, temp, rem, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		temp=num;

		while(num>0){
			rem = num%10;
			sum = (sum*10) + rem;
			num = num/10;
		}
		if(temp == sum)
		System.out.println("Number is a Plaindrome.");
		else
		System.out.println("Number is not a Plaindrome.");
		
	}

}
//12332