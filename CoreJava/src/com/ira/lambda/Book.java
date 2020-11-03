/**
 * 
 */
package com.ira.lambda;

/**
 * @author EVAAN
 *
 */
public class Book {

	private Integer bookId;
	private String bookTitle;
	private Double price;

	public Book() {
	}

	public Book(Integer bookId, String bookTitle, Double price) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.price = price;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
