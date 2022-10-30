package OOP.Day1.Geometry;

public class Point2D {
	private double x,y;
	
	Point2D(){}

	Point2D(double x, double y){
		this.x=x;
		this.y=y;
	}
	
	public double calcDist(Point2D point) {
        return Math.sqrt(Math.pow((this.x-point.x),2) + Math.pow((this.y-point.y),2));
    }
	
	@Override
    public boolean equals(Object point) {
    	if(point instanceof Point2D)
    		return this.x==((Point2D)point).x && this.y==((Point2D)point).y;
    	else 
    		return false;
    }
	
	@Override
	public String toString() {
		return "X Coordinate: "+this.x+" Y Coordinate: "+this.y;
	}
}