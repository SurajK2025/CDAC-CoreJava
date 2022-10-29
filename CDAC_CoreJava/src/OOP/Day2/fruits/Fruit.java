package OOP.Day2.fruits;

public class Fruit {
	
	private String colour;
	private double weight;
	private String name;
	private boolean isfresh;
	
	Fruit(String colour,double weight,String name){
		this.colour=colour;
		this.weight=weight;
		this.name=name;
		this.isfresh=true;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setIsFresh(boolean isfresh) {
		this.isfresh=isfresh;
	}
	
	public boolean getIsFresh() {
		return isfresh;
	}
	
	public String taste() {
		return "No specific taste.";
	}
	
	@Override
	public String toString() {
		return "Name: "+this.name+" Colour: "+this.colour+" Weight: "+this.weight;
	}
}
