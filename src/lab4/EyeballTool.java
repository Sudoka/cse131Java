package lab4;
/**
 * Name:
 * Lab Section: 
 * Date:
 * EyeballTool.java
 * CSE 131 Lab 4
 */

import java.awt.event.MouseEvent;

import nip.*;
import lab4.*;

public class EyeballTool extends Tool {
	Eyeball e;
	
	GraphicsPanel p;
	
	public EyeballTool(GraphicsPanel p) {
		//  Auto-generated constructor stub
		this.p = p;
		
	}
	/** 
	 * Returns 'Eyeball'
	 */
	public String toString() {
		return "Eyeballs";
	}
	public void mousePressed(MouseEvent event) {
		// Creates a new eye when the mouse is clicked
		Eyeball e = new Eyeball(p,event.getX(),event.getY());
		this.e=e;	
	}
	/**
	 * We won't be using the menu to do anything for this lab
	 */
	public void actionNameCalled(String name) {		
	}
	/**
	 * Moves whole eye with moveTo while mouse is dragged.
	 */
	public void mouseDragged(MouseEvent event) {
		// Moves the whole eye when the mouse is dragged
		e.moveTo(event.getX(),event.getY());
	}

	/**
	 * No menu items needed
	 */
	public String[] getEventNames() {
		return new String[0];
	}
}
