package game.collision;

import game.Brick;
import game.Piece;
import game.motion.PieceMover;

public class BrickHitsBrick extends CollisionHandler {

	private PieceMover mover1;
	private PieceMover mover2;

	public BrickHitsBrick(Brick one, Brick two, PieceMover mover1, PieceMover mover2) {
		super(one, two);
		this.mover1 = mover1;
		this.mover2 = mover2;
	}

	@Override
	public void observeEvent(Collision e) {
		mover1.bounce(-1,-1);
		mover2.bounce(-1,-1);

	}

}
