package game.collision;

import game.*;
import game.pubsub.*;
import lab4.Point;

/**
 * A CollisionDetector monitors two Pieces in the game and reports a collision
 * when the two come into contact. It subscribes to events from its two Pieces
 * and reports collisions to its subscribers when the Pieces collide.
 * 
 * @author Ron Cytron, with changes by Jon Turner
 */
public class CollisionDetector extends BasePublisher<Collision> implements
		Subscriber<PieceEvent> {

	private static boolean blah = true;
	final private Piece one;
	final private Piece two;
	final private int delay; // used to avoid multiple reports of same collision
	private int counter;
	protected boolean dead;
	Point posOne, posTwo; // last position of each point
	private boolean shouldPrint = false;

	/**
	 * Auxiliary constructor, uses no delay between collision notifications
	 * 
	 * @param one
	 * @param two
	 */
	public CollisionDetector(Piece one, Piece two) {
		this(one, two, 0);
	}

	/**
	 * Main constructor.
	 * 
	 * @param one
	 *            One of the two Pieces that will be checked for intersection.
	 * @param two
	 *            Other of the two Pieces that will be checked for intersection.
	 * @param delay
	 *            Minimum number of clock ticks between intersection
	 *            notifications.
	 */
	public CollisionDetector(Piece one, Piece two, int delay) {
		this.one = one;
		this.two = two;
		this.delay = delay;
		this.counter = 0;
		this.dead = false;
		posOne = one.getCenter();
		posTwo = two.getCenter();
		one.addSubscriber(this);
		two.addSubscriber(this);
		if (blah) {
			if (one instanceof Boundary || two instanceof Boundary) {
				System.out.println("printset");
				shouldPrint = true;
				blah = false;
			}
		}
	}

	/**
	 * Standard observer of the published PieceEvents. Checks for intersections
	 * and notifies subscribers if one occurred. The counter ensures that the
	 * period between successive collisions is at least the value of delay. This
	 * reduces the chances that a single collision will be reported multiple
	 * times.
	 * 
	 * @param pe
	 *            is the event object that identifies which of the two pieces is
	 *            reporting a change.
	 */
	public void observeEvent(PieceEvent pe) {
		if (posOne.equals(one.getCenter()) && posTwo.equals(two.getCenter())) {
			// ignore events when neither piece moves
			return;
		}
		posOne = one.getCenter();
		posTwo = two.getCenter();
		if (one.isDead() || two.isDead()) {
			dead = true;
		} else if (counter == 0) {
			if (two.intersects(one)) {
				this.notifySubscribers(new Collision(one, two));
				System.out.println(list);
				counter = delay;
			}
		} else {
			if (shouldPrint) {
				System.out.println("counter: " + counter);
			}
			counter = counter - 1;
		}
	}

	public boolean isDead() {
		return dead;
	}

	public String toString() {
		return "CollisionDetector for " + one + " and " + two;
	}
}
