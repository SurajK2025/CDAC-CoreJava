package OOP.Day2.Fruits;

public class Apple extends Fruit{

	public Apple(){
		super("Red",100,"Apple");
	}
	
	public String jam(){
		return "Apple: making jam!";
	}
	
	@Override
	public String taste() {
		return "Sweet and sour";
	}

	@Override
	public String toString() {
		return super.toString()+this.taste();
	}
}
