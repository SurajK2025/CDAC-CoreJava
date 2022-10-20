package Cop.Day1;
import java.util.Scanner;

public class Series_12{
	public static void main(String[] args){
		int num, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		
		for(int i=1; i<=num; i++){
			sum = sum+i;
		}
		System.out.println("Total is: "+sum);
	}

}