package Cop.Day4.Point_5;

public class PointFunction {
	private int x;
	private int y;

	PointFunction(){
		this.x=15;
		this.y=7;
	}

	PointFunction(int x, int y){
		this.x=x;
		this.y=y;

		System.out.println(this.x+" "+this.y);
	}

	public void setX(int x){
		this.x=x;
	}

	public int getX(){
		return this.x;
	}

	public void setY(int y){
		this.y=y;
	}

	public int getY(){
		return this.y;
	}
	
	public void display() {
		System.out.println(this.x+" "+this.y);
	}

}
