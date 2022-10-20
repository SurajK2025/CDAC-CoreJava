package Cop.Day1;
import java.util.Scanner;

public class Power_10{
	public static void main(String[] args){
		int base, power, product=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base and power: ");
		base = sc.nextInt();
		power = sc.nextInt();
		
		while(power>0){
			product = product*base;
			power--;
		}

		System.out.println("Product is "+product);
	}

}