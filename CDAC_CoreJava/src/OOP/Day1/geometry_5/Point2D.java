package OOP.Day1.geometry_5;

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

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    
    public boolean isEqual(Point2D pt) {
        if(x==pt.x && y==pt.y)
            return true;
        else
            return false;
    }
}