package game.collision;

import game.Ball;
import game.ballB;
import game.Paddle;
import game.PaddleCool;
import game.motion.PieceMover;

public class BallHitsPaddle extends CollisionHandler {

	protected PieceMover mover;
	private Paddle paddle;
	private Ball ball;

	public BallHitsPaddle(Ball ball, Paddle paddle, PieceMover mover) {
		super(ball, paddle);
		this.mover = mover;
		this.paddle = paddle;
		this.ball=ball;
		
	}

	@Override
	public void observeEvent(Collision e) {
		if (paddle instanceof PaddleCool) {
			double random = Math.random();
			if (ball instanceof ballB) {
				System.out.println(" ball B");

				if (random<.5) {
				mover.bounceCool(1,-1);
				System.out.println("Bounce cool for ball B");
				}
				else {
					mover.bounce(1,-1);
					System.out.println("Normal bounce for ball B");

				}
				
			}
			else {
			mover.bounceCool(1, -1);
			}

		} else {
			System.out.println("Bounce cool for ball B");

			mover.bounce(1, -1);
		}
	}

}
