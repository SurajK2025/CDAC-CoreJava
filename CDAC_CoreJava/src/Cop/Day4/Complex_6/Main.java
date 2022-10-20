package Cop.Day4.Complex_6;

public class Main {
	public static void main(String[] args) {
		ComplexNumber c1  = new ComplexNumber();
		c1.display();
		ComplexNumber c = new ComplexNumber(9,3);
		c.display();
		c.setReal(23);
		c.setImag(4);
		c.display();

	}

}
