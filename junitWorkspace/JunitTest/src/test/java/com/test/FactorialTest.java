package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.add.Factorial;

public class FactorialTest {
 Factorial t1 = new Factorial();
	@Test
	void test() {
		t1.fact(15);
		assertEquals(120,Factorial.fact(15),"Factorial match ");
	}

	
}
