package OOP.Day1.Geometry_1;

public class Point2D {
	private double x,y;

	Point2D(double x, double y){
		this.x=x;
		this.y=y;
	}
	
	@Override
	public String toString() {
		return "X Coordinate: "+this.x+" Y Coordinate: "+this.y;
	}
}