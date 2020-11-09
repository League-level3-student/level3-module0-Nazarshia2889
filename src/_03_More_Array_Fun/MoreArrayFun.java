package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	
	Random rand = new Random();
	
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] list = {"apple", "banana", "dog", "cat"};
		

		new MoreArrayFun().printAll(list);
		new MoreArrayFun().reverse(list);
		new MoreArrayFun().everyOther(list);
		new MoreArrayFun().randomStrings(list);
		
		
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public void printAll(String[] strings) {
		for(int i = 0;i<strings.length;i++) {
			System.out.println(strings[i]);
		}
		
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public void reverse(String[] strings) {
		for(int i = strings.length-1;i>=0;i--) {
			System.out.println(strings[i]);
		}
		
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public void everyOther(String[] strings) {
		for(int i = 0;i<strings.length;i+=2) {
			System.out.println(strings[i]);
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public void randomStrings(String[] strings) {
		String[] t = new String[strings.length];
		int wordsPrinted = 0;
		while(wordsPrinted < strings.length) {
			int r = rand.nextInt(strings.length);
			String word = strings[r];
			boolean printed = false;
			for(int i = 0;i<wordsPrinted;i++) {
				if(word.equals(t[i])) {
					printed = true;
					break;
				}
			}
			if(printed == false) {
				System.out.println(word);
				t[wordsPrinted] = word;
				wordsPrinted++;
			}
		}
	}
	
}
