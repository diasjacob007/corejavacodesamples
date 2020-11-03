/**
 * 
 */
package com.ira.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author EVAAN
 *
 */
public class SortBooksLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Book> lstOfBooks = new ArrayList<>();
		lstOfBooks.add(new Book(101, "Java", 540.56));
		lstOfBooks.add(new Book(201, "Hibernate", 342.87));
		lstOfBooks.add(new Book(140, "Angular", 234.98));
		lstOfBooks.add(new Book(340, "SOAP WebService", 456.12));
		System.out.println("Before Sorting\n");
		lstOfBooks.stream().forEach(bookData -> System.out
				.println(bookData.getBookId() + ":" + bookData.getBookTitle() + ":" + bookData.getPrice()));
		Collections.sort(lstOfBooks, (book1, book2) -> book1.getBookTitle().compareTo(book2.getBookTitle()));
		System.out.println("Sorting Books Based on Title\n");
		lstOfBooks.stream().forEach(bookData -> System.out
				.println(bookData.getBookTitle() + ":" + bookData.getPrice() + ":" + bookData.getBookId()));
		System.out.println("Sort Books Based on Price\n");
		Collections.sort(lstOfBooks, (book1, book2) -> book1.getPrice().compareTo(book2.getPrice()));
		lstOfBooks.stream().forEach(bookData -> System.out
				.println(bookData.getPrice() + ":" + bookData.getBookTitle() + ":" + bookData.getBookId()));
	}

}
