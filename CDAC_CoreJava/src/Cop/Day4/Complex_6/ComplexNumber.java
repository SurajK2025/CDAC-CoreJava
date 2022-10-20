package Cop.Day4.Complex_6;

public class ComplexNumber {
	private int real,imag;
	
	public ComplexNumber()
	{
		
	}
	public ComplexNumber(int real,int imag)
	{
		this.real=real;
		this.imag=imag;
	}
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImag() {
		return imag;
	}
	public void setImag(int imag) {
		this.imag = imag;
	}
	
	public void display() {
		System.out.println(real+"+"+imag+"i");
	}

}
