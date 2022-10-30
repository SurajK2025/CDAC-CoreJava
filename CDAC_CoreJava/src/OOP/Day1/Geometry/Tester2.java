package OOP.Day1.Geometry;

import java.util.Scanner;

public class Tester2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter two coordinates to check equality: ");
        System.out.println("Coordinate1: ");
        Point2D point1 = new Point2D(sc.nextDouble(), sc.nextDouble());
        System.out.println("Coordinate2: ");
        Point2D point2 = new Point2D(sc.nextDouble(), sc.nextDouble());
        
        if(point1.equals(point2))
            System.out.println("The given coordinates are equal.");
        else
            System.out.println("The given coordinates are not equal.");

	}

}
