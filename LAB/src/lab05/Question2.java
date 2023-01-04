package lab05;
import java.util.Scanner;
import java.util.ArrayList;

public class Question2 {
	public static void findDuplicate(String[]arr1, String[]arr2) {
		ArrayList dul_arr = new ArrayList();
		ArrayList al_arr1 = new ArrayList();
		for(int i=0; i<arr1.length; i++) {
			al_arr1.add(arr1[i]);
			for(int j=0; j<arr2.length; j++) {
				//System.out.printf("%s & %s = %s\n", arr1[i], arr2[j], arr1[i]==arr2[j]);
				//System.out.printf("%s %s = %s\n", arr1[i], arr2[j], arr1[i].equals(arr2[j]));
				if(arr1[i].equals(arr2[j])) {
					dul_arr.add(arr1[i]);
					}	
			}
		}
		
		for(int i=0; i<dul_arr.size(); i++) {
			al_arr1.remove(dul_arr.get(i));
		}
		System.out.printf("Remove duplication from 1st array: %s", al_arr1);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter 1st array: ");
		String user_in1 = in.next();
		
		System.out.print("Enter 2nd array: ");
		String user_in2 = in.next();
		
		//String user_in1 = "1,2,3,4,5";
		//String user_in2 = "3,1,6,7";
		
		
		String[] Uarr1 =  user_in1.split(",");
		String[] Uarr2 =  user_in2.split(",");
		
		findDuplicate(Uarr1, Uarr2);
		//System.out.println(Arrays.toString(user_in1.split(",")));
	}

}
