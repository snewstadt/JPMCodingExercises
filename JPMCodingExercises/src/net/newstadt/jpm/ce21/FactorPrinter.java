package net.newstadt.jpm.ce21;

/*
Write a method named printFactors with one parameter of type int named number. 

If number is < 1, the method should print "Invalid Value".

The method should print all factors of the number. A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).

For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6 / 3 = 2.

HINT: Use a while or for loop.

NOTE: When printing numbers, each number can be in its own line. They don't have to be separated by a space.

I preferred a 'for' loop for this one since we know we need to just count up from 1 to the number parameter, 
but I also coded it with a while loop just for fun.

*/


public class FactorPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printFactorsWhileLoop(6);  // should print 1 2 3 6

		printFactorsWhileLoop(32); // should print 1 2 4 8 16 32

		printFactorsWhileLoop(148); // should print 1 2 5 10

		printFactorsWhileLoop(-1); // should print "Invalid Value" since number is < 1
		
		
	}
	
	public static void printFactors(int number) {
		if (number < 1) {
			System.out.println("Invalid Value");
		}
		
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("");
		
	}
	
	public static void printFactorsWhileLoop(int number) {
		if (number < 1) {
			System.out.println("Invalid Value");
		}
		
		int i = 0;
		while (i <= number) {
			i++;
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("");
		
	}
	
	

}
