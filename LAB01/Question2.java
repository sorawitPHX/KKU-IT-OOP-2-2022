package lab01;
import java.util.Scanner;

public class Question2 {
	static float side = 0;
	
	static void inputCalculate() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter length of square (cm): ");
		side = input.nextFloat();
		
		float ans = side * side;
		System.out.printf("Sqaure's Area is %.2f.", ans);
		input.close();
	}
	
	public static void main(String[] args) {
		inputCalculate();
	}

}
