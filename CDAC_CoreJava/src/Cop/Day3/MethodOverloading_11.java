package Cop.Day3;

import java.util.Scanner;
public class MethodOverloading_11 {

	private static int add(int n1, int n2) {
		return n1+n2;
	}
	
	private static int add(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of parameters to be added: ");
		int sum;
		if(sc.nextInt() == 2) {
			System.out.println("Enter number one and two: ");
			sum=add(sc.nextInt(), sc.nextInt());
		}
		else {
			System.out.println("Enter three numbers: ");
			sum=add(sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		System.out.println("Total: "+sum);
	}
}