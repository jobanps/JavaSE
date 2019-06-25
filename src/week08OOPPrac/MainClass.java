package week08OOPPrac;

import org.junit.internal.runners.statements.ExpectException;

public class MainClass {

	public static void main(String[] args) {
		
		Circle objC = new Circle(5);
		
		double expectedRadius = 5;
		double actualRadius = objC.getRadius();
		if( expectedRadius == actualRadius) {
			System.out.println("R1 working !");
		} else {
			System.out.println("R1 NOT working !");
			System.out.println("Actual Output : " + objC.getRadius());
			System.out.println("Expected Output : " + 5);
		}
		

		double expectedArea = Math.PI * 5 * 5;
		double actualArea = objC.calcArea();
		if( expectedArea == actualArea) {
			System.out.println("R2 working !");
		} else {
			System.out.println("R2 NOT working !");
			System.out.println("Actual Output : " + actualArea);
			System.out.println("Expected Output : " + expectedArea);
		}
		
		double expectedCircum = Math.PI * 2 * 5;
		double actualCircum = objC.calcCircumference();
		if( expectedCircum == actualCircum) {
			System.out.println("R3 working !");
		} else {
			System.out.println("R3 NOT working !");
			System.out.println("Actual Output : " + actualCircum);
			System.out.println("Expected Output : " + expectedCircum);
		}
		
		double expectedDiameter = 10;
		double actualDiameter = objC.calcDiameter();
		if( expectedDiameter == actualDiameter) {
			System.out.println("R4 working !");
		} else {
			System.out.println("R4 NOT working !");
			System.out.println("Actual Output : " + actualDiameter);
			System.out.println("Expected Output : " + expectedDiameter);
		}
		
	}
}
