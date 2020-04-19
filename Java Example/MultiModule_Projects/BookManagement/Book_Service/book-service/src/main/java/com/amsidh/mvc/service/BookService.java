/**
 * 
 */
package com.amsidh.mvc.service;

import com.amsidh.mvc.dom.BookDom;

/**
 * @author VIRU
 *
 */
public interface BookService {

	public void addBook(BookDom bookDom);
	public BookDom getBookDomByBookId(Integer bookId);
	public BookDom getBookDomByBookIdFormTestService(Integer bookId);
}
