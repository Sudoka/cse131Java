package lab5;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Name: Philip I. Thomas
 * Lab Section: A
 * Date:2/27/12
 * Email: mail@philipithomas.com
 * RecursionTest.java
 * CSE 131 Lab 5
 */

public class RecursionTest {

	// Example:
	@Test
	public void testFactorial() {
		assertEquals(1, Recursion.factorial(0));
		assertEquals(24, Recursion.factorial(4));
	}

	// Your test methods go here.
	@Test
	public void testAddition() {
		assertEquals(1, 1+0);
		assertEquals(131, 2*60 + 11);
	}

	@Test
	public void testSumDownBy2() {

		assertEquals(Recursion.sumDownBy2(7),7+5+3+1);
		assertEquals(Recursion.sumDownBy2(8),8+6+4+2);
		assertEquals(Recursion.sumDownBy2(0),0);
		assertEquals(Recursion.sumDownBy2(-1),0);
	}
	@Test
	public void testHarmonic() {
		assertEquals(Recursion.harmonicSum(3),(double) 1.0+1/2+1/3, .01);
		assertEquals(Recursion.harmonicSum(1),1,.01);
	}

	@Test
	public void testGeometricSum() {
		assertEquals(Recursion.geometricSum(1),1.0+.5,.01);
		assertEquals(Recursion.geometricSum(2),1.75,.01);


	}

	@Test
	public void testMult() {
		assertEquals(Recursion.mult(3,2),3*2,.01);
		assertEquals(Recursion.mult(0,2),0*2,.01);
		assertEquals(Recursion.mult(2,0),0,.01);
		assertEquals(Recursion.mult(-2,2),-4,.01);

		assertEquals(Recursion.mult(-4,-4),16,.01);
		assertEquals(Recursion.mult(3,-3),-9,.01);
	}

	@Test
	public void testExp() {
		assertEquals(Recursion.expt(3,2),9);
		assertEquals(Recursion.expt(5,0),1);
		assertEquals(Recursion.expt(2,5),32);

	}

	@Test
	public void testLcm() {
		assertEquals(Recursion.lcm(3,5),15);
		assertEquals(Recursion.lcm(6,8),24);

	}

	@Test
	public void testLoanLength() {
		assertEquals(Recursion.loanLength(1000,.1,250),4);
		assertEquals(Recursion.loanLength(1000,.1,1050),1);
		assertEquals(Recursion.loanLength(0,.9,50),0);


	}

}

