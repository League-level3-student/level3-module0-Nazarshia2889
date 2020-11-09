import javax.swing.JOptionPane;

public class Checkpoint {
	public static void main(String[] args) {
		//Module 0 Checkpoint Parts 1-5
		int[] five = new int[5];
		int sum = 0;
		for(int i = 0;i<five.length;i++) {
			String input = JOptionPane.showInputDialog(null, "Enter a number: ");
			int x = Integer.parseInt(input);
			five[i] = x;
		}
		for(int i = 0;i<five.length;i++) {
			sum += five[i];
		}
		JOptionPane.showMessageDialog(null, "The sum of all the numbers is " + sum);
		
		
		
		
		
		
		//EXTRA
		int[] numbers;
		String answer = JOptionPane.showInputDialog(null, "How many numbers do you want?: ");
		int size = Integer.parseInt(answer);
		numbers = new int[size];
		double add = 0.0;
		for(int i = 0;i<numbers.length;i++) {
			String input = JOptionPane.showInputDialog(null, "Enter a number: ");
			int x = Integer.parseInt(input);
			numbers[i] = x;
		}
		for(int i = 0;i<numbers.length;i++) {
			add += numbers[i];
		}
		int length = numbers.length;
		double average = add/length;
		JOptionPane.showMessageDialog(null, "The average is: " + average);
	}
}
