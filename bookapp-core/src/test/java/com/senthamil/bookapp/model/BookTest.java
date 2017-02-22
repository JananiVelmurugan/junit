package com.senthamil.bookapp.model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BookTest {

	static Book book;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		book = new Book();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		book = null;
	}

	// @Before
	// public void setUp() throws Exception {
	// }
	//
	// @After
	// public void tearDown() throws Exception {
	// }

	@Test
	public void testToString() {
		System.out.println(book);
	}

	@Test
	public void testGetId() {
		System.out.println(book.getId());
	}

	@Test
	public void testSetId() {
		book.setId(1);
	}

	@Test
	public void testGetName() {
		System.out.println(book.getName());
	}

	@Test
	public void testSetName() {
		book.setName("Java");
	}

	@Test
	public void testGetPrice() {
		System.out.println(book.getPrice());
	}

	@Test
	public void testSetPrice() {
		book.setPrice(300f);
	}

}
