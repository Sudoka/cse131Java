package bscholes;

import static org.junit.Assert.*;

import org.junit.Test;


public class BlackScholesTest {

	/* Based on 2003 estimate
	 * 
	 *      Microsoft:   share price:             23.75
	 *                   strike price:            15.00
	 *                   risk-free interest rate:  1%
	 *                   volatility:              35%          (historical estimate)
	 *                   time until expiration:    0.5 years
	 *                   
	 *                   (actual =  9.10)
	 *
	 *       GE:         share price:             30.14
	 *                   strike price:            15.00
	 *                   risk-free interest rate   1%
	 *                   volatility:              33.2%         (historical estimate)
	 *                   time until expiration     0.25 years
	 *                   
	 *                   (actual = 14.50)
	 *
	 */

	@Test
	public void testBlackScholes() throws MathException {
		BlackScholes MicrosoftPricing = new BlackScholes(23.75, 15.0, .5, .001, Math.sqrt(.35));
		
		System.out.println("Testing NofD1() Microsoft");
		assertEquals(0.936, MicrosoftPricing.NofD1(), .005);
		System.out.println("Testing NofD2() Microsoft");
		assertEquals(0.864, MicrosoftPricing.NofD2(), .005);
		
		System.out.println("Testing findPrice() Microsoft");
		assertEquals(9.10, MicrosoftPricing.findPrice(), 0.6 );
		System.out.println("GE Actual = 9.10, Predicted = "+MicrosoftPricing.findPrice());
		
		BlackScholes GEPricing = new BlackScholes(30.14, 15.00, .25, .001, Math.sqrt(.332));
		
		System.out.println("Testing NofD1() GE");
		assertEquals(0.998, GEPricing.NofD1(), .005);	
		System.out.println("Testing NofD2() GE");
		assertEquals(0.996, GEPricing.NofD1(), .005);
		
		System.out.println("Testing findPrice() GE");
		assertEquals( 14.50, GEPricing.findPrice(), 0.8);
		System.out.println("GE Actual = 14.50, Predicted = "+GEPricing.findPrice());
	}
}