package net.newstadt.jpm.ce28;

/*
Write a method called inputThenPrintSumAndAverage that does not have any parameters.

The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.

When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".

XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long.

TIP: Use Scanner to read an input from the user.

TIP: Use casting when calling the round method since it needs double as a parameter.

NOTE: Use the method Math.round to round the calculated average (double). The method round returns long.

NOTE: Be mindful of spaces in the printed message.

NOTE: Be mindful of users who may type an invalid input right away (see example above).
*/

import java.util.Scanner;

public class InputCalculator {

	public static void main(String[] args) {
		inputThenPrintSumAndAverage();

	}

	public static void inputThenPrintSumAndAverage() {
		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		int count = 0;
		long avg = 0;

		do {
			// System.out.println("Enter a number, or any character to exit: ");
			// nextEntry = scanner.nextLine();

			try {
				sum += Integer.parseInt(scanner.nextLine());
				count++;

			} catch (NumberFormatException nfe) {
				break;
			}

		} while (true);
		
		avg = Math.round((double)sum / count);
		
		System.out.println("SUM = " + sum + " AVG = " + avg);
		
	}

}
