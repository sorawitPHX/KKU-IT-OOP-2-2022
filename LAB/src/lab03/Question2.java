package lab03;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// ==============================
		Scanner input = new Scanner(System.in);
		int round, temp, max=0, sum_stack=0;
		float avg;
		// ==============================
		while (true) {
			System.out.print("Enter number of input [2-5]: ");
			round = input.nextInt();
			if (round>=2 && round<=5) 
				break;
			else 
				System.out.println("Invalid! please enter [2-5]!");
		}
		// ==============================
		for (int i=1; i<=round; i++) {
			System.out.printf("Enter number (integer) #%d: ", i);
			temp = input.nextInt();
			
			if (i==1) 
				max = temp;
			else {
				if (temp > max) 
					max=temp;
			}
			
			sum_stack += temp; 
		}
		// ==============================
		avg = (float) sum_stack/round;
		System.out.printf("Max = %d\n", max);
		System.out.printf("Average = %.2f\n", avg);
		// ==============================
	}

}
