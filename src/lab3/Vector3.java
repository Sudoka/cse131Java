
package lab3;
//TA: You don't need to import these for this lab (these lines are underlined in yellow because they are unused)
import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Name: Philip I. Thomas
 * Lab Section: A
 * Date:2/13/12
 * Vector.java
 * CSE 131 Lab 3
 */

//TA:  Next time make sure you're using javadoc comments


public class Vector3 {

	//TA: these variables should be private
	public double deltaX;
	public double deltaY;
	public double deltaZ;

	public Vector3(double xin, double yin, double zin) {
		this.deltaX=xin;
		this.deltaY=yin;
		this.deltaZ=zin;
	}

	public double getDeltaX() {
		return deltaX;
	}
	public double getDeltaZ() {
		return deltaZ;
	}


	//TA:  instead of using deltaX and deltaY directly, you should be calling your "getters" - ie getDeltaX(), getDeltaY()
	//TA:  so that these variables can remain protected (you did this correclty in Point)


	public Vector3 deflectX() {
		// Flips vector over y axis
		return new Vector3(-deltaX,deltaY,deltaZ);
	}
	public Vector3 deflectY() {
		// flips vector over x axis
		return new Vector3(deltaX,-deltaY, deltaZ);
	}
	public double magnitude() {
		// Returns the magnitude of the two-component vector
		return Math.sqrt((deltaX*deltaX)+(deltaY*deltaY)+(deltaZ*deltaZ));
	}

	//TA: you used the deltaX variable once and the getDeltaY() method interchangeably here - stick to one or the other (getDelta() is preferred)
	
	public Vector3 plus(Vector3 v) {
		// Adds an input vector
		return new Vector3(v.getDeltaX()+deltaX,v.getDeltaY()+getDeltaY(), v.getDeltaZ()+getDeltaZ());
	}
	public Vector3 scale(double factor) {
		// Changes the magnitude of the vector by a factor (i.e. 2 -> doubles magnitude)
		return new Vector3(factor*deltaX,factor*deltaY, factor*deltaZ);
	}
	public Vector3 rescale(double magnitude) {
		// Changes the magnitude of the vector to the input
		if (this.magnitude()!=0) {
			return scale(magnitude/this.magnitude());
		}
		else {
			return new Vector3(magnitude,0,0);
		}
	}
	public void setDeltaX(double deltaX) {

		this.deltaX = deltaX;
	}

	public double getDeltaY() {
		return deltaY;
	}

	public void setDeltaY(double deltaY) {
		this.deltaY = deltaY;
	}
	public void setDeltaZ(double deltaZ) {
		this.deltaZ = deltaZ;
	}


	public String toString(){
		return "[" + deltaX + "," + deltaY + "," + deltaZ +"]";
	}
}