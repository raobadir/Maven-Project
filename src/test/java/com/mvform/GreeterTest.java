package com.mvform;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class GreeterTest {
	
	private Greeter greeter = new Greeter();
	
	@Test
	public void greeterSysHello() {
		assertTrue(greeter.sayHello().contains("Hello"));
	}

}
