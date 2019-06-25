package week08OOPPrac;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleJunit {

	@Test
	public void testConstructor() {
		Circle c = new Circle(5);
		assertEquals(5, c.getRadius(),0);
	}

	@Test
	public void testArea() {
		Circle c = new Circle(5);
		assertEquals(78.5, c.calcArea(),0.1);
		
	}

	@Test
	public void testCircum() {
		Circle c = new Circle(5);
		assertEquals(31.4, c.calcCircumference(),0.1);
	}

	@Test
	public void testDiameter() {
		Circle c = new Circle(5);
		assertEquals(10, c.calcDiameter(),0);
	}

}
