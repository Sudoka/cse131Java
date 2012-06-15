package lab6;

import java.util.Iterator;
import java.util.LinkedList;


//TA CN 3/3
public class Polynomial {

	final private LinkedList<Double> list;

	/**
	 * Constructs a Polynomial with no terms yet.
	 */
	public Polynomial() {
		list = new LinkedList<Double>();
		list.clear();
	}
	/**
	 * Displays a string of the polynomial in human-readable form. 
	 */
	public String toString() {
		int i;
		String polynomial = "";
		for (i=0; i < list.size(); i++) {
			if (list.get(i)!=0) {
				polynomial = polynomial + " + " + list.get(i).toString() + "*x^(" + i + ")";
			}
		}
		return "A polynomial:" + polynomial; // FIXME

	}
	/**
	 * Adds a new term of the next highest power, with the 
	 * specified coefficient
	 * @param coeff
	 * @return
	 */
	public Polynomial addTerm(double coeff) {
		list.add(coeff);
		return this;
	}

	/**
	 * Returns the function evaluated at point x
	 * @param x
	 * @return
	 */
	public double evaluate(double x) {
		if(list.size() == 0){
			return 0;
		}
		// We implement a helper function to evaluate the function
		return evaluate(x,0);

	}

	/** 
	 * Helper function to the one-input evaluate function. 
	 * Utilizes Horner's method to evaluate a function.
	 * @param x
	 * @param power
	 * @return
	 */
	private double evaluate(double x, int power) {
		// This serves as the helper function to evaluate with one input. 
		if (power==(list.size()-1)) {
			return list.get(power);
		}
		else {
			return list.get(power)+ x * evaluate(x,++power); // power++ gave an error - likely because ++ was designed for iteration, not recursion
		}

	}



	/**
	 * This method does return a new Polynomial that is the
	 *    derivative of the current one.
	 * @return a new Polynomial that is the derivative of this one
	 */
	public Polynomial derivative() {
		Polynomial result = new Polynomial();
		int i;
		for (i=1; i < (list.size()); i++) {
			result=result.addTerm(i*list.get(i));
		}
		return result;
	}

	/**
	 * Compute the sum of this and the other Polynomial, returning
	 *    a new Polynomial that represents that sum.
	 * @return a new Polynomial that is the some of this and another
	 */
	public Polynomial sum(Polynomial another) {
		Polynomial sum = new Polynomial();
		int max=Math.max(another.list.size(), list.size()); // What is max power between the polynomials?
		int i;
		double thisVal; // define thisVal and anotherVal to prevent out of bounds errors for polynomials of different sizes
		double anotherVal;
		for (i=0; i < max; i++) {
			if (i>(another.list.size()-1)) {anotherVal=0;} else {anotherVal=another.list.get(i);}	//TA ok for style, but it's easier for us to read if these are on seperate lines  
			if (i>(list.size())-1) {thisVal=0;} else {thisVal=list.get(i);}							//TA if and else should be on seperate lines: 	if() ...;
																									//												else ...;
			
			sum.addTerm(thisVal+anotherVal);
					
		}

		return sum; 
		
	}

	/**
	 * This is the "equals" method that is called by
	 *    assertEquals(...) from your JUnit test code.
	 *    It must be prepared to compare this Polynomial
	 *    with any other kind of Object (obj).  Eclipse
	 *    automatically generated the code for this method,
	 *    after I told it to use the contained list as the basis
	 *    of equality testing.  I have annotated the code to show
	 *    what is going on.
	 */

	public boolean equals(Object obj) {
		// If the two objects are exactly the same object,
		//    we are required to return true.  The == operator
		//    tests whether they are exactly the same object.
		if (this == obj)
			return true;
		// "this" object cannot be null (or we would have
		//    experienced a null-pointer exception by now), but
		//    obj can be null.  We are required to say the two
		//    objects are not the same if obj is null.
		if (obj == null)
			return false;

		//  The two objects must be Polynomials (or better) to
		//     allow meaningful comparison.
		if (!(obj instanceof Polynomial))
			return false;

		// View the obj reference now as the Polynomial we know
		//   it to be.  This works even if obj is a BetterPolynomial.
		Polynomial other = (Polynomial) obj;

		//
		// If we get here, we have two Polynomial objects,
		//   this and other,
		//   and neither is null.  Eclipse generated code
		//   to make sure that the Polynomial's list references
		//   are non-null, but we can prove they are not null
		//   because the constructor sets them to some object.
		//   I cleaned up that code to make this read better.


		// A LinkedList object is programmed to compare itself
		//   against any other LinkedList object by checking
		//   that the elements in each list agree.

		return this.list.equals(other.list);
	}

	/**
	 * This is needed only for the BetterPolynomial extension.
	 * But you can also use it within this class if you find it
	 * handy.
	 * @return an iterator over the contained LinkedList's elements
	 */
	protected Iterator<Double> getIterator() {
		return list.iterator();
	}

}
