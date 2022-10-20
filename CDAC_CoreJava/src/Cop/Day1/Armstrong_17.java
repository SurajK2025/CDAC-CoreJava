package Cop.Day1;

import java.util.Scanner;
import java.lang.Math;

public class Armstrong_17{
	public static void main(String[] args){
		int num, rem, sum=0, temp, len;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		temp = num;
		
		len = String.valueOf(num).length();
		
		while(num>0){
			rem = num%10;
			sum += Math.pow(rem, len);
			num = num/10;
		}
		
		if(sum == temp)
			System.out.println("Given number is a Armstrong number.");
		else
			System.out.println("Given number is not a Armstrong number.");
	}
}