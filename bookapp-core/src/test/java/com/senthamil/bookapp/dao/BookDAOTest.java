package com.senthamil.bookapp.dao;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.senthamil.bookapp.model.Book;

public class BookDAOTest {

	@Before
	public void setUp() {
		BookDAO dao = new BookDAO();

		/* Before Save */
		// List<Book> list = dao.findAll();
		// assertEquals(5, list.size());

		/* Before Update */
		// Book book = dao.findById(1);
		// assertEquals(200f, book.getPrice(), 0f);

		/* Before Delete */
		List<Book> list = dao.findAll();
		assertEquals(6, list.size());

	}

	@After
	public void tearDown() {
		BookDAO dao = new BookDAO();

		/* After Save */
		// List<Book> list = dao.findAll();
		// assertEquals(6, list.size());

		/* After Update */
		// Book book = dao.findById(1);
		// assertEquals(500f, book.getPrice(), 0f);

		/* After Delete */
		List<Book> list = dao.findAll();
		assertEquals(5, list.size());

	}

	// @Test
	public void testSave() {

		Book book = new Book();
		book.setName("Java");
		book.setPrice(300f);

		BookDAO dao = new BookDAO();
		dao.save(book);
	}

	// @Test
	public void testUpdate() {

		BookDAO dao = new BookDAO();
		Book book = dao.findById(1);
		book.setPrice(500f);
		dao.update(book);
	}

	@Test
	public void testDelete() {
		BookDAO dao = new BookDAO();
		dao.delete(1);
	}

	// @Test
	public void testFindAll() {
		BookDAO dao = new BookDAO();
		List<Book> list = dao.findAll();
		for (Book b : list) {
			System.out.println(b);
		}

	}

}
