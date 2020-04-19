/**
 * 
 */
package com.amsidh.mvc.domain;

/**
 * @author VIRU
 * 
 */
public class Book {

	private Integer bookId;
	private String bookName;
	private Double price;
	private Integer isdnNumber;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Integer bookId, String bookName, Double price,
			Integer isdnNumber) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
		this.isdnNumber = isdnNumber;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getIsdnNumber() {
		return isdnNumber;
	}

	public void setIsdnNumber(Integer isdnNumber) {
		this.isdnNumber = isdnNumber;
	}

}
