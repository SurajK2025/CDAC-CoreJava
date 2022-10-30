package OOP.Day2.Fruits;

public class Orange extends Fruit{

	public Orange(){
		super("Orange",120,"Orange");
	}

	public String juice(){
		return "Orange: extracting juice!";
	}

	@Override
	public String taste() {
		return "Sour";
	}
	
	@Override
	public String toString() {
		return super.toString()+this.taste();
	}
}
