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

public class Point3Test {
	@Test
	public void init() {
		Point3 p = new Point3(1,2,3);
		assertEquals(1.0,  p.getX(), .01);
		assertEquals(2.0, p.getY(), .01);
		assertEquals(3.0, p.getZ(), .01);

	}

	@Test
	public void arith() {
		
		Point3 a= new Point3(1,1,1);
		Vector3 b = new Vector3(3,4,5);
		Point3 newP=a.plus(b);
		
		System.out.println(a.toString());
	}

	






	@Test
	public void scale() {
		Point3 a = new Point3(1,2,3);
		Point3 b = new Point3(4,6,8);
		double dist=a.distance(b);
		double dist2=b.distance(a);
	//	compareDoubles( Math.sqrt(9+16+25),   dist);
	}

}
