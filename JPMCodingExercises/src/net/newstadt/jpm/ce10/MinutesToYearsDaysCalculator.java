package net.newstadt.jpm.ce10;

public class MinutesToYearsDaysCalculator {

	public static void main(String[] args) {
		
		printYearsAndDays(-1440);

	}

	public static void printYearsAndDays(long minutes) {
		
		if (minutes < 0) {
			System.out.println("Invalid Value");
		} else {
			long years = minutes / 525600;  			// 60 min in an hour * 24 hours in a day * 365 days in a year = 525600
			long days = (minutes % 525600) / 1440;  	// 60 min in an hour * 24 hours in a day = 1440
			System.out.println(minutes + " min = " + years + " y and " + days + " d");
		}
		
		
		
	}
}
