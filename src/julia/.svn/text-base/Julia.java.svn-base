package julia;

import java.awt.Color;
import java.awt.Point;

import nip.Image;

public class Julia {
	public Image image;
	public int maxIters;
	public int minWidthAndHeight;
	public Complex ul;
	public Complex lr;
	public ComplexRaster raster;
	/**
	 * Constructor:  prepare to be able to draw on the supplied image.
	 *   Retains the size of the image as the min of its width and height.
	 *   Initially, the displayed pixels correspond to:
	 *      -2 + 2i for the upper-left-hand corner
	 *       2 - 2i for the lower-right-hand corner
	 * @param image -- pixels to be set to show the Julia set
	 */
	public Julia(Image image) {
		this.image=image;
		this.minWidthAndHeight=Math.min(image.getHeight(),image.getWidth());
		this.maxIters=100;
		this.lr = new Complex(2, -2);
		this.ul = new Complex(-2, 2);
		this.raster= new ComplexRaster(ul,lr,minWidthAndHeight,minWidthAndHeight);
	}

	/**
	 * Reset the raster to show the original complex space and
	 * reset the iterations to 100.
	 */
	public void reset() {
		// zoomTo(new Point(-minWidthAndHeight/2,0-minWidthAndHeight/2), this.minWidthAndHeight);
		this.maxIters=100;
		this.lr = new Complex(2, -2);
		this.ul = new Complex(-2, 2);
		this.raster= new ComplexRaster(ul,lr,minWidthAndHeight,minWidthAndHeight);
		draw();
	}

	/**
	 * Sets the complex coordinates based on the specified pixel location
	 * @param ul Upper-left corner in pixel coordinates of the zoom-to box
	 * @param widthAndHeight length and width of the zoom-to box, in pixels
	 */
	public void zoomTo(Point ul, int widthAndHeight) {
		this.raster.ul=this.raster.getPoint(ul);
		this.raster.lr=this.raster.getPoint(ul.getX()+widthAndHeight,ul.getY()+widthAndHeight);
		draw();

	}

	/**
	 * Zooms in, which counteracts a zoom out
	 */
	public void zoomIn() {
		zoomTo(new Point((int)(raster.width*.25),(int)(raster.height*.25)),raster.height/2);
	}

	/**
	 * Zooms out, which counteracts a zoom in
	 */
	public void zoomOut() {
		zoomTo(new Point(-minWidthAndHeight/2,-minWidthAndHeight/2),minWidthAndHeight*2);

	}

	/**
	 * Increase the maximum number of iterations by some amount (say, 50)
	 */
	public void bump() {
		this.maxIters+=50;
		draw();
	}

	/**
	 * Decrease the maximum number of iterations by some amount (say, 50)
	 */
	public void unbump() {
		this.maxIters-=50;
		draw();
	}

	private int rigor(Complex c) {
		Complex z = new Complex(-0.7795,0.134);

		int iters=0;
		while (iters < maxIters&& c.abs()<2) {
			c=c.times(c).plus(z);

			iters++;


		}
		return iters;

	}

	/**
	 * Call this method to draw or redraw the Julia set
	 */
	public void draw() {
		Color color = Color.black;

		for (int i=0;i<this.minWidthAndHeight;i++) {
			for (int j=0;j<this.minWidthAndHeight;j++) {
				int iters=rigor(raster.getPoint(i,j));
				color = Color.getHSBColor((iters % 256)/255.0f, 1.0f, 1.0f);

				image.setPixel(i, j, color);
			}
		}

	}

}
