package week08OOPPrac;

public class Circle {

	//class properties
	// ------------------------------
	private double radius;
	
	// class constructor
	// ------------------------------
	public Circle(int _radius) {
		this.radius = _radius;
	}
	
	//class functions
	// ------------------------------
	public double calcArea() {
		double area =  Math.PI * this.radius * this.radius;
		//System.out.println("Circle's Area : " + area);
		return area;
	}

	public double calcCircumference() {
		double circumference =  2 * Math.PI * this.radius;
		//System.out.println("Circle's circumference : " + circumference);
		return circumference;
	}
	
	public double calcDiameter() {
		double diameter =  2 * this.radius;
		//System.out.println("Circle's Diameter : " + diameter);
		return diameter;
	}
	
	// Getters and Setters
	// ------------------------------
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	
}
