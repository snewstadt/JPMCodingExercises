package net.newstadt.jpm.ce20;

/*
Write a method named hasSameLastDigit with three parameters of type int. 

Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.

The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.


Write another method named isValid with one parameter of type int.

The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.
*/


public class LastDigitChecker {

	public static void main(String[] args) {
		System.out.println(hasSameLastDigit (41, 22, 71)); //  should return true since 1 is the rightmost digit in numbers 41 and 71

		System.out.println(hasSameLastDigit (23, 32, 42)); // should return true since 2 is the rightmost digit in numbers 32 and 42

		System.out.println(hasSameLastDigit (9, 99, 999)); // should return false since 9 is not within the range of 10-1000

	}
	
	public static boolean isValid(int number) {
		return ((number >= 10) && (number <= 1000));
	}
	
	public static boolean hasSameLastDigit(int number1, int number2, int number3) {
		if (!(isValid(number1)) || !(isValid(number2)) || !(isValid(number3))) {
			return false;
		}
		
		int lastDigit1 = number1 % 10, lastDigit2 = number2 % 10, lastDigit3 = number3 % 10;
		
		return ((lastDigit1 == lastDigit2) || (lastDigit2 == lastDigit3) || (lastDigit1 == lastDigit3));
		
		
	}

}
