package OOP.Day2.fruits.copy1;

public class Mango extends Fruit{
	Mango(){
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