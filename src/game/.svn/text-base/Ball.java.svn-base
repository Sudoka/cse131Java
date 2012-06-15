package game;

import lab4.Point;
/** 
 * This is one of several subclasses of the Piece class,
 * and is used to represent a ball in the game.
 * Provides a specialized contains method to support more
 * accurate intersection than is supported by the Piece class.
 * 
 * @author Ron Cytron, with some changes by Jon Turner
 */
public class Ball extends Piece {
	double radius;
	Point center;
	
	public Ball(Point center, double radius) {
		super(new BoundingBox(center,
				(int) (2*radius), (int) (2*radius)
		));
		this.radius = radius;
		this.center = center;
		
	}
	
	@Override
	public boolean contains(Point p) {
		double d = Math.sqrt(Math.pow(center.getX()-p.getX(), 2)+Math.pow(center.getY()-p.getY(), 2));
		if(d>=this.radius)
			return true;
		return false;
	}
	/**
	 * Shrink the ball by a specified factor and kill it if it
	 * gets too small.
	 * @param factor is multiplied by the ball's radius to get the
	 * new radius; ignored if <0 or >1.
	 */
	public void shrink(double factor) {
		if (factor < 0 || factor > 1) return;
		if (radius * factor < 2.0) die();
		else {
			radius *= factor;
			super.shrink(factor);
		}
	}
	
	public String toString() { return "ball at " + getCenter(); }
}
