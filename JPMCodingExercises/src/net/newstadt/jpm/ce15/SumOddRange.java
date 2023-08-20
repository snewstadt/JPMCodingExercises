package net.newstadt.jpm.ce15;

public class SumOddRange {

	public static void main(String[] args) {

		System.out.println(sumOdd(10,10));
		System.out.println(sumOdd(-1,100));
		System.out.println(sumOdd(100,100));
		System.out.println(sumOdd(13,13));
		System.out.println(sumOdd(1,-100));
		System.out.println(sumOdd(100,1000));




		
	}
	
	public static boolean isOdd(int number) {
		return number <= 0 ? false : number % 2 != 0;
	}
	
	public static int sumOdd(int start, int end) {
		
		if ((end < start) || (start < 0 ) || (end < 0)) {
			return -1;
		}
		
		int sum = 0;
		
		for (int i = start; i <= end; i++) {
			sum += isOdd(i) ? i : 0;
		}
		
		return sum;
		
	}

}
