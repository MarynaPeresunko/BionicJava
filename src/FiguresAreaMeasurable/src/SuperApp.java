/* Given an array of following objects:
	–Squares (side length)
	–Rectangles (width and height)
	–Circles (radius)

Find general area of all these figures  */

public class SuperApp {
	
	public static void main(String[] args) {
		AreaMeasurable[] figures = new AreaMeasurable[8];
		
		figures[0] = new Square(4);
		figures[1] = new Square(6.7);
		figures[2] = new Square(0.9);
		figures[3] = new Rectangle(4,7);
		figures[4] = new Rectangle(3.5,4);
		figures[5] = new Circle(5);
		figures[6] = new Circle(3);
		figures[7] = new Circle(2.78);
		
		double generalArea = 0.0;
		
		for (AreaMeasurable figure : figures ) {
			generalArea += figure.calculateArea();
		}
		
		System.out.printf("The general area of all these figures = %.2f\n", generalArea);
	}
}