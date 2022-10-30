package OOP.Day1.Geometry;

import java.util.Scanner;

public class Tester4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("How many coordinates do you want to enter?");
        Point2D[] point = new Point2D[sc.nextInt()];
        
        for(int i=0; i<point.length; i++) {
            System.out.println("Enter "+(i+1)+" coordinate: ");
            point[i] = new Point2D(sc.nextDouble(), sc.nextDouble());
        }
        
        int count=1;
        for(Point2D p : point) {
            System.out.print("\nCoordinate "+count+" :");
            System.out.print(p);
            count++;
        }

	}

}
