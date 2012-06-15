package lab5;

import static org.junit.Assert.assertEquals;

/**
 * Name: Philip I. Thomas
 * Lab Section: A
 * Date:2/27/11
 * Email:mail@philipithomas.com
 * Recursion.java
 * CSE 131 Lab 5
 */

public class Recursion {

	// Example:
	static int factorial(int k) {
		if (k == 0)
			return 1;
		else
			return k * factorial(k-1);
	}

	/** 
	 * Sums up the components of a number as it decreases by two
	 * e.g. 5 -> 5+3+1 -> 9
	 * @param i
	 * @return
	 */
	static int sumDownBy2(int i) {
		if (i<=2) { // Stop recursing when the number is 2 or 1
			if (i < 0) {return 0;} // If there is a negative number, default to zero
			else { return i;}
		}
		else {
			return i + sumDownBy2(i-2);
		}
	}
	/**
	 * Implements a harmonic sum
	 * @param n
	 * @return
	 */
	static double harmonicSum(int n) {
		if (n==1) 
			return 1.0; 
		else
		{
			return 1/n + harmonicSum(n-1);
		}
	}

	/**
	 * Takes an input of an positive integer k and completes a geometric sum
	 * @return
	 */
	static double geometricSum(int k) {
		if (k==0) 
			return 1; // Endpoint
		else 
			return  1/Math.pow(2,k) + geometricSum(k-1); 
	}

	/**
	 * This performs multiplication of two integers
	 * @param j
	 * @param k
	 * @return
	 */
	static int mult(int j,int k) {
		int index;
		if (k==0)
			return 0;
		else
			index= (int) k/Math.abs(k); // This allows us to work with negative numbers
		return index*j +mult(j,k-index); // The multiply statement works towards zero

	}
	/**
	 * This is a novel function for taking exponents of positive integers
	 * @param n
	 * @param k
	 * @return
	 */
	static int expt(int n,int k) {
		if (k==0)
			return 1;
		else
			return n*expt(n,k-1);
	}
	/**
	 * This is a helper file written for lcm to decide which integer is lower and to start with that in the recursion
	 * @param j
	 * @param k
	 * @return
	 */
	static int lcmhelp(int j,int k, int n) {
		if ((n % j == 0) && (n % k == 0)) {		
			return n; // n is the lowest number
		}
		else 
			return lcmhelp(j,k,n+1); // try again with the next-largest number
	}
	/**
	 * This finds the lowest common multiple of two positive integers
	 * @param j
	 * @param k
	 * @return
	 */
	static int lcm(int j, int k) {
		int start;
		if (j<k)
			start= j;
		else start = k; // Breaks ties with k
		return lcmhelp(j,k,start);
	}

	/**
	 * Calculates how long it takes to pay off a loan
	 * @param principle
	 * @param interest
	 * @param payment
	 * @return
	 */
	static int loanLength(int principle, double interest, int payment) {
		if (principle<=payment){ 
			if (principle<=0) return 0;
			else { 
				System.out.println("Month 0: $" + principle); 
				return 1;
			}
		}
		else {


			int month=0;
			int loandate= loanHelper(principle,interest,payment,month)-1; // Subtract one because it counts month 0 as a month
			return loandate;
		}

	}
	/** 
	 * This allows for a recursive loan pay-off calculation while keeping track of the number of loops.
	 * Displays the current month.
	 * @param principle
	 * @param interest
	 * @param payment
	 * @param month
	 * @return
	 */
	static int loanHelper(int principle,double interest,int payment,int month) {

		if (principle<=payment){ 
			if (principle<=0) return 0;
			else { 
				System.out.println("Month " + month + ": $" + principle); 
				return 1;
			}
		}
		else
			System.out.println("Month " + month + ": $" + principle); 
		month++;
		return 1+ loanHelper((int) (((principle)*(1+interest/12))-payment), interest, payment,month);



	}
}


