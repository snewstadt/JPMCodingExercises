package net.newstadt.jpm.ce14;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		
		System.out.println(getDaysInMonth(1,2020));
		System.out.println(getDaysInMonth(2,2020));
		System.out.println(getDaysInMonth(2,2018));
		System.out.println(getDaysInMonth(-1,2018));
		System.out.println(getDaysInMonth(2,-2020));

		System.out.println();
		System.out.println();
		System.out.println(getDaysInMonthEnhanced(2,2020));
		System.out.println(getDaysInMonthEnhanced(2,2018));
	}
	
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
	
	public static int getDaysInMonth(int month, int year) {
		
		int daysInMonth = -1;
		
		if (month < 1 || month > 12 || year < 1 || year > 9999) { 
			return daysInMonth;
			};
		
		switch (month) {
		case 9: case 4: case 6: case 11: 
			daysInMonth = 30; 
			break;
		case 2:
			daysInMonth = (isLeapYear(year)) ? 29 : 28;
			break;
		default:
			daysInMonth = 31;
			break;
		}
			
	//	case 1: case 3: case 5: case 7: case 8: case 10: case 12: - don't think we need this - all the rest have 31 :)
		
		
		return daysInMonth;
	}
	
	public static int getDaysInMonthEnhanced(int month, int year) {
		
		int daysInMonth = (month < 1 || month > 12 || year < 1 || year > 9999) ? -1 : 31;
		// month must be 1-12, year must be between 1-9999
		
		daysInMonth = switch (month) {
			case 9, 4, 6, 11 -> 30;
			case 2 -> (isLeapYear(year)) ? 29 : 28;
			default -> 31;
			};	
		
		return daysInMonth;
	}

}
