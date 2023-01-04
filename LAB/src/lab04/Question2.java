package lab04;
import java.util.Scanner;

public class Question2 {
	public static String proNum(char n) {
		String result;
		if(n == '0') result = "zero";
		else if(n=='1') result = "one";
		else if(n=='2') result = "two";
		else if(n=='3') result = "three";
		else if(n=='4') result = "four";
		else if(n=='5') result = "five";
		else if(n=='6') result = "six";
		else if(n=='7') result = "seven";
		else if(n=='8') result = "eight";
		else if(n=='9') result = "nine";
		else result = "point";
		return result;
	}
	
	public static void readNum(Double n) {
		if(n>=0 && n<10) {
			String n_text = n.toString();
				System.out.print("Pronounce: ");
				for(char c : n_text.toCharArray()) {
					System.out.printf("%s ", proNum(c));
				}
		} else if(n==10) {
			System.out.println("Pronounce: ten point zero");
		} else System.out.println("Invalid input.");
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double user_input;
		while(true) {
			System.out.print("Enter real number [0, 10): ");
			user_input = input.nextDouble();
			if(user_input>=0 && user_input<=10) break;
		}
		readNum(user_input);
		//String a = proNum('2');
		//System.out.println(a);
	}

}
