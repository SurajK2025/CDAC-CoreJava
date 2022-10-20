package Cop.Day1;
import java.util.Scanner;

public class Triangle_8{
	public static void main(String[] args){
		float ang1, ang2, ang3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three angles of triangle: ");
		ang1 = sc.nextInt();
		ang2 = sc.nextInt();
		ang3 = sc.nextInt();
		
		if(ang1+ang2+ang3 == 180)
			System.out.println("Given angles are of a triangle.");
		else
			System.out.println("Given angles are not of a triangle.");
	}

}