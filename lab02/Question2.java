package lab02;
import java.util.Scanner;

public class Question2 {
	static void calTax(int salary) {
		salary = (salary * 12) - 100_000;
		//salary = (salary * 12);
		//System.out.println(salary);
		float percent_tax;
		double tax = 0;
		
		if(salary <= 150_000) {
			System.out.println("Your tax is exemption.");
			return;
		}else if(salary <= 300_000) {
			percent_tax = 5;
		}else if(salary <= 500_000) {
			percent_tax = 10;
		}else if(salary <= 750_000) {
			percent_tax = 15;
		}else if(salary <= 1_000_000) {
			percent_tax = 20;
		}else if(salary <= 2_000_000) {
			percent_tax = 25;
		}else if(salary <= 5_000_000) {
			percent_tax = 30;
		}else {
			percent_tax = 35;
		}
		
		tax = (percent_tax/100) * salary;
		System.out.printf("Tax rate is %.0f%%.\n", percent_tax);
		System.out.printf("Your tax is %,.0f bath.\n", tax);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Salary: ");
		int salary = input.nextInt();
		
		calTax(salary);
	}
}
