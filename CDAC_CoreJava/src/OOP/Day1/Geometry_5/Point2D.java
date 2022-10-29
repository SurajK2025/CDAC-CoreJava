package OOP.Day1.Geometry_5;

public class Point2D {
    private double x,y;

    Point2D(){}
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
}