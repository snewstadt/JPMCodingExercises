package net.newstadt.jpm.ce35;

public class ComplexNumber {

	private double real;
	private double imaginary;

	// constructor
	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	// methods
	public void add(double real, double imaginary) {
		this.real += real;
		this.imaginary += imaginary;
	}

	public void add(ComplexNumber complexNumber) {
		add(complexNumber.getReal(), complexNumber.getImaginary());
	}

	public void subtract(double real, double imaginary) {
		this.real -= real;
		this.imaginary -= imaginary;
	}

	public void subtract(ComplexNumber complextNumber) {
		subtract(complextNumber.getReal(), complextNumber.getImaginary());
	}

	// getters
	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}

}
