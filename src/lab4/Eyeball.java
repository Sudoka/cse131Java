package lab4;

/**
 * Name: Philip I. Thomas
 * Lab Section: A
 * Date: Feb 27 2012 (Late Coupon)
 * Eyeball.java
 * CSE 131 Lab 4
 */

import java.awt.Color;

import lab4.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.Timer;

import nip.*;

public class Eyeball implements MouseMotionListener, ActionListener {
	private Ellipse pupil; // The pupil of the eye. It is modeled as an ellipse that is symmetric.
	private Ellipse outline; // The outer circle of the eye. It is also modeled as a symmetric ellipse.
	int pupilRadius=10; // The radius of the pupil
	int outlineRadius=40;// The radius of the outline

	public Eyeball(GraphicsPanel p, int x, int y) {
		// Constructor that creates an eyeball with the center of the outline and pupil at the given (x,y) coordinate
		outline = new Ellipse(x,y, 2*outlineRadius,2*outlineRadius); // Where does the outline go? Factor of two included to go from 'radius' to 'diameter'
		outline.setLineColor(Color.WHITE);     // The outline is all white
		outline.setFillColor(Color.WHITE);
		outline.setCenter(x,y); // calculations are based on center; the Ellipse tool sets x,y as top-left, not center
		p.add(outline);                   // put the outline on the panel
		pupil = new Ellipse(x,y,2*pupilRadius,2*pupilRadius); // Where does the pupil go? Here we center it on the outline.Factor of two included to go from 'radius' to 'diameter'

		pupil.setLineColor(Color.BLACK);    // Make the pupil black 
		pupil.setFillColor(Color.BLACK);
		p.add(pupil);                   // put the pupil on the panel
		pupil.setCenter(x,y);
		
		p.addMouseMotionListener(this); // Begins monitoring for user interaction with the panel
		p.moveToFront(pupil);
	}
	/**
	 * Moves eyeball and pupil to location
	 * @param x
	 * @param y
	 */
	public void moveTo(int x, int y) {
		// moves the eyeball and the pupil so that they are both centered at the given location 
		outline.setCenter(x, y);
		pupil.setCenter(x, y); 
		
	}
	/**
	 * Points pupils at input while keeping it in the bounds of the outline
	 * @param x
	 * @param y
	 */
	public void lookAt(int x, int y) {
		// This moves the pupil to look at the above spot without leaving the bounds of the outline
		double outlineX=outline.getCenterX();
		double outlineY=outline.getCenterY();
		
		Vector v = new Vector((double) x-outlineX, (double) y-outlineY);// This creates a vector from the center of the outline to the new point
		double maxDistance= outlineRadius-pupilRadius; // How far the center of the pupil can go from the center of the outline
		
		if (v.magnitude() <= maxDistance) {
			// If the new point lies within the bounds of the pupil and outline, 
			// move the pupil to that point
			pupil.setCenter(x,y);
			}
		else  {
			// Else, rescale the vector to the bounds, 
			// and put the new pupil point as close as possible
			// to the point while staying within the outline.

			Point center = new Point(outlineX,outlineY);// Creates a point at the center of the outline
			center=center.plus(v.rescale(maxDistance)); // Adds the rescaled vector to the center to get the correct new point for the pupil
			pupil.setCenter( (int) center.getX(), (int)  center.getY()); // moves the pupil to the edge, while ensuring that the new point is an integer to comply with MoveTo
		}
	}
	/**
	 * Calls lookAt when the mouse is moved
	 */
	public void mouseMoved(MouseEvent e) {
		// Looks at where the mouse is
		lookAt(e.getX(),e.getY());

	}
	
	// You will modify the following method only if you
	// complete the animation Extension of this project.
	public void actionPerformed(ActionEvent arg0) {
	}

	//  Do nothing here
	public void mouseDragged(MouseEvent e) {
	}
	public String toString() {
		return("The eyeball is centered at (" + outline.getCenterX() + "," + outline.getCenterY() + ") with an outline radius of " + outlineRadius + " and a pupil radius of " + pupilRadius + ".");
	}


}
