package game;

import java.awt.Color;

import nip.GraphicsPanel;

public class TrapViz extends RectViz {

	private FunkyBrick trap;
	public TrapViz(FunkyBrick f, Color c, GraphicsPanel panel) {
		super(f, c, panel);
		this.trap = f;
		
	}
//	protected Graphic newGraphic() {
//		Graphic g = new Rectangle(0, 0, trap.topWidth, trap.getHeight());
////		Graphic tLeft = new Triangle2D();
//	}

}
