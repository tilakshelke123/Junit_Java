package com.add;

public class Factorial {

	public static long fact (int Num) {
		long fact=1;
		 for (int i=2 ;i<=Num;i++) {
			 fact= fact*i;
		 }
		return  fact;
		
	}
}
