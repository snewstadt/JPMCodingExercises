package net.newstadt.jpm.ce6;

import java.math.BigDecimal;

public class DecimalComparator {

	public static void main(String[] args) {
		double num1 = 2.001;
		double num2 = 2.002;
		
		System.out.println( ((int)(num1*1000.00)) );
		System.out.println( (num2*1000.00) );
		System.out.println( ((int) (num1 * 1000)) - ((int) (num2 * 1000)) );
		
		System.out.println(areEqualByThreeDecimalPlaces(num1,num2));
		

	}
	
	/*
	 * Write a method areEqualByThreeDecimalPlaces with two parameters of type
	 * double.
	 * 
	 * The method should return boolean and it needs to return true if two double
	 * numbers are the same up to three decimal places. Otherwise, return false.
	 */
	
// 	public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
// 	    if (num2 == 0D) {
// 	        return (num1 == 0D);
// 	    } else {
//		return  ((int)(num1 * 1000)) % ((int)(num2 * 1000)) == 0 && ((int)(num1 * 1000)) / ((int)(num2 * 1000)) == 1;
//	    }
// 	}
// method above works but there's a simpler way to do this.  duh.  math is hard (facepalm).
	
 	public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
	   return  ((int)(num1) * 1000) == ((int)(num2) * 1000);
	   
	}
	
	
}
