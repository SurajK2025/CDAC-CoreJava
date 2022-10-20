package Cop.Day1;

import java.util.Scanner;

public class MathOperations_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		char operand;
		
		System.out.println("Enter two numbers and an operand: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		operand = sc.next().charAt(0);
		
		switch(operand) {
		case '+':
			System.out.println("Addition is: "+(num1+num2));
			break;
		case '-':
			System.out.println("Substraction is: "+(num1-num2));
			break;
		case '*':
			System.out.println("Multiplication is: "+(num1*num2));
			break;
		case '/':
			System.out.println("Division is: "+(num1/num2));
			break;
		}
	}

}
