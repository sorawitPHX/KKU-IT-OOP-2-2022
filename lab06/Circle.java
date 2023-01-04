package lab06;

public class Circle {
	public double radius;
	
	public void calculateArea() {
		double result = Math.pow(radius, 2)*3.14;
		System.out.printf("Area : %.2f\n", result);
	}
	public void calculateCircumference() {
		double result = 2*radius*3.14;
		System.out.printf("Circumference : %.2f\n", result);
	}
}
