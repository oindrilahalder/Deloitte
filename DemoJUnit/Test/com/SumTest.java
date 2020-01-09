package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumTest {

	Sum sum;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all");

	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each");
		 sum=new Sum();

	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each");

	}

	@Test
	void testAddNumbers()
	{
		assertNotEquals(100, sum.addnumbers(19, 20));
	}

}
