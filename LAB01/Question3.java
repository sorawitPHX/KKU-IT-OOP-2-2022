package lab01;
import java.util.Scanner;

public class Question3 {
	static void inputCalculate() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter height (cm): ");
		float user_height = input.nextInt();
		System.out.print("Enter weight (kg): ");
		float user_weight = input.nextInt();
		double user_bmi = user_weight/( Math.pow((user_height/100), 2) );
		System.out.printf("Your BMI is %.2f",user_bmi);
	}
	
	public static void main(String[] args) {
		inputCalculate();
	}
}
