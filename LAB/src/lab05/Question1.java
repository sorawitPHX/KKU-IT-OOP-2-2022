package lab05;

public class Question1 {
	public static int[] sumArray(int[] arr) {
		int[] ans = new int[2];
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) 
				ans[0] += arr[i];
			else 
				ans[1] += arr[i];
		}
		System.out.println();
		return ans;
	}
	
	
	public static void main(String[] args) {
		int[] num = {0, 1, 2, 3, 4, 5, 6, 7};
		//int[] num = {11, 15, 20, 55, 99};
		//int[] ans = sumArray(num);
		
		System.out.printf("Ans[0]: %d\nAns[1]: %d", sumArray(num)[0], sumArray(num)[1]);
		//System.out.println(a2);
	}

}
