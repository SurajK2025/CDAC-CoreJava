package Cop.Day1;
import java.util.Scanner;

public class Swap_3{
	public static void main(String[] args){
		int num1, num2, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Numbers before swapping: "+num1+" "+num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Numbers after swapping: "+num1+" "+num2);
	}

}