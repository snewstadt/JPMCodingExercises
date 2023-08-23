package net.newstadt.jpm.ce17;

public class FirstLastDigitSum {

	public static void main(String[] args) {
		
		System.out.println(sumFirstAndLastDigit(21));
		System.out.println(sumFirstAndLastDigit(252));
		System.out.println(sumFirstAndLastDigit(257));
		System.out.println(sumFirstAndLastDigit(0));
		System.out.println(sumFirstAndLastDigit(5)); // this should equal 10, using 5 as both the first and last digit
		System.out.println(sumFirstAndLastDigit(-10));


	}
	
	public static int sumFirstAndLastDigit(int number) {
		if (number < 0) {
			return -1;
		}
				
		int sum = 0;
		sum += number % 10;  // get the last digit with the remainder operator
		
		while (number > 9) {
			number /= 10;  // keep dividing the number by 10 until it is only one digit (ie less than 10) - this is the first digit
		}
		
		sum += number;  //add the first digit to the sum
			
		return sum;  // could also make this slightly more concise, remove the line above, and use:  return sum += number;
	}

}
