package game.motion;

import game.time.Clock;
import game.time.Time;
import lab4.Point;
import lab4.Vector;

/**
 * An object sitting still, with zero velocity and acceleration.
 * This is the simplest of the three velocity classes.
 */
public class Stationary implements Trajectory {

	private Point origin;
	private Time t0;
	
	public Stationary(Trajectory old) {
		this(old.getCurrentLocation());
	}
	
	public Stationary(Point origin) {
		this.origin = origin;
		t0 = Clock.instance().currentTime();
	}
	
	
	public Time getT0() {
		return t0;
	}
	
	
	final public Point getCurrentLocation() {
		return getLocation(Clock.instance().currentTime());
	}

	public Point getLocation(Time t) { return origin; }
	
	public Vector getCurrentVelocity() {
		return new Vector(0,0);
	}
	
	public Vector getCurrentAcceleration() {
		return new Vector(0,0);
	}
}
