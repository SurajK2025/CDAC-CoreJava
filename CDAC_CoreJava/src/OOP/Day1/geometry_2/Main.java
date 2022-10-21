package OOP.Day1.geometry_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter two coordinates to check equality: ");
        Point2D point = new Point2D(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(point.Display());;
        
        if(point.isEqual())
            System.out.println("The given coordinates are equal.");
        else
            System.out.println("The given coordinates are not equal.");
	}
}