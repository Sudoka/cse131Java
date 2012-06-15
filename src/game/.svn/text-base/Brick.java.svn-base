package game;

import game.motion.PieceMover;
import lab4.Point;

/**
 * This is one of several subclasses of the Piece class,
 * and is used to represent a brick in the game.
 * 
 * @author Ron Cytron, with some changes by Jon Turner
 */
public class Brick extends Piece {
	public int width;
	public int height;
	
	public Brick(Point p, int width, int height) {
		super(new BoundingBox(p,width,height));
		this.width = width;
		this.height = height;
	}
	
	/**
	 * Shrink the brick by a specified factor and kill it if it
	 * gets too small.
	 * @param factor is multiplied by the bricks dimensions to get the
	 * new dimensions; ignored if <0 or >1.
	 */
	public void shrink(double factor) {
		if (factor < 0 || factor > 1) return;
		if (width * factor < 5.0) die();
		else {
			width = (int) (width*factor);
			height = (int) (height*factor);
			setBB(new BoundingBox(getCenter(), width, height));
			super.shrink(factor);

		}
		
	}
	
	public String toString() {
		return "brick at " + getCenter();
	}

	public void gotHit(PieceMover ballMover) {
		ballMover.bounce(1, -1);
		die();
	}
}
