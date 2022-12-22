package lab02;
import java.util.Scanner;

public class Question1 {
	private float height;
	private float weight;
	
	Question1(float height, float weight) {
		this.height = height;
		this.weight = weight;
	}
	
	void tellBMI() {
		double bmi_value;
		String bmi_status;
		bmi_value = this.weight / Math.pow((this.height/100), 2);
		
		if(bmi_value < 18.5) {
			bmi_status = "Underweight";
		}else if(bmi_value <= 24.9) {
			bmi_status = "Healthy Weight";
		}else if(bmi_value <= 29.9) {
			bmi_status = "Overweight";
		}else{
			bmi_status = "Obesity";
		}
		
		System.out.printf("Your BMI is %.4f (%s)", bmi_value, bmi_status);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter height in (cm): ");
		float user_hei = input.nextFloat();
		System.out.print("Enter weight in (kg): ");
		float user_wei = input.nextFloat();
		
		Question1 ob1 = new Question1(user_hei, user_wei);
		ob1.tellBMI();		
	}
}
