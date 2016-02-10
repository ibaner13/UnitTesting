package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.samples.CurrencyConverter;

public class FirstTestCase {

	CurrencyConverter conv = new CurrencyConverter();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After Called *********");
	}

	@Test
	public void test1() {
		// fail("Not yet implemented");
		double actual = conv.dollarToRupees(10);
		assertEquals(1000.0, actual, 0);
		/*
		 * assertEquals(expected, actual, delta). Delta is the tolerance limit
		 */
	}

	@Test
	public void test2() {
		// fail("Not yet implemented");
		Double actual = conv.dollarToRupees(10);
		assertNotNull(actual);
	}

}
