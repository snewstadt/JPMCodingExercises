package net.newstadt.jpm.ce8;

public class TeenNumberChecker {

	public static void main(String[] args) {

		System.out.println(hasTeen(0,-5,15));
		
	}
	
	public static boolean isTeen(int number) {
		// return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
		
		return ((number >= 13) && (number <= 19));
	
	}
	
	public static boolean hasTeen(int number1, int number2, int number3) {
		// return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
		return (isTeen(number1) || isTeen(number2) || isTeen(number3));
	}

}
