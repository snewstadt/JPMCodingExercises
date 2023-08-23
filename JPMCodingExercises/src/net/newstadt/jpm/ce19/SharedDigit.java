package net.newstadt.jpm.ce19;

/*
 * Write a method named hasSharedDigit with two parameters of type int. 

 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). 
 * If one of the numbers is not within the range, the method should return false.

 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; 
 * otherwise, the method should return false.
 * 
 * I solved this with looping, since this exercise came immediately after looping lessons.
 * 
 * Since we know both numbers will only be two digits, the digits can be compared without looping as some other students did - 
 * that code included in the 'NoLoop' version of the method, with my addition of checking for equality first.
 * 
*/


public class SharedDigit {

	public static void main(String[] args) {
		System.out.println(hasSharedDigit(12,23));
		System.out.println(hasSharedDigit(9,99));
		System.out.println(hasSharedDigit(15,55));
		System.out.println("");
		System.out.println(hasSharedDigitNoLoop(23,46));
		System.out.println(hasSharedDigitNoLoop(11,20));
		System.out.println(hasSharedDigitNoLoop(5,5));
		System.out.println(hasSharedDigitNoLoop(15,15));
		System.out.println(hasSharedDigitNoLoop(12,23));
	}
	
	public static boolean hasSharedDigit(int number1, int number2) {
		
		// per requirements, both numbers must be between 10 and 99
		// if the numbers are equal, no need to compare individual digits
		
		if ((number1 < 10) || (number1 > 99) || (number2 < 10) || (number2 > 99)) {
			return false;		
		} else if (number1 == number2) {
			return true;   
		}
		
		
		while (number1 > 0) {
			int digit = number1 > 9 ? number1 % 10 : number1;	
			// get last digit of number1 - use number itself if there is only one digit because it is less than 10
			
			int tempValue2 = number2;		
			// set tempValue2 so inner while loop can run again without losing the original value of number2
			
			while (tempValue2 > 0 ) {
				int digit2 = tempValue2 > 9 ? tempValue2 % 10 : tempValue2;
				// get last digit of tempValue2 - use number itself if there is only one digit because it is less than 1
				
				if (digit == digit2) {  //compare last digit of number1 with last digit of tempValue2
					return true;
				}
				tempValue2 /= 10;		// remove a place value from tempValue2
				
			}  // end inner while loop
			
			number1 /= 10;			// remove a place value of number1
							
		}		//end outer while loop
		
		return false;  //number1 = 0 and no matches were found, so return false
	}
	
	public static boolean hasSharedDigitNoLoop(int number1, int number2) {
		
		// per requirements, both numbers must be between 10 and 99
		// if the numbers are equal, no need to compare individual digits
		
		if ((number1 < 10) || (number1 > 99) || (number2 < 10) || (number2 > 99)) {
			return false;		
		} else if (number1 == number2) {
			return true;   
		} else {
			
			int num1RightSide = number1 % 10, num2RightSide = number2 % 10;
			int num1LeftSide = number1 / 10, num2LeftSide = number2 / 10;
			
			return ((num1RightSide == num2RightSide) || (num1RightSide == num2LeftSide) || (num1LeftSide == num2RightSide) || (num1LeftSide == num2LeftSide));
		}	
			
					
	}

}
