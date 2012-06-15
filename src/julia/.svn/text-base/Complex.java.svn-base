package julia;

/**
 * Complex number, an immutable class
 * @author cytron
 *
 */
public class Complex {
	public double real;
	public double imaginary;

	/**
	 * A complex number
	 * @param real part
	 * @param imaginary part
	 */
	public Complex(double real, double imaginary) {
		this.real=real;
		this.imaginary=imaginary;

	}

	public double getReal() {
		return this.real; // FIXME
	}

	public double getImaginary() {
		return this.imaginary; // FIXME
	}
	
	/**
	 * Return a new Complex number that is the sum of this
	 *   and the other one
	 * @param other
	 * @return sum of this and the other Complex numbers
	 */
	public Complex plus (Complex other) {
		return new Complex(this.real+other.real, this.imaginary+other.imaginary); 
	}

	/**
	 * Return the difference of this and the other Complex numbers
	 * @param other
	 * @return this - other
	 */
	public Complex minus(Complex other) {
		return new Complex(this.real-other.real, this.imaginary-other.imaginary); 
	}
	
	/**
	 * Return a new Complex number that is the product of this
	 *   and the other number.
	 * @param other
	 * @return this * other
	 */
	public Complex times(Complex other) {
		return new Complex(this.real*other.real-this.imaginary*other.imaginary, this.real*other.imaginary+this.imaginary*other.real); 
	}
	
	/**
	 * Return the distance between (0,0) and this Complex number
	 * @return distance from (0,0)
	 */
	public double abs() { 
		return Math.sqrt(this.real*this.real+this.imaginary*this.imaginary);
	}
	
	public String toString() {
		return "("+ getReal() + " + " + getImaginary() + "i)";
	}
}
