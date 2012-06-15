package lab4;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class PointTest{
	@Test
	public void init() {
		Point p = new Point(5, -3);
		assertEquals(5.0,  p.getX(), .01);
		assertEquals(-3.0, p.getY(), .01);
	}
	
	
	@Test
	public void arith() {
		Point p = new Point(5, -3);
		Vector v = new Vector(5, -3);
		Point pPlusV = p.plus(v);
		
		Point p2 = new Point(0,0);
		Vector pMinusP2 = p.minus(p2);
		
		double dist = p.distance(p2);
		//
		// Make sure the old vector did not change
		//
		comparePoints(new Point(5, -3), p);
		//
		// Make sure the new vector is right
		//
		comparePoints(new Point(10, -6), pPlusV);
		compareDoubles(10, pPlusV.getX());
		compareDoubles(-6, pPlusV.getY());
		
		compareVectors(new Vector(5, -3), pMinusP2);
		//
		// Test toString visually
		System.out.println("TA check p:      " + p);
		System.out.println("TA check pplusV: " + pPlusV);
		
		compareDoubles(Math.sqrt((p.getX()-p2.getX())*(p.getX()-p2.getX())+(p.getY()-p2.getY())*(p.getY()-p2.getY())), p.distance(p2));
		
	}

	/**
	 * Compare two Vectors JUnit-style, failing if they do not
	 * agree on their x and y deltas.
	 * @param one
	 * @param two
	 */
	public void comparePoints(Point one, Point two) {
		compareDoubles(one.getX(), two.getX());
		compareDoubles(one.getY(), two.getY());
	}


	/**
	 * Why did I write this method?
	 * @param one    one of two doubles to compare
	 * @param other  other of two doubles to compare
	 */
	public void compareDoubles(double one, double other) {
		assertEquals(one, other, 0.01);
	}
	
	public void compareVectors(Vector one, Vector two) {
		compareDoubles(one.getDeltaX(), two.getDeltaX());
		compareDoubles(one.getDeltaY(), two.getDeltaY());
	}


}
