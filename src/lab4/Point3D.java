package lab4;

public class Point3D {
	private double x, y, z;


	public Point3D(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public double getZ() {
		return z;
	}
	
	public String toString(){
		return (getX()+","+getY()+","+getZ());
	}
	
	public Point3D plus(Vector3D v){
		return new Point3D(this.x+v.getDeltaX(),this.y+v.getDeltaY(),this.z+v.getDeltaZ());
	}
	
	public Vector3D minus(Point3D p){
		return new Vector3D(this.x-p.getX(),this.y-p.getY(),this.z-p.getZ());
	}
	
	public double distance(Point3D p){
		return (Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y)+(this.z-p.z)*(this.z-p.z)));
	}
}
