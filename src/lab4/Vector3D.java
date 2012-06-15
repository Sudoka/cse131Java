package lab4;

public class Vector3D {
	private double deltaX, deltaY, deltaZ;

	public Vector3D(double deltaX, double deltaY, double deltaZ) {
		super();
		this.deltaX = deltaX;
		this.deltaY = deltaY;
		this.deltaZ = deltaZ;
	}

	public String toString(){
		return ("Vector is["+getDeltaX()+","+getDeltaY()+","+getDeltaZ()+"]");
	}

	public double getDeltaX() {
		return deltaX;
	}

	public double getDeltaY() {
		return deltaY;
	}
	
	public double getDeltaZ() {
		return deltaZ;
	}

	public double magnitude(){
		return (Math.sqrt(deltaX*deltaX+deltaY*deltaY+deltaZ*deltaZ));
	}

	public Vector3D deflectX(){
		return new Vector3D(-deltaX, deltaY, deltaZ);
	}

	public Vector3D deflectY(){
		return new Vector3D(deltaX, -deltaY, deltaZ);
	}
	
	public Vector3D deflectZ(){
		return new Vector3D(deltaX, deltaY, -deltaZ);
	}

	public Vector3D plus(Vector3D v){
		return new Vector3D(this.deltaX+v.getDeltaX(), this.deltaY+v.getDeltaY(), this.deltaZ+v.getDeltaZ());
	}
	
	public Vector3D minus(Vector3D v){
		return new Vector3D(this.deltaX-v.getDeltaX(), this.deltaY-v.getDeltaY(), this.deltaZ-v.getDeltaZ());
	}
	
	public Vector3D scale(double factor){
		return new Vector3D((this.deltaX)*factor, (this.deltaY)*factor, (this.deltaZ)*factor);
	}
	
	public Vector3D rescale(double magnitude){
		if(this.magnitude()== 0){
			return new Vector3D(magnitude, 0, 0);
		}
		return scale(magnitude/this.magnitude());
	}
}
