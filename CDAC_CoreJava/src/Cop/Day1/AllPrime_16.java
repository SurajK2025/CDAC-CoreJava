package Cop.Day1;
import java.util.Scanner;

public class AllPrime_16{
	public static void main(String[] args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();

		System.out.print	("Prime numbers: 2 ");
		for(int i=3; i<=num; i++) {
			boolean flag = true;
			for(int j=2; j<i; j++){
				if(i%j == 0)
				flag = false;
				break;
			}
			if(flag)
			System.out.print(i+" ");
		}
		
	}
}