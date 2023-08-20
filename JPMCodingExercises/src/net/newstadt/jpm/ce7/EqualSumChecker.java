package net.newstadt.jpm.ce7;

public class EqualSumChecker {

	public static void main(String[] args) {
		
		int value1 = 1;
		int value2 = 1;
		int value3 = 3;

		System.out.println(value1 + " + " + value2 + " = " + value3 + "? " + hasEqualSum(value1,value2,value3));
	}
	
	public static boolean  hasEqualSum(int value1, int value2, int value3) {
		return (value1 + value2 == value3);
		
		// return true if the sum of the first and second parameter is equal to the third parameter. 
		// Otherwise, return false.
	}

}
