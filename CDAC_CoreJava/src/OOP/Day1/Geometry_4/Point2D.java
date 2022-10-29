package OOP.Day1.Geometry_4;

public class Point2D {
	private double x,y;

    Point2D(){}
    Point2D(double x, double y){
        this.x=x;
        this.y=y;
    }

    public String Display() {
        return "("+this.x+","+this.y+")";
    }

}