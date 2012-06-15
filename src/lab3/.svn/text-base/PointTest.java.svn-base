package lab3;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Name: Philip I. Thomas
 * Lab Section: A
 * Date:2/13/12
 * PointTest.java
 * CSE 131 Lab 3
 */

public class PointTest {
	@Test
	public void init() {
		Point p = new Point(5,2);
		assertEquals(5.0,  p.getX(), .01);
		assertEquals(2.0, p.getY(), .01);
	}

	@Test
	public void arith() {
		
		Point a= new Point(1,1);
		Vector b = new Vector(3,4);
		Point newP=a.plus(b);
		
		//
		// Make sure the old vector did not change
		//
		compareVectors(new Vector(3,4), b);
		//
		// Make sure the new point is right
		//
		compareDoubles(4, newP.getX());
		compareDoubles(5, newP.getY());
		//
		// Test toString visually
		System.out.println(a.toString());
	}

	/**
	 * Check distance method
	 */
	public void compareVectors(Vector one, Vector two) {
		compareDoubles(one.getDeltaX(), two.getDeltaX());
		compareDoubles(one.getDeltaY(), two.getDeltaY());
	}


	/**
	 * Why did I write this method?
	 * @param one    one of two doubles to compare
	 * @param other  other of two doubles to compare
	 */
	public void compareDoubles(double one, double other) {
		assertEquals(one, other, 0.01);
	}



	@Test
	public void scale() {
		Point a = new Point(1,2);
		Point b = new Point (4,6);
		double dist=a.distance(b);
		double dist2=b.distance(a);
		compareDoubles( 5,   dist);
		compareDoubles( 5, dist2);
	}

	/**
	 * Why did I write this method?
	 * @param v a vector
	 * @return v's x component
	 */
	public double gx(Vector v) {
		return v.getDeltaX();
	}

	/**
	 * Why did I write this method?
	 * @param v a vector
	 * @return v's y component
	 */
	public double gy(Vector v) {
		return v.getDeltaY();
	}
	@Test
	public void subtract() {
		Point a = new Point(1,2);
		Point b = new Point (4,6);
		Vector v=a.minus(b);
		Vector v2=b.minus(a);
		compareDoubles( -3,   v.getDeltaX());
		compareDoubles(3,v2.getDeltaX());
		compareDoubles( -4, v.getDeltaY());
		compareDoubles(4,v2.getDeltaY());
		
	}
}
