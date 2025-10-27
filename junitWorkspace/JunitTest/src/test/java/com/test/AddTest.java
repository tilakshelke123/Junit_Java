package com.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
	 @BeforeEach
		void Test3() {
//			int result=  a1.add(20, 40);
//			assertEquals(60,result,"Test Case1 Add function susccesfully passed it  matches with result . ");
      System.out.println("Before run each ");
		 }
		
	 @DisplayName("Addition")
	@Test
	void Test1() {
		int result=  a1.add(20, 40);
		assertEquals(60,result,"Test Case1 Add function susccesfully passed it  matches with result . ");
	}
	
	@Disabled("due to today is my happy birthday")
	@Test
	void Test2() {
		int result=  a1.add(20, 40);
		assertNotEquals(50,result,"Test Case1 Add function susccesfully passed it  matches with result . ");
	}
	 @AfterEach
		void Test4() {
//			int result=  a1.add(20, 40);
//			assertEquals(60,result,"Test Case1 Add function susccesfully passed it  matches with result . ");
   System.out.println("After run each");
		 }
	 @AfterAll
		static void Test6() {
//			int result=  a1.add(20, 40);
//			assertEquals(60,result,"Test Case1 Add function susccesfully passed it  matches with result . ");
   System.out.println("after run all");
		 }
	 @Test
		void Test7() {
			int result=  a1.show(20);
			assertNotNull(result,"Test Case1 Add function susccesfully passed it  matches with result . ");
		}
}

