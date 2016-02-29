public class Circle implements AreaMeasurable {
	private double r; // r — radius
	
	public Circle() {}
	
	public Circle(double r) {
		this.r = r;		
	}
	public double getRadius() {
		return r;
	}
	public void setRadius(double r) {
		this.r = r;
	}
	public double calculateArea() {
		return Math.PI * (r * r);
	}
}