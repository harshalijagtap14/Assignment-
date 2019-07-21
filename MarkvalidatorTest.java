package com.nit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkvalidatorTest {

	@Test
	void MarkValidatortest() {
		
		MarkValidator obj=new MarkValidator();
		String r1=obj.isPass(35);
		assertEquals("false",r1);
		String r2=obj.markGrade(95);
		assertEquals("A",r2);
	}

}
