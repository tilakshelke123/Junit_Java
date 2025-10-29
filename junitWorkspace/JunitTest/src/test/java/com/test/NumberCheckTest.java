package com.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.add.CheckOddEven;

public class NumberCheckTest {
	CheckOddEven s1 = new CheckOddEven();
	
	@Test
	void test() {
		assertTrue(CheckOddEven.isEven(4),"Number is Even !!!");
	}
	@Test
	void test1() {
		assertTrue(CheckOddEven.isEven(5),"Number is odd !!!");
	}

}
