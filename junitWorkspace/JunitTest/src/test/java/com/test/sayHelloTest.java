package com.test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.add.*;
public class sayHelloTest {
	
	SayHello s1 = new SayHello();
	@Test
	void Test1() {
		
	String str = s1.sayHello1("World!");
	assertEquals(str, "hello ,World!","String Match!!!");

	}
}
