package OOP.Day1.Geometry;

import java.util.Scanner;

public class Tester3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter two coordinates to calculate distance: ");
        System.out.println("Coordinate1 :");
        Point2D point1 = new Point2D(sc.nextDouble(), sc.nextDouble());
        System.out.println("Coordinate2 :");
        Point2D point2 = new Point2D(sc.nextDouble(), sc.nextDouble());
        
        System.out.println("The distance between two coordinates is: "+point2.calcDist(point1));

	}

}
