package matrix;

/**
 * 
 * @author Philip I. Thomas
 * @version 1.0
 * CSE131 Matrix Extension
 * Date: 29 April 2012
 */
public class Matrix {

	private double[][] values;

	/**
	 * The Matrix is based on the supplied two-dimensional array of values.
	 * Be sure to make your own copy of the values, so that changes to the
	 *    array outside of this class do not affect your work.
	 * @param values
	 */
	public Matrix(double[][] in) {
	//	System.out.println("x = " + in.length + "; y = " + in[0].length);
		values = new double[in.length][in[0].length];
		for (int i=0;i<in.length; i++) {
			for (int j=0;j<in[0].length; j++) {
				this.values[i][j] = in[i][j];
		//		System.out.println(in[i][j] + " , " + i + " , " + j );

			}
		}
	}

	/**
	 * You must complete this method, or the equals(Object) test will always
	 *   return false. 
	 * Arrays one and two are considered
	 * equal if and only if:
	 *   1) They have the same shape (number of rows and columns agree)
	 *   2) The contents of the two arrays are the same, element by element
	 * @param one
	 * @param two
	 * @return true iff the arrays have the same shape and contents
	 */
	private static boolean arraysAreEqual(double[][] one, double[][] two) {
		if (one.length!=two.length) {return false;}
		if (one[0].length!=two[0].length) {return false;}
		for (int i=0;i<one.length; i++) {
			for (int j=0;j<one[0].length; j++) {
				if (one[i][j] != two[i][j]) 
					return false;
			}
		}
		return true;
	}

	/**
	 * This was generated initially by eclipse, but
	 *   eclipse does not know how to compare two-dimensional arrays.
	 *   We therefore call arraysAreEequal to do that job.
	 */
	public boolean equals(Object obj) {
		// If this and obj are the same object, they must be equal
		if (this == obj)
			return true;
		// If obj is null ("this" cannot be null), then they are not equal
		if (obj == null)
			return false;
		// If the two objects are not the same type, they are not equal
		if (getClass() != obj.getClass())
			return false;
		//
		// If we get here, we have two objects of the same type.
		// Calling your helper method to determine the arrays' equality.
		Matrix other = (Matrix) obj;
		return arraysAreEqual(this.values, other.values);
	}

	public Matrix plus(Matrix other) {
		if (this.values.length!=other.values.length||this.values[0].length!=other.values[0].length) {
			throw new IllegalArgumentException("Matrices unequal dimensions.") 
			;}
		double[][] data = new double[other.values.length][other.values[0].length];
		for (int i=0;i<this.values.length; i++) {
			for (int j=0;j<this.values[0].length; j++) {
				data[i][j] = this.values[i][j] + other.values[i][j];
			}
		}
		return new Matrix(data);
	}

	/**
	 * Returns a **new Matrix** that is the product of this and the other one.
	 * Does not chagne this Matrix at all.
	 * @param other
	 * @return
	 */
	public Matrix times(Matrix other) {
		// Set up some variables
		  int thisRows = this.values.length,
			      thisColumns = this.values[0].length,
			      otherRows = other.values.length,
			      otherColumns = other.values[0].length;
		  // Check for compatibility
		  if ( thisColumns != otherRows ) { throw new IllegalArgumentException("Dimension mismatch"); }
		  // Structure output
		  double[][] data = new double[thisRows][otherColumns];
	// Now we do the actual multiplication	
		  for(int i = 0; i < thisRows; i++) { 
		    for(int j = 0; j < otherColumns; j++) { 
		      for(int k = 0; k < thisColumns; k++) { 
		        data[i][j] += this.values[i][k] * other.values[k][j];
		      }
		    }
		  }
		  return new Matrix(data);
	}

	/**
	 * Returns a **new Matrix** that is the transpose of this one.
	 * Does not change this Matrix at all.
	 * @return
	 */
	public Matrix transpose() {
		double[][] data = new double[this.values[0].length][this.values.length];
		for (int i=0;i<this.values.length; i++) {
			for (int j=0;j<this.values[0].length; j++) {
				data[j][i] = this.values[i][j];
			}
		}
		return new Matrix(data);
		
	}

	/**
	 * Modifies this Matrix by scaling row i by the supplied factor.
	 * @param i the row to scale, where 0 is the top row
	 * @param factor the amount by which to scale each element of row i
	 */
	public void scaleRow(int i, double factor) {
		if (i>=this.values.length) {throw new IllegalArgumentException("Index exceeds matrix size."); }

		for (int j=0;j<this.values[0].length; j++) {
			this.values[i][j]=factor*this.values[i][j];
		}
		}

	/**
	 * Modifies this matrix by adding row i to row j.  Row 0 is the top row.
	 * @param i
	 * @param j
	 */
	public void addRows(int i, int j) {
		for (int x=0;x<this.values[0].length;x++) {
			this.values[j][x]+=this.values[i][x];
		}
	}

	/**
	 * My Columbus Day gift to you.  This returns a String representation of
	 * the Matrix.  The contents of each row is separated by a tab (\t)
	 * so that columns (kind of) line up.  Each row is separated by a
	 * newline (\n) so that the output looks like a matrix.  The output
	 * of this method should <i>not</i> be used to compare matrices for
	 * equality:  use the .equals(Object) method instead!
	 */
	public String toString() {
		String ans = "";
		for (int i=0; i < values.length; ++i) {
			ans = ans + "\n";
			// Loop below assumes all rows have the same number of columns
			for (int j=0; j < values[0].length; ++j) {
				ans = ans + values[i][j] + "\t";
			}
		}
		return ans;
	}

}
