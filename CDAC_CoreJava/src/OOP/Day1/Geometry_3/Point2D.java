package OOP.Day1.Geometry_3;

public class Point2D {
	private double x,y;

	Point2D(double x, double y){
        this.x=x;
        this.y=y;
	}
    
    public double calcDist(Point2D point) {
        return Math.sqrt(Math.pow((this.x-point.x),2) + Math.pow((this.y-point.y),2));
    }

    @Override
	public String toString() {
		return "X Coordinate: "+this.x+" Y Coordinate: "+this.y;
	}
}