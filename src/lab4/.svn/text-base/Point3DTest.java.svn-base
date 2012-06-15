package lab4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Point3DTest {

	@Test
	public void init() {
		Point3D p = new Point3D(5, -3, 0);
		assertEquals(5.0,  p.getX(), .01);
		assertEquals(-3.0, p.getY(), .01);
		assertEquals(0, p.getZ(), .01);
	}
	
	
	@Test
	public void arith() {
		Point3D p = new Point3D(5, -3, 0.0);
		Vector3D v = new Vector3D(5, -3, 0);
		Point3D pPlusV = p.plus(v);
		
		Point3D p2 = new Point3D(0,0,0);
		Vector3D pMinusP2 = p.minus(p2);
		
		double dist = p.distance(p2);
		//
		// Make sure the old vector did not change
		//
		comparePoints(new Point3D(5, -3, 0), p);
		//
		// Make sure the new vector is right
		//
		comparePoints(new Point3D(10, -6, 0), pPlusV);
		compareDoubles(10, pPlusV.getX());
		compareDoubles(-6, pPlusV.getY());
		compareDoubles(0, pPlusV.getZ());
		
		compareVectors(new Vector3D(5, -3, 0), pMinusP2);
		//
		// Test toString visually
		System.out.println("TA check p:      " + p);
		System.out.println("TA check pplusV: " + pPlusV);
		
		//
		compareDoubles(Math.sqrt((p.getX()-p2.getX())*(p.getX()-p2.getX())+(p.getY()-p2.getY())*(p.getY()-p2.getY())+(p.getZ()-p2.getZ())*(p.getZ()-p2.getZ())), p.distance(p2));
		
	}

	/**
	 * Compare two Vectors JUnit-style, failing if they do not
	 * agree on their x and y deltas.
	 * @param one
	 * @param two
	 */
	public void comparePoints(Point3D one, Point3D two) {
		compareDoubles(one.getX(), two.getX());
		compareDoubles(one.getY(), two.getY());
		compareDoubles(one.getZ(), two.getZ());
	}


	/**
	 * Why did I write this method?
	 * @param one    one of two doubles to compare
	 * @param other  other of two doubles to compare
	 */
	public void compareDoubles(double one, double other) {
		assertEquals(one, other, 0.01);
	}
	
	public void compareVectors(Vector3D one, Vector3D two) {
		compareDoubles(one.getDeltaX(), two.getDeltaX());
		compareDoubles(one.getDeltaY(), two.getDeltaY());
		compareDoubles(one.getDeltaZ(), two.getDeltaZ());
	}

}
