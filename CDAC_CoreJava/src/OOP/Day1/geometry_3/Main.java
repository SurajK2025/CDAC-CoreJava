package OOP.Day1.geometry_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter two coordinates to calculate distance: ");
        Point2D point = new Point2D(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(point.Display());;
        
        System.out.println("The distance between two coordinates is: "+point.calcDist());
	}
}