package Cop.Day4.Book;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book b1 = new Book();
		b1.setId(141);
		System.out.print(b1.getId() + " ");
		b1.setAuthor("Ruskin Bond");
		System.out.print(b1.getAuthor() + " ");
		b1.setPrice(90);
		System.out.println(b1.getPrice());

		Book b2 = new Book();
		b2.setId(142);
		System.out.print(b2.getId() + " ");
		b2.setAuthor("R. K. Narayan");
		System.out.print(b2.getAuthor() + " ");
		b2.setPrice(450);
		System.out.print(b2.getPrice() + " ");

		System.out.println("\nEnter book details: ");
		Book b3 = new Book(sc.nextInt(), sc.next(), sc.nextInt());

	}

}
