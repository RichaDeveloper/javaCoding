package com.richa.coding;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PersonTest {
	
	@Test
	public void shouldReturnHelloWorld() {
		
		Person richa = new Person();
		assertEquals("Hello World", richa.helloWorld());
		
	}
	

}
