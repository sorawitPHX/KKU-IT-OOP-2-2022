package lab01;
import java.util.Scanner;

public class Question1 {
	public static String user_name = "Mary Jane";
	public static int user_age = 2002;
	public static String user_id = "650000000-1";
	
	
	static void tellAbout() {
		System.out.printf("My name is %s", user_name+".\n");
		System.out.println("I was born in "+user_age+".");
		System.out.print("My student id is\n"+user_id);
	}
	static void inputData() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your name: ");
		user_name = input.nextLine();
		System.out.print("What is your age: ");
		user_age = input.nextInt();
		input.nextLine();
		System.out.print("What is your id: ");
		user_id = input.nextLine();
		
		input.close();
		
	}
	
	public static void main(String[] args) {
		Question1 person = new Question1();
		//me.inputData();
		person.tellAbout();
	}

}
