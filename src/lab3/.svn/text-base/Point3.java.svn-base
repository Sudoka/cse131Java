package lab3;

//TA: You don't need to import these for this lab (these lines are underlined in yellow because they are unused)
//TA: Your point JUNIT test isn't passing

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Name: Philip I. Thomas
 * Lab Section: A
 * Date:2/13/12
 * Point.java
 * CSE 131 Lab 3
 */

//TA:  Next time make sure you're using javadoc comments

public class Point3 {

	public double x;
	public double y;
	public double z;
	
	public Point3(double xin, double yin, double zin) {
		this.x=xin;
		this.y=yin;
		this.z=zin;
	}

	public Point3 plus(Vector3 v) {
		return new Point3(x + v.getDeltaX(), y + v.getDeltaY(), z+v.getDeltaZ());
	}
	
	public Vector3 minus(Point3 p) {
		return new Vector3(x-p.getX(), y-p.getY(),z-p.getZ());
	}
	public double distance(Point3 d) {
		return this.minus(d).magnitude();
	}
	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}
	
	public void setZ(double z) {
		this.z=z;
	}
	public double getZ() {
		return z;
	}

	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}
	public String toString() {
		return "(" + x + "," + y + "," + z + ")";
	}

	
	
	
}