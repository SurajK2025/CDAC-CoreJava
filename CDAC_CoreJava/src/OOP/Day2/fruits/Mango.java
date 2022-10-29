package OOP.Day2.fruits;

public class Mango extends Fruit{
	public Mango(){
		super("Yellow", 200, "Mango");
	}

	public String pulp() {
		return "Mango: creating  pulp!";
	}

	@Override
	public String taste() {
		return "Sweet";
	}
	
	@Override
	public String toString() {
		return super.toString()+this.taste();
	}
}