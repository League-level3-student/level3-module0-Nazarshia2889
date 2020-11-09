package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] fruit = {"Apple", "Banana", "Blueberry", "Strawberry", "Orange"};

		//2. print the third element in the array
		System.out.println(fruit[2]);
		//3. set the third element to a different value
		fruit[2] = "Blackberry";
		//4. print the third element again
		System.out.println(fruit[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0;i<fruit.length;i++) {
			fruit[i] = "Raspberry";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0;i<fruit.length;i++) {
			System.out.println(fruit[i]);
		}
		//7. make an array of 50 integers
		int[] numbers = new int[50];
		Random rand = new Random();
		//8. use a for loop to make every value of the integer array a random number
		for(int i = 0;i<numbers.length;i++) {
			numbers[i] = rand.nextInt(50);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int n = numbers[0];
		for(int i = 0;i<numbers.length;i++) {
			if(numbers[i]<n) {
				n=numbers[i];
			}
		}
		System.out.println(n);
		//10 print the entire array to see if step 8 was correct
		for(int i = 0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		//11. print the largest number in the array.
		int nTwo = numbers[0];
		for(int i = 0;i<numbers.length;i++) {
			if(numbers[i]>nTwo){
				nTwo = numbers[i];
			}
		}
		System.out.println(nTwo);
		
		//12. print only the last element in the array
		System.out.println(numbers[49]);
	}
}
