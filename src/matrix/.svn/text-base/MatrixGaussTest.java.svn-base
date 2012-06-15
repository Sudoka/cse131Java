package matrix;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * This junit test test the gauss elimination algorithm
 * @author cytron
 *
 */
public class MatrixGaussTest {

	double[][] values = new double[][] { 
			{ 1, 2, 3},
			{ 4, 5, 6}
	};

	Matrix m1 = new Matrix(
			values
	);

	
	Matrix m2 = new Matrix(
			new double[][] { 
					{ 2, 4, 6},
					{ 8, 10, 12}
			}
	);
	// This reduced matrix of the above two was checked using Matlab
	Matrix reduced = new Matrix(
			new double[][] { 
					{},
					{ }
			}
	);
	


	@Test
	public void init() {
		assertEquals(m1, m1);
		assertEquals(m1too, m1too);
		assertEquals("Implement arraysAreEqual", m1, m1too);
		assertEquals(m1too, m1);

		double save = values[1][1];
		values[1][1] = 0; // Matrix should have copied this array, so this assignment should have no effect

		assertEquals("Matrix constructor failed to copy the array", m1, m1too);

		assertFalse(m1.equals(m1Plusm1));
		assertFalse(m1Plusm1.equals(m1too));
		values[1][1] = save;
	}

	@Test
	public void testarith() {
		Matrix sum = m1.plus(m1too);
		assertEquals(sum, m1Plusm1);   // sum = m1 + m1too;
		assertEquals(m1, m1too);       // m1 and m1too should be unchanged
		assertEquals(prod, m1.times(m1.transpose()));
	}

	@Test
	public void testScale() {
		Matrix m1copy = new Matrix(values);
		m1copy.scaleRow(0, 2);
		m1copy.scaleRow(1, 2);
		assertEquals(m1copy, m1Plusm1);
	}

	@Test
	public void testAddRow() {
		Matrix m1copy = new Matrix(values);
		m1copy.addRows(0, 1);
		assertEquals(m1copy, addedRow);
	}

	/*
	 * The following tries to add a 2x3 matrix to its transpose,
	 * which should throw an error.  The test case expects the error.
	 */
	@Test (expected=IllegalArgumentException.class)
	public void badPlus() {
		m1.plus(m1.transpose());
	}

	/**
	 * The following multiplies a 2x3 matrix by itself, which should
	 * throw an error.  Remember:  the number of columns of the first matrix
	 * should equal the number of rows in the second matrix.
	 */
	@Test (expected=IllegalArgumentException.class)
	public void badTimes() {
		m1.times(m1);
	}

	/**
	 * Trying to scale a row that is out-of-bounds, which should throw
	 * an error.
	 */
	@Test (expected=IllegalArgumentException.class)
	public void badScale() {
		m1.scaleRow(values.length, 1.0);
	}

	@Test
	public void transpose() {
		Matrix trans = m1.transpose();
		assertFalse(m1.equals(trans));
		assertEquals(m1, m1.transpose().transpose());
	}

	@Test
	public void print() {
		System.out.println("m1: " + m1);
		System.out.println("m1 transpose " + m1.transpose());
		System.out.println("m1 x m1.transpose() " + m1.times(m1.transpose()));
	}

}
