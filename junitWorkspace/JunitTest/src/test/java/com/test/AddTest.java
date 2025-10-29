package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.add.*;

public class AddTest {
	Add a1 = new Add();

	@BeforeAll
	static void Test5() {
//			int result=  a1.add(20, 40);
//			assertEquals(60,result,"Test Case1 Add function susccesfully passed it  matches with result . ");
		System.out.println("Before run all ");
	}

	// --------------------------------------------------------------------------------------------
	@BeforeEach
	void Test3() {
//			int result=  a1.add(20, 40);
//			assertEquals(60,result,"Test Case1 Add function susccesfully passed it  matches with result . ");
		System.out.println("Before run each ");
	}

	// --------------------------------------------------------------------------------------------
	@DisplayName("Addition")
	@Test
	void Test1() {
		int result = a1.add(20, 40);
		assertEquals(60, result, "Test Case1 Add function susccesfully passed it  matches with result . ");
	}

	// --------------------------------------------------------------------------------------------
	@Disabled("due to today is my happy birthday")
	@Test
	void Test2() {
		int result = a1.add(20, 40);
		assertNotEquals(50, result, "Test Case1 Add function susccesfully passed it  matches with result . ");
	}

	// --------------------------------------------------------------------------------------------
	@AfterEach
	void Test4() {
//			int result=  a1.add(20, 40);
//			assertEquals(60,result,"Test Case1 Add function susccesfully passed it  matches with result . ");
		System.out.println("After run each");
	}

	// --------------------------------------------------------------------------------------------
	@AfterAll
	static void Test6() {
//			int result=  a1.add(20, 40);
//			assertEquals(60,result,"Test Case1 Add function susccesfully passed it  matches with result . ");
		System.out.println("after run all");
	}

	// --------------------------------------------------------------------------------------------
	@Test
	void Test7() {
		int result = a1.show(20);
		assertNotNull(result, "Test Case1 Add function susccesfully passed it  matches with result . ");
	}
	// --------------------------------------------------------------------------------------------

	@DisplayName("Assert True !!!!")
	@Test
	void Test8() {
		int result = 5 - 3;
		assertTrue(result > 0, "Test8 Case  give true if value grteater than 0  checked condition   ");
	}

	// --------------------------------------------------------------------------------------------
	@Test
	void Test9() {
		int result1 = 5 - 3;
		assertTrue(result1 < 0, "Test9  Case  give false if value less  than 0  checked condition   ");
	}

	// --------------------------------------------------------------------------------------------
	@DisplayName("Reference checked --> assertSame")
	@Test
	void Test10() {
		String str = a1.hello();
		String check = str;
		assertSame(check, str, "Test10  check the refernce  ");
	}

	// --------------------------------------------------------------------------------------------
	@DisplayName("sTRING VALUE  checked --> assertEquals")
	@Test
	void Test11() {
		String str1 = "CDAC-ACTS";
		String check2 = "CDAC-ACTS";
		assertEquals(str1, check2, "Test11 check the STRING  VALUE  ");
	}
	// --------------------------------------------------------------------------------------------
}
