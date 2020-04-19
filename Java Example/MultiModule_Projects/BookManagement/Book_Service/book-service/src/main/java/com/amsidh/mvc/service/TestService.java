/**
 * 
 */
package com.amsidh.mvc.service;

import org.springframework.stereotype.Service;

import com.amsidh.mvc.doa.BookDao;
import com.amsidh.mvc.dom.BookDom;

/**
 * @author VIRU
 * 
 */

public interface TestService {

	public void addBook(BookDom bookDom);

	public BookDom getBookDomByBookId(Integer bookId);
}
