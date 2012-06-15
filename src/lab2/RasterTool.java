package lab2;

import nip.*;

/**
 * Name: Philip I. Thomas
 * Lab Section: A
 * Date: Feb 6 2012
 * Email: mail@philipithomas.com
 * RasterTool.java CSE 131 Lab 2
 */
import java.awt.Color;


public class RasterTool extends Tool {

	/**
	 * These functions allow image manipulation. The functions are first in the document, then next the inputs and corresponding actions are programmed.
	 * Specifically, the string 's' acts as the input from the source, and the logic following it implements the functions. 
	*/
	public void flipHoriz(Image source, Image target) {
		for (int x = 0; x < source.getWidth(); x++) {
			for (int y = 0; y < source.getHeight(); y++) {
				target.setPixel(x, y, source.getPixel(source.getWidth() - 1 - x, y));
			}
		}
	}
	public void flipVert(Image source, Image target) {
		for (int y = 0; y < source.getHeight(); y++) {
			for (int x = 0; x < source.getWidth(); x++) {
				target.setPixel(x, y, source.getPixel(x, source.getHeight() - 1 - y));
			}
		}
	}
	public void flipHorizLeftHalf(Image source, Image target) {
		//This function essentially takes the 'flipHoriz' function and only completes it halfway - thus creating a mirrored image.
		// The image is reflected across a vertical middle axis.
		int middle = source.getWidth()/2; // This function finds where the 'for' loop should end - half the image width.
		for (int x = 0; x < middle; x++) {
			// This loop completes the left half of the image (original)
			for (int y = 0; y < source.getHeight(); y++) {
				target.setPixel(x, y, source.getPixel(x, y));
			}
			}
		for (int x = middle++; x < source.getWidth(); x++) {
			// This loop completes the right half of the image (flipped)
			for (int y = 0; y < source.getHeight(); y++) {
				target.setPixel(x, y, source.getPixel(source.getWidth() - 1 - x, y));
			}
		}
	}
	public void flipVertBotHalf(Image source, Image target) {
		// This function extends the flipVert function to create a mirror image across a horizontal middle axis
		int middle=source.getHeight()/2;  // This function finds where the 'for'loop shoudl end - half the image width
		for (int y = 0; y < middle; y++) {
			// This loop completes the top half of the image, which is mirrored
			for (int x = 0; x < source.getWidth(); x++) {

				target.setPixel(x, y, source.getPixel(x, source.getHeight() - 1 - y));
			}
			
		}
		for (int y = middle++; y < source.getHeight(); y++) {
			// This loop completes the bottom half of the loop, which is from the original
			
			for (int x = 0; x < source.getWidth(); x++) {

				target.setPixel(x, y, source.getPixel(x, y));
			}
		}
	}
	public static int edgeResolution=50; // This determines the resolution of the edgeDetect function and its components

	public static int differentPixels(Image source, int x, int y, int checkX, int checkY){
		// This function compares two pixel colors
		// Returns 1 if pixels are different, 0 if not
		// Uses edgeResolution to determine difference in each color
		int different = 0; // Default return value is 0, the logic will change it if a difference is detected, then return the final different value
		if (checkX<0||checkY<0||checkX>=source.getWidth()||checkY>=source.getHeight()) // Check for edges of image
				different=0;
		else {
			Color c= source.getPixelColor(x, y);
			int red = c.getRed();
			int blue = c.getBlue();
			int green = c.getGreen();

			Color cCheck= source.getPixelColor(checkX, checkY);
			int checkRed = cCheck.getRed();
			int checkBlue = cCheck.getBlue();
			int checkGreen = cCheck.getGreen();

			if (Math.abs(checkRed-red)>edgeResolution)
				different=1;
			if (Math.abs(checkBlue-blue)>edgeResolution)
				different=1;
			if (Math.abs(checkGreen-green)>edgeResolution)
				different=1;}
		return different;
	}
	public int isPixelEdge(Image source, int x, int y) {
		// This function checks whether a pixel is an edge
		// if return==1, it is an edge. If return==0, it is not.
		int edgeresult = 0; // Set default value to 'no', then change based on logic below.
		// LEFT
		int checkY=y;
		int	checkX=x-1;
		if (differentPixels(source,x,y,checkX,checkY)==1)
			edgeresult=1;
		// RIGHT
		checkY=y;
		checkX=x+1;
		if (differentPixels(source,x,y,checkX,checkY)==1)
			edgeresult=1;
		// BOTTOM
		checkY=y-1;
		checkX=x;
		if (differentPixels(source,x,y,checkX,checkY)==1)
			edgeresult=1;	
		// TOP
		checkY=y+1;
		checkX=x;
		if (differentPixels(source,x,y,checkX,checkY)==1)
			edgeresult=1;
		return edgeresult;

	}
	public void edgeDetect(Image source, Image target) {
		// This function takes an image and iterates through each pixel to determine whether it is an edge value
		int isEdge=0; // Declares the edge boolean before iterating
		for (int x = 0; x < source.getWidth(); x++) {
			for (int y = 0; y < source.getHeight(); y++) {
				isEdge= isPixelEdge(source,x,y);
				if (isEdge==1)
					target.setPixel(x, y, Color.black);
				else
					target.setPixel(x,y, Color.white); 
				
			}
		}

	}
	public void gradient(Image target) {
		//This function creates a gradient with no color input. 
		Color c = Color.white; // Sets a default color type for efficiency during iterations
		int yMeasure= 0;
		int xMeasure= 0; // xMeasure and yMeasure constrain the gradient to the dimensions.
		int green=0;
		int red=0;
		int blue=0;
		for (int x = 0; x < target.getWidth(); x++) {
			for (int y = 0; y < target.getHeight(); y++) {
				yMeasure=255*y/target.getHeight();
				xMeasure=255*x/target.getWidth();
				green=yMeasure;
				red=xMeasure;
				blue=128; // Defined by parameters
				c=new Color(red,green,blue);
				target.setPixel(x, y, c);
				
			
			}
		}
	}


	public String[] getEventNames() {
		String[] s = { 
				"Flip Horizontally",
				"Flip Vertically",
				"Flip Left Half Horizontally",
				"Flip Bottom Half Vertically",
				"Color Gradient",
				"Edge Detection"};
		return s;
	}

	// Don't forget to tell your tool here how it should respond when a menu
	// item is clicked!
	public void actionNameCalled(String name) {
		if (name.equals("Flip Horizontally"))
			flipHoriz(nip.getPrimarySourceImage(), nip.getTargetImage());
		if (name.equals("Flip Vertically")) 
			flipVert(nip.getPrimarySourceImage(), nip.getTargetImage());
		if (name.equals("Flip Left Half Horizontally")) 
			flipHorizLeftHalf(nip.getPrimarySourceImage(), nip.getTargetImage());
		if (name.equals("Flip Bottom Half Vertically")) 
			flipVertBotHalf(nip.getPrimarySourceImage(), nip.getTargetImage());
		if (name.equals("Color Gradient"))
			gradient(nip.getTargetImage());
		if (name.equals("Edge Detection"))
			edgeDetect(nip.getPrimarySourceImage(), nip.getTargetImage());
		
	}


	public String toString() {
		return "raster";
	}

	public static void main(String args[]) {
		new NIP(new RasterTool(), 200, 300, 3, "", "brookings.jpg", "two-bears.jpg");
	}

}
