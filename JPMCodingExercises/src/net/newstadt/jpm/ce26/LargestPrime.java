package net.newstadt.jpm.ce26;

/*
Write a method named getLargestPrime with one parameter of type int named number. 

If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.


The method should calculate the largest prime factor of a given number and return it.

HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.
*/

public class LargestPrime {

	public static void main(String[] args) {

		System.out.println(getLargestPrime2(21)); // should return 7 since 7 is the largest prime (3 * 7 = 21)

		System.out.println(getLargestPrime2(217)); // should return 31 since 31 is the largest prime (7 * 31 = 217)

		System.out.println(getLargestPrime2(0)); // should return -1 since 0 does not have any prime numbers

		System.out.println(getLargestPrime2(45)); // should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)

		System.out.println(getLargestPrime2(-1)); // should return -1 since the parameter is negative

		System.out.println(getLargestPrime2(16)); // should return 2

		System.out.println(getLargestPrime2(12)); // should return 3

	}

	public static int getLargestPrime(int number) {
		if (number < 2) {
			return -1;
		}

		for (int i = number; i >= 2; i--) {
			if (number % i == 0) {
				// This is a factor, now we need to check if it's prime

				int countNonPrime = 0;
				for (int divisor = 2; divisor <= (i / 2); divisor++) {
					if (i % divisor == 0) {
						countNonPrime++;
						break;
						// this is not prime if it is evenly divisible so stop further processing
					}

				}

				if (countNonPrime == 0) {
					return i;
				} // end inner for loop

			} // end if statement

		} // end outer for loop
		return -1;
	}

	public static boolean isPrime(int wholeNumber) {

		if (wholeNumber <= 2) {
			return wholeNumber == 2;
		}

		for (int divisor = 2; divisor <= (wholeNumber / 2); divisor++) {
			if (wholeNumber % divisor == 0) {
				return false;
			}
		}

		return true;

	}
	
	public static int getLargestPrime2(int number) {
		if (number < 2) {
			return -1;
		}

		for (int i = number; i >= 2; i--) {
			if ((number % i == 0) && (isPrime(i))) {
				return i;
				}
			}
		return -1;
	}
}
