package game;

import game.motion.PieceMover;
import lab4.Point;
import lab4.Vector;

public class BrickD extends Brick{
	int botWidth;
	int topWidth;
	int height;

	public BrickD(Point p, int width, int height) {
		super(p,width,height);
	}


	public String toString() {
		return "brick at " + getCenter();
	}
	
	@Override
	public void gotHit(PieceMover ballMover) {

		ballMover.bounce(1, -1);
		this.shrink(.5);
//		System.out.println("Getting here");
	}

}
