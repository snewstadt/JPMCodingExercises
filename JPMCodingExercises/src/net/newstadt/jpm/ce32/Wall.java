package net.newstadt.jpm.ce32;

public class Wall {

	private double height;
	private double width;

	// constructors
	public Wall() {
	//	this(0.0,0.0);  this line not needed - default value of double will be 0.0
	}

	public Wall(double width, double height) {
		this.width = width < 0.0 ? 0.0 : width;
		this.height = height < 0.0 ? 0.0 : height;
	}

	// methods
	public double getArea() {
		return width * height;
	}

	// getters & setters
	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public void setHeight(double height) {
		this.height = height < 0.0 ? 0.0 : height;
	}

	public void setWidth(double width) {
		this.width = width < 0.0 ? 0.0 : width;
	}

}
