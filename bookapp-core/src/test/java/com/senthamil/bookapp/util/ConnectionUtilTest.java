package com.senthamil.bookapp.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConnectionUtilTest {

	@Test
	public void testDataSource() {
		System.out.println(ConnectionUtil.dataSource());
	}

	@Test
	public void testGetJdbcTemplate() {
		System.out.println(ConnectionUtil.getJdbcTemplate());
	}

}
