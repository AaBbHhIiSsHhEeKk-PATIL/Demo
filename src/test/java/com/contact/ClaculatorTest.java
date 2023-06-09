package com.contact;

import org.junit.jupiter.api.Test;

import com.contact.Junit.Calculator;

public class ClaculatorTest {
	
	@Test
	public void addtest() {
		Calculator cal = new Calculator();
		Integer actualResult = cal.add(10, 20);
		Integer expectedResult = 30;
		
		
	}

	

}
