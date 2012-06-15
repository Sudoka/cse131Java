package game;

import lab4.Point;
import lab4.Vector;

public class FunkyBrick extends Brick{
	int botWidth;
	int topWidth;
	int height;
	
	public FunkyBrick(Point p, int botWidth, int topWidth, int height){
		super(p, botWidth, height);
		this.botWidth = botWidth;
		this.topWidth = topWidth;
		this.height = height;
	}
	
	public boolean contains(Point p){
		if(bb.contains(p)){
			Point ul = bb.getUL();
			Point ur = bb.getUL().plus(new Vector(bb.getWidth(), 0));
			Point innerLeft = ul.plus(new Vector((botWidth - topWidth)/2, height));
			Point innerRight = ur.plus(new Vector(-(botWidth - topWidth)/2, -height));
			if(p.distance(ul)> p.distance(innerLeft) || p.distance(ur)> p.distance(innerRight)){
				return true;
			}
		}
		return false;
	}
	
	
	
}
