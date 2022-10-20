package Cop.Day1;
import java.util.Scanner;

public class Addition_2{
	public static void main(String[] args){
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Addition of "+num1+" and "+num2+" is: "+(num1+num2));
	}

}