package game.collision;

import lab4.Vector;
import game.AngledPaddle;
import game.Ball;
import game.Paddle;
import game.motion.PieceMover;

public class BallHitsAngledPanel extends BallHitsPaddle {

	private AngledPaddle paddle;
	private Ball ball;

	public BallHitsAngledPanel(Ball ball, AngledPaddle paddle, PieceMover mover) {
		super(ball, paddle, mover);
		this.paddle = paddle;
		this.ball = ball;

	}

	@Override
	public void observeEvent(Collision e) {
		Vector v = ball.getCenter().minus(paddle.getCenter());
		double deltaX = v.getDeltaX();
		if (deltaX < paddle.topWidth / 2) {
			mover.bounce(1, -1);
		} else {
			int isNegative = 1;
			if (deltaX < 0) {
				isNegative = -1;
			}
			Vector slope = new Vector(isNegative*paddle.topHeight
					, ((paddle.getWidth() - paddle.topWidth) / 2));
			mover.redirect(slope, 1);
		}
	}

}
