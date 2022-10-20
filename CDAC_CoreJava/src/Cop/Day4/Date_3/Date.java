package Cop.Day4.Date_3;

public class Date {
	private int date, month, year;
	
	public Date() {
	}

	public Date(int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return ": "+this.date+"/"+this.month+"/"+this.year;
	}
}
