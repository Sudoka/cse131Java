package game;

import game.motion.PieceMover;
import lab4.Point;
import lab4.Vector;

public class BrickB extends Brick{
	int botWidth;
	int topWidth;
	int height;
	
	public BrickB(Point p, int width, int height) {
		super(p,width,height);
		
	}
	
	/**
	 * Shrink the brick by a specified factor squared and kill it if it
	 * gets too small.
	 * @param factor is multiplied by the bricks dimensions to get the
	 * new dimensions; ignored if <0 or >1.
	 */
	public void shrink(double factor) {
		if (factor < 0 || factor > 1) return;
		if (width * factor < 5.0) die();
		else {
			width = (int) (width*factor*factor);
			height = (int) (height*factor*factor);
			setBB(new BoundingBox(getCenter(), width, height));
		}
	}
	
	public String toString() {
		return "brick at " + getCenter();
	}

	public void gotHit(PieceMover ballMover) {
		ballMover.bounce(1.2, -1.2);
		die();
		
	}
	
}
