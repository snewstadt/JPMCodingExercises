package net.newstadt.jpm.ce32;

/*
Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.

The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters width and height of type double and it needs to initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the height parameter is less than 0 it needs to set the height field value to 0.

Write the following methods (instance methods):
* Method named getWidth without any parameters, it needs to return the value of width field.
* Method named getHeight without any parameters, it needs to return the value of height field.
* Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.
* Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0 it needs to set the height field value to 0.
* Method named getArea without any parameters, it needs to return the area of the wall.


NOTE: All methods should be defined as public NOT public static.

NOTE: In total, you have to write 5 methods and 2 constructors.
*/

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
