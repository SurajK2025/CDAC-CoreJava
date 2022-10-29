package OOP.Day1.Geometry_2;

public class Point2D {
	private double x,y;
	
	Point2D(double x, double y){
        this.x=x;
        this.y=y;
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