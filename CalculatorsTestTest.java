package com.verizon;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


         class CalculatorsTestTest {
        	 Calculators c;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("testing class started");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("testing ended");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("testing each case method started");
		c=new Calculators();
	}

	@AfterEach
	void tearDown() throws Exception {
		c=null;
		System.out.println("Ended for each case");
	}

	@Test
	void testTestSum() {
		assertEquals(8,c.sum(2, 6));
		//fail("Not yet implemented");
	}

	@Test
	void testTestDiff() {
		assertEquals(4,c.diff(8, 4));
		//fail("Not yet implemented");
	}

	@Test
	void testTestProduct() {
		assertEquals(12,c.product(4,3));
		//fail("Not yet implemented");
	}

	@Test
	void testTestDiv() {
		assertEquals(6,c.product(3, 2));
		//fail("Not yet implemented");
	}

}
