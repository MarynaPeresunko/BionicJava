public class Square implements AreaMeasurable {
	public double a; // a — side length
	
	public Square() {}
	
	public Square(double sideLen) {
		this.a = sideLen;
	}
	public double getSide() {
		return a;
	}
	public void setSide(double a) {
		this.a = a;
	}
	public double calculateArea() {
		return this.a * 2;
	}
}
