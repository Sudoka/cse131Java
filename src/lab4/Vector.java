package lab4;

/**
 * Name: Pei Heng Zeng
 * Lab Section: A
 * Date: 02/13/2012
 * Vector.java
 * CSE 131 Lab 3
 */
//TA You did not complete the cover-sheet, make sure you do that for later labs
//TA Add Javadoc comments for all your methods or you will lose points in later labs
public class Vector {
	private double deltaX, deltaY;
	public Vector(double deltaX, double deltaY) {
		super(); //TA This line is unnecessary but don't worry about what it means
		this.deltaX = deltaX;
		this.deltaY = deltaY;
	}

	public String toString(){
		return ("Vector is["+getDeltaX()+","+getDeltaY()+"]");
	}

	public double getDeltaX() {
		return deltaX;
	}

	public double getDeltaY() {
		return deltaY;
	}

	public double magnitude(){
		return (Math.sqrt(deltaX*deltaX+deltaY*deltaY));
	}

	public Vector deflectX(){
		return new Vector(-deltaX, deltaY);
	}

	public Vector deflectY(){
		return new Vector(deltaX, -deltaY);
	}

	public Vector plus(Vector v){
		return new Vector(this.deltaX+v.getDeltaX(), this.deltaY+v.getDeltaY());
	}
	
	public Vector minus(Vector v){
		return new Vector(this.deltaX-v.getDeltaX(), this.deltaY-v.getDeltaY());
	}
	
	public Vector scale(double factor){
		return new Vector((this.deltaX)*factor, (this.deltaY)*factor);
	}
	
	//TA Very well done
	public Vector rescale(double magnitude){
		if(this.magnitude()== 0){
			return new Vector(magnitude, 0);
		}return scale(magnitude/this.magnitude());
	}
}


