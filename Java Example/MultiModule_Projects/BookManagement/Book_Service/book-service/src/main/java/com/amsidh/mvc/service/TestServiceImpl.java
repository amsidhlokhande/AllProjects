/**
 * 
 */
package com.amsidh.mvc.service;

import com.amsidh.mvc.dom.BookDom;

/**
 * @author VIRU
 *
 */
public class TestServiceImpl implements TestService {

	/* (non-Javadoc)
	 * @see com.amsidh.mvc.service.TestService#addBook(com.amsidh.mvc.dom.BookDom)
	 */
	@Override
	public void addBook(BookDom bookDom) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.amsidh.mvc.service.TestService#getBookDomByBookId(java.lang.Integer)
	 */
	@Override
	public BookDom getBookDomByBookId(Integer bookId) {
		BookDom bookDom=new BookDom(123, "Java Language",500D, 65465);
		return bookDom;
	}

}
