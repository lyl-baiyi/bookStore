package lyl.biz.admin.book.service;

import lyl.biz.admin.book.dao.BookDao;
import lyl.biz.admin.book.dao.BookDaoImpl;
import lyl.entity.Books;

public class BookServiceImpl implements BookService {
	BookDao dao = new BookDaoImpl();
	
	public void saveBook(Books book) {
		dao.saveBook(book);
	}

}
