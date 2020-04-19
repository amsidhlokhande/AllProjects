/**
 * 
 */
package com.amsidh.mvc.doa;

import com.amsidh.mvc.dom.BookDom;

/**
 * @author VIRU
 *
 */
public interface BookDao {
   
	public void addBook(BookDom bookDom);
	public BookDom getBookDomByBookId(Integer bookId);
}
