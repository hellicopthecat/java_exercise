package ch7.EX;

import java.util.Arrays;

public class BookSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] books = { new Book(10000), new Book(5000), new Book(300), new Book(8000), new Book(6000) };

		for (Book book : books) {
			System.out.println(book.toString());
		}

		Arrays.sort(books);

		for (Book book : books) {
			System.out.println(book.toString());
		}

	}

}

class Book implements Comparable<Book> {
	int price;

	public Book(int price) {
		super();
		this.price = price;
	}

	@Override
	public int compareTo(Book b) {
		// TODO Auto-generated method stub
		return this.price - b.price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Booke [price = %d]", this.price);
	}
}
