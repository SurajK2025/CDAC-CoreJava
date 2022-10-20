package Cop.Day4.Book_4;

public class Book {
	private String bookname;
	private int id;
	private String author;
	private int price;

	Book(){
		id=3;
		author="jane";
		price=100;
	}

	Book(int id, String author, int price){
		this.id=id;
		this.author=author;
		this.price=price;

		System.out.println(this.id+" "+ this.author+" "+this.price);
	}

	public void setId(int id){
		this.id=id;
	}

	public int getId(){
		return this.id;
	}

	public void setAuthor(String author){
		this.author=author;
	}

	public String getAuthor(){
		return this.author;
	}

	public void setPrice(int price){
		this.price=price;
	}

	public int getPrice(){
		return this.price;
	}


}
