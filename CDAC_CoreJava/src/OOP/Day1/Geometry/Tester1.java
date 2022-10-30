package OOP.Day1.Geometry;

import java.util.Scanner;

public class Tester1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter required coordinates: ");
		Point2D point = new Point2D(sc.nextDouble(), sc.nextDouble());
		System.out.println(point);


	}

}
