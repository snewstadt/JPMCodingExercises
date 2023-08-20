package net.newstadt.jpm.ce2;

public class SpeedConverter {

	public static void main(String[] args) {
		double kph = 95.235;
		printConversion(kph);

	}
	
	/*
	 * public static long toMilesPerHour(double kilometersPerHour) { long
	 * milesPerHour = -1L;
	 * 
	 * if (kilometersPerHour >= 0) { milesPerHour = Math.round((kilometersPerHour /
	 * 1.609)); }
	 * 
	 * return milesPerHour; }
	 */
	
	/*
	 * public static void printConversion(double kilometersPerHour) { long mph =
	 * toMilesPerHour(kilometersPerHour);
	 * 
	 * if (mph == -1) { System.out.println("Invalid Value"); } else {
	 * System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h"); } }
	 */
	
	public static long toMilesPerHour(double kilometersPerHour) {
		return (kilometersPerHour >= 0) ? Math.round((kilometersPerHour / 1.609)) : -1L;
		
	}
	
	public static void printConversion(double kilometersPerHour) {
		System.out.println((kilometersPerHour < 0) ? "Invalid Value" : 
			kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
			
	}
	
	

}
