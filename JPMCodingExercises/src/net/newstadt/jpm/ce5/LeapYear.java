package net.newstadt.jpm.ce5;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2172;
		System.out.println("Year " + year + " is leap year? " + isLeapYear(year));

	}

	/*
	 * Write a method isLeapYear with a parameter of type int named year.
	 * 
	 * The parameter needs to be greater than or equal to 1 and less than or equal
	 * to 9999.
	 * 
	 * If the parameter is not in that range return false.
	 * 
	 * Otherwise, if it is in the valid range, calculate if the year is a leap year
	 * and return true if it is a leap year, otherwise return false.
	 * 
	 * To determine whether a year is a leap year, follow these steps: 1. If the
	 * year is evenly divisible by 4, go to step 2. Otherwise, go to step 5. 2. If
	 * the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
	 * 3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to
	 * step 5. 4. The year is a leap year (it has 366 days). The method isLeapYear
	 * needs to return true. 5. The year is not a leap year (it has 365 days). The
	 * method isLeapYear needs to return false.
	 * 
	 */

	/*
	 * public static boolean isLeapYear(int year) { if (year % 4 != 0 || year < 1 ||
	 * year > 9999) { return false; } else if (year % 100 != 0) { return true; }
	 * else if (year % 400 == 0) { return true; } else { return false; }
	 * 
	 * 
	 * }
	 */

	/*
	 * public static boolean isLeapYear(int year) { if (year % 4 != 0 || year < 1 ||
	 * year > 9999) { return false; } else if (year % 100 == 0) { return (year % 400
	 * == 0); } else { return true; }
	 * 
	 * 
	 * }
	 */

	public static boolean isLeapYear(int year) {
		if (year % 4 != 0 || year < 1 || year > 9999) {
			return false;
			  // if year is not divisible by 4 OR the year is outside of the range 1-9999, this is not a leap year
		} else {
			return (year % 100 == 0) ? (year % 400 == 0) : true;
	          // if year is divisible by 100, then return true/false result of if the year is 
	          // divisible by 400.  It is a leap year if divisible by 400, but is not a leap year if 
	          // not divisible by 400.  Otherwise (year not divisible by 100), this is leap year	
		}

	}
	 

}
