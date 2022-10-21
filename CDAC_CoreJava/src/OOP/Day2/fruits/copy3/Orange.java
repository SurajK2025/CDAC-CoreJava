package OOP.Day2.fruits.copy3;

public class Orange extends Fruit{

	Orange(){
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
