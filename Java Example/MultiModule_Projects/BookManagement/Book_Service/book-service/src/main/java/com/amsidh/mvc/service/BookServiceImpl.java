/**
 * 
 */
package com.amsidh.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.amsidh.mvc.doa.BookDao;
import com.amsidh.mvc.dom.BookDom;

/**
 * @author VIRU
 * 
 */
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	@Autowired
	private TestService testService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.amsidh.mvc.service.BookService#addBook(com.amsidh.mvc.dom.BookDom)
	 */
	@Override
	public void addBook(BookDom bookDom) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.amsidh.mvc.service.BookService#getBookDomByBookId(java.lang.Integer)
	 */
	@Override
	public BookDom getBookDomByBookId(Integer bookId) {
		// TODO Auto-generated method stub

		return bookDao.getBookDomByBookId(123);
	}

	@Override
	public BookDom getBookDomByBookIdFormTestService(Integer bookId) {
		return testService.getBookDomByBookId(123);
	}

}
