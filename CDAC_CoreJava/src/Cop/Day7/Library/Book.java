package Cop.Day7.Library;

public class Book {
	private static int tempBookId = 64743;
	private String bname;
	private int price, bookId, stock;

	public Book(String bname, int price,int stock) {
		this.bname = bname;
		this.price = price;
		this.bookId = tempBookId;
		this.stock = stock;
		tempBookId++;
	}

	@Override
	public String toString() {
		return "Book [bname=" + bname + ", price=" + price + ", bookId=" + bookId + ", stock=" + stock + "]";
	}

	public void addStock(int num) {
		this.stock += num;
	}

	public void removeStock() {
		this.stock--;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
