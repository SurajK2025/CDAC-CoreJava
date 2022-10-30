package OOP.Day1.Geometry;

import java.util.Scanner;

public class Tester5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many coordinates do you want to enter?");
		Point2D[] point = new Point2D[sc.nextInt()];

		//Accept coordinates
		for(int i=0; i<point.length; i++) {
			System.out.println("Enter "+(i+1)+" coordinate: ");
			point[i] = new Point2D(sc.nextDouble(), sc.nextDouble());
		}

		System.out.println("Enter the coordinate to be searched: ");
		Point2D temp = new Point2D(sc.nextDouble(), sc.nextDouble());

		boolean flag=false;
		for(Point2D p : point) {
			if(p.equals(temp)) {
				System.out.print("Coordinates found");
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("Coordinates not found");
		}

	}

}
