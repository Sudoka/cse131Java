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

public class Point {

	public double x;
	public double y;
	
	public Point(double xin, double yin) {
		this.x=xin;
		this.y=yin;
	}

	public Point plus(Vector v) {
		return new Point(x + v.getDeltaX(), y + v.getDeltaY());
	}
	
	public Vector minus(Point p) {
		return new Vector(x-p.getX(), y-p.getY());
	}
	public double distance(Point d) {
		return this.minus(d).magnitude();
	}
	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	
	
	
}