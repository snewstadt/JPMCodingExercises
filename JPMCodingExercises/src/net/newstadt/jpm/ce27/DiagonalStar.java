package net.newstadt.jpm.ce27;

import java.util.Scanner;

/*
Write a method named printSquareStar with one parameter of type int named number. 

If number is < 5, the method should print "Invalid Value".

The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).

The patterns consist of a number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four conditions (Read them carefully):

* In the first or last row

* In the first or last column

* When the row number equals the column number

* When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)


HINT: Use a nested loop (a loop inside of a loop).
*/


public class DiagonalStar {

	public static void main(String[] args) {
		printSquareStar(10);
		printSquareStar(Integer.parseInt(getUserInput("How big would you like your star? ")));
		
	}
	
	public static void printSquareStar(int number) {
		if (number < 5) {
			System.out.println("Invalid Value");
			return;
		}
		
		
		for (int currentRow = 1; currentRow <= number; currentRow++) {
			
			for (int currentColumn =1; currentColumn <= number; currentColumn++) {
				if ((currentRow == 1) || (currentRow == number) || (currentColumn == 1) || (currentColumn == number) ||
						(currentRow == currentColumn) || (currentColumn == number - currentRow + 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			} 
			System.out.println();
		}
			
	}
	
	public static String getUserInput(String message) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(message);
		return scanner.nextLine();
	}

}
