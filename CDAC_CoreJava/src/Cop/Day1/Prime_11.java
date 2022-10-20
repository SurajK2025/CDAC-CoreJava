package Cop.Day1;
import java.util.Scanner;

public class Prime_11{
	public static void main(String[] args){
		int num, count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		
		for(int i=num; i>0; i--){
			if(num%i == 0)
				count++;
		}
		if(count == 2)
		System.out.println("Number is Prime");
		else
		System.out.println("Number is not Prime");
	}

}