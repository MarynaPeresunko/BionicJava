public class Rectangle implements AreaMeasurable {
	private double h; // h — height
	private double w; // w — width
	
	public Rectangle() {}
	
	public Rectangle(double h, double w) {
		this.h= h;
		this.w = w;
	}
	public double getHeight() {
		return h;
	}
	public void setHeight(double h){
		this.h = h;
	}
	public double getWidth() {
		return w;
	}
	public void setWidth(double w) {
		this.w = w;
	}
	@Override 
	public double calculateArea() {
		return h * w;
	}
}
