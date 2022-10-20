package Cop.Day4.Point_5;

public class Main {
	public static void main(String[] args) {
        PointFunction p1=new PointFunction();
        p1.display();
        PointFunction p2=new PointFunction(12,24);

        PointFunction p3=new PointFunction();
        p3.setX(0);
        p3.setY(0);
        System.out.println(p3.getX()+" "+p3.getY());
    }

}