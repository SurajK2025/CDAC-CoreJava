package Cop.Day1;
import java.util.Scanner;

public class Vowels_7{
	public static void main(String[] args){
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character in lowercase: ");
		ch = sc.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			System.out.println("Given character is a Vowel");
		else
			System.out.println("Given character is not a Vowel");
	}

}