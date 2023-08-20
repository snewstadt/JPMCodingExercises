package net.newstadt.jpm.ce9;

public class AreaCalculator {

	public static void main(String[] args) {
		System.out.println(area(5.0));
		System.out.println(area(-1));
		System.out.println(area(5.0, 4.0));
		System.out.println(area(-1.0, 4.0));

	}
	
	public static double area(double radius) { // calculates area of a circle
		return radius < 0 ? -1.0 : radius * radius * Math.PI;
	}
	
	public static double area(double x, double y) {   // calculate the area of a rectangle
		return (x < 0 || y < 0) ? -1.0 : x * y;
	}
	

}
