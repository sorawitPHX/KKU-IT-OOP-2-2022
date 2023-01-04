package lab04;
import java.util.Scanner;

public class Question1 {

	public static void vowelsCheck(String text) {
		int vowels_count = 0;	
		boolean checkLow=false, checkCap=false, checkSpace=false, checkLen=false;
		
		for(Character c : text.toCharArray()) {
			//System.out.println(c);
			if(checkLow && checkCap && checkSpace) break;
			if(c.isLowerCase(c)) checkLow = true;
			else if(c.isUpperCase(c)) checkCap = true;
			else if(c.isWhitespace(c)) checkSpace = true;
		}
		
		if(checkLow && checkCap && checkSpace && (text.length()<=15) ) {
			//System.out.println("Pass");
			for(Character c : text.toCharArray()) {
				Character temp = c.toLowerCase(c);
				if( temp.equals('a') || temp.equals('e') || temp.equals('e') || temp.equals('i') || temp.equals('o') || temp.equals('u') ) {
					vowels_count ++;
				}
			}
			System.out.printf("Input contains %d vowels.", vowels_count);
			
		}else {
			System.out.println("Invalid input.");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter only text: ");
		String user_in = input.nextLine();
		vowelsCheck(user_in);
	}

}
