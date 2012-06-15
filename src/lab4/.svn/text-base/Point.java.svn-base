package lab4;
//TA Have your name and lab section and all that in every class, you did this in Vector correctly
//TA Again, Javadoc comments for all your methods
public class Point {
	private double x, y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	public String toString(){
		return ("Point is["+getX()+","+getY()+"]");
	}
	
	public Point plus(Vector v){
		return new Point(this.x+v.getDeltaX(),this.y+v.getDeltaY());
	}
	
	public Vector minus(Point p){
		return new Vector(this.x-p.getX(),this.y-p.getY());
	}
	
	//TA Correct but an easier way to do it is to use minus to get the Vector between the two points and then get the magnitude() of that vector which is the distance
	//TA This is easier since you wrote those methods already
	public double distance(Point p){
		return (Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y)));
	}
	
	public boolean equals(Point p){
		return p.x == x && p.y == y;
	}
}
