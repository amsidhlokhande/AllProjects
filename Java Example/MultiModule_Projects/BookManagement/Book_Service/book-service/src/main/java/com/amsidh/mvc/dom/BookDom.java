/**
 * 
 */
package com.amsidh.mvc.dom;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author VIRU
 * 
 */
@Entity
@Table(name = "BOOK")
public class BookDom implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9083976542791014586L;

	@Id
	@GeneratedValue
	@Column(name = "BOOK_ID")
	private Integer bookId;
	@Column(name = "BOOKNAME")
	private String bookName;
	@Column(name = "PRICE")
	private Double price;
	@Column(name = "ISDN")
	private Integer isdnNumber;

	public BookDom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookDom(Integer bookId, String bookName, Double price,
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
