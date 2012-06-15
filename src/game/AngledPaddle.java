package game;

import lab4.Point;
import lab4.Vector;

public class AngledPaddle extends Paddle {

	public int topWidth;
	public int topHeight;

	public AngledPaddle(Point center, int width, int topWidth, int height, int topHeight) {
		super(center, width, height);
		this.topWidth = topWidth;
		this.topHeight = topHeight;
	}
	public boolean contains(Point p){
		if(bb.contains(p)){
			Point ul = bb.getUL();
			Point ur = bb.getUL().plus(new Vector(bb.getWidth(), 0));
			Point innerLeft = ul.plus(new Vector((getWidth() - topWidth)/2, topHeight));
			Point innerRight = ur.plus(new Vector(-(getWidth() - topWidth)/2, -topHeight));
			if(p.distance(ul)> p.distance(innerLeft) || p.distance(ur)> p.distance(innerRight)){
				return true;
			}
		}
		return false;
	}
	

}
