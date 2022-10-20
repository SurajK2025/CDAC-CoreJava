package Cop.Day1;
import java.util.Scanner;

public class OddEvenSum_14{
	public static void main(String[] args){
		int evenSum=0, oddSum=0, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();

		for(int i=1; i<=num; i++){
			if(i%2==0)
				evenSum += i;
			else
				oddSum += i;
		}

		System.out.println("Sum of even numbers: "+evenSum+" and odd numbers: "+oddSum);		
	}
}