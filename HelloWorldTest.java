package com.nit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void HelloWorldtest() {
		
		HelloWorld a1=new HelloWorld();
		String res=a1.getMessage();
		assertEquals("Hello World",res);
	}

}
