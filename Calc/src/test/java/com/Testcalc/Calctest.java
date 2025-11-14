package com.Testcalc;




import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import com.calc.*;
public class Calctest {

	Calc calculate = new Calc();
	
	// Addition 
	@Test
	public void Test() {
		int result = calculate.add(20, 30);
		assertEquals(50, result , " Dtaa Successfully Matched !!!");
	}
	
	
	@Test
	public void Test1() {
		int result = calculate.add(20, 30);
		assertNotEquals(60, result , " Dtaa not  Matched successfully !!!");
	}
	

	@Test
	public void Test2() {
		int result = calculate.add(20, 30);
		assertTrue(result != 0, " Transaction True  !!!");
	}
	
	// Subtraction 
	@Test
	public void Test3() {
		int result = calculate.sub(30, 20);
		assertEquals(10, result , " Dtaa Successfully Matched !!!");
	}
	
	
	@Test
	public void Test4() {
		int result = calculate.sub(30, 20);
		assertNotEquals(60, result , " Dtaa not  Matched successfully !!!");
	}
	

	@Test
	public void Test5() {
		int result = calculate.sub(30, 20);
		assertTrue(result != 0, " Transaction True  !!!");
	}
	
	// multiplication  
		@Test
		public void Test6() {
			int result = calculate.mul(4, 5);
			assertEquals(20, result , " Dtaa Successfully Matched !!!");
		}
		
		
		@Test
		public void Test7() {
			int result = calculate.mul(4, 5);
			assertNotEquals(60, result , " Dtaa not  Matched successfully !!!");
		}
		

		@Test
		public void Test8() {
			int result = calculate.mul(4, 5);
			assertTrue(result != 0, " Transaction True  !!!");
		}
	
		// division  
				@Test
				public void Test9() {
					int result = calculate.div(40, 20);
					assertEquals(2, result , " Dtaa Successfully Matched !!!");
				}
				
				
				@Test
				public void Test10() {
					int result = calculate.div(40, 20);
					assertNotEquals(60, result , " Dtaa not  Matched successfully !!!");
				}
				

				@Test
				public void Test11() {
					int result = calculate.div(40, 20);
					assertTrue(result != 0, " Transaction True  !!!");
				}
				
				// 1 test case fail below one 
				@Test
				public void Test12() {
					int result = calculate.div(40, 20);
					assertTrue(result == 0, " Transaction true  !!!");
				}
			
}
