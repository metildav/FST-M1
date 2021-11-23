package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		
		//Initializing an array with 6 numbers
		int[] numArray = {10, 77, 10, 54, -11, 10};
		
		System.out.println("Number Array: " + Arrays.toString(numArray));
		
		int searchNum = 10;
		int sum = 30;
		
		System.out.println("Result: " + result(numArray, searchNum, sum));
	}
	
	public static boolean result(int[] numbers, int searchNum, int sum) {
		int tempSum = 0;
		for (int number : numbers) {
			if (number == searchNum)
				tempSum+=searchNum;
			if (tempSum > sum)
				break;
		}
		
		return tempSum == sum;
		
	}
}
