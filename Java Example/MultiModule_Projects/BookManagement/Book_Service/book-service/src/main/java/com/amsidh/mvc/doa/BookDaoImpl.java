/**
 * 
 */
package com.amsidh.mvc.doa;

import org.springframework.stereotype.Repository;

import com.amsidh.mvc.dom.BookDom;

/**
 * @author VIRU
 *
 */
@Repository
public class BookDaoImpl implements BookDao {

	/* (non-Javadoc)
	 * @see com.amsidh.mvc.doa.BookDao#addBook(com.amsidh.mvc.dom.BookDom)
	 */
	@Override
	public void addBook(BookDom bookDom) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.amsidh.mvc.doa.BookDao#getBookDomByBookId(java.lang.Integer)
	 */
	@Override
	public BookDom getBookDomByBookId(Integer bookId) {
		// TODO Auto-generated method stub
		BookDom bookDom=new BookDom(123, "Java Language",500D, 65465);
		return bookDom;
	}

}
