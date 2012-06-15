package game;
import lab4.Point;


public class ballB extends Ball {
	
	public ballB(Point center, double radius) {
		super(center, radius*1.5);
		
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
