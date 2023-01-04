package lab06;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		Circle myCircle = new Circle();
		Scanner in = new Scanner(System.in);
		
		System.out.print("Radius : ");
		double user_radius = in.nextDouble();
		
		myCircle.radius = user_radius;
		
		myCircle.calculateArea();
		myCircle.calculateCircumference();
		
	}

}
