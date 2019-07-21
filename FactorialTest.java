package com.nit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void Factorialtest() {
		
		Factorial f1=new Factorial();
		int a1=f1.calculateFactorial(6);
		assertEquals(720,a1);
	}

}
