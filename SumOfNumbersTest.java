package com.nit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumbersTest {

	@Test
	void SumOfNumberstest() {
		
		SumOfNumbers obj1=new SumOfNumbers();
		int r1=obj1.SumOfEven(5, 15);
		assertEquals(50,r1);
		int r2=obj1.SumOfOdd(5,15);
		assertEquals(60,r2);
		
	}

}
