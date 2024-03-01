package com.tcs.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculator2 {

	/*
	 * @Test public void test() { fail("Not yet implemented"); }
	 */
	static Calculator calc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc = new Calculator();
		System.out.println("In setUpBeforeClass()");
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		calc = null;
		System.out.println("In tearDownAfterClass()");
	}
	@Before
	public void setUp() {
		System.out.println("In setUp()");
	}
	@After
	public void tearDown() {
		System.out.println("In tearDown()");
	}
	
	@Test
	public void testAdd() {
//		Calculator calc = new Calculator();
		int actual = calc.add(10, 10);
		int expected = 20;
		assertEquals(expected, actual);
	}
	@Test
	public void testAdd2() {
//		Calculator calc = new Calculator();
		int result = calc.add(10, 10);
		boolean actual = result > 0 && result <= 20;
		assertTrue(actual);
	}

}
