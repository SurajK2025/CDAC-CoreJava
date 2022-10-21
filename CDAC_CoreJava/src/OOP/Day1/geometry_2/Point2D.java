package OOP.Day1.geometry_2;

public class Point2D {
	private double x1,y1, x2, y2;
	
	Point2D(double x1, double y1, double x2, double y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    
    public boolean isEqual() {
        if(x1==x2 && y1==y2)
            return true;
        else 
            return false;
    }

    public String Display() {
        return "Coordinate 1: ("+this.x1+","+this.y1+") Coordinate 2: ("+this.x2+","+this.y2+")";
    }

}