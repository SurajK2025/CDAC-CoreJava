package OOP.Day1.geometry_1;

public class Point2D {
	private double x,y;

	Point2D(double x, double y){
		this.x=x;
		this.y=y;
	}

	public String show() {
		return "X Coordinate: "+this.x+" Y Coordinate: "+this.y;
	}
}