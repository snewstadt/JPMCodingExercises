package net.newstadt.jpm.ce16;

public class NumberPalindrome {

	public static void main(String[] args) {
		
		int number = -12321;
		System.out.println("Reverse of number = " + reverseDigits(number));
		System.out.println(number + " is a palindorome? " + isPalindrome(number));
	}
	
	public static int reverseDigits(int number) {
		int reverse = 0;
		boolean isNegative = number < 0;
		
		if (isNegative) {
			number *= -1;
			//if we are dealing with a negative number, make it positive by multiplying by -1
		}
		
		while (number  > 0) {
			reverse *= 10;  
			reverse += number % 10; 
			
			// add a place value to the reverse by multiplying by 10
			// get the last digit (the 10s place) of the number using the remainder operator and add it to the reverse
			
			number /= 10; 
			
			//since the last (10s) place value has been processed, remove the place value from the original number
		}
		
		return isNegative ? reverse * -1 : reverse;  
		// if the number was originally negative, make sure the returned number is also negative by multiplying by -1, 
		// otherwise, return the reversed digits.
	}
	
	public static boolean isPalindrome (int number) {
		return number == reverseDigits(number);
		
		// returns true if the number and it's reverse are the same, otherwise returns false.
	}

	
// The Udemy code exercise solution checker required use of only one method, so that is shown below.  
// I prefer doing this using two methods - one to just reverse the number, one to check if it's a palindrome, 
// that way each method is doing only one task.
	
	
//	public static boolean isPalindrome(int number) {
//		
//		int startingNumber = number;
//		int reverse = 0;
//		boolean isNegative = number < 0;
//		
//		if (isNegative) {
//			number *= -1;
//		}
//		
//		while (number  > 0) {
//			reverse *= 10;
//			reverse += number % 10;
//			
//			number /= 10; 
//		}
//		
//		if (isNegative) {
//			reverse *= -1;
//		}
//		
//		return startingNumber == reverse;
//		
//		
//	}
}
