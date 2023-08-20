package net.newstadt.jpm.ce3;

public class MegaBytesConverter {

	public static void main(String[] args) {
		int kb = 2500;
		printMegaBytesAndKiloBytes(kb);
		

	}
	
	public static void printMegaBytesAndKiloBytes (int kiloBytes) {
	/*
	 * print a message in the format "XX KB = YY MB and ZZ KB". if KB is < 0, print
	 * Invalid Value TIP: Use the remainder operator
	 * 
	 * TIP: 1 MB = 1024 KB Do not set the kilobytes value inside the method.
	 */

//	System.out.println( (kiloBytes < 0) ? "Invalid Value" :
//		kiloBytes + " KB = " + (kiloBytes / 1024) + " MB and " + (kiloBytes % 1024) + " KB");
		
//	first code above - another attempt below so as not to be doing calculations within the println statement
//	Probably would also be a good idea to use a static variable for the conversion factor of 1024

	
	int megaBytes = kiloBytes / 1024;
	int remainingKiloBytes = kiloBytes % 1024;
	
	String message = (kiloBytes < 0) ? "Invalid Value" : 
		kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB";
	
	System.out.println(message);

		
	}
}
