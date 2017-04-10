// (4) A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34,
// and so on, where each number (from the third on) is the sum of the previous two.
// Create a method that takes an integer as an argument
// and displays that many Fibonacci numbers starting from the beginning, e.g.,
// If you run java Fibonacci 5 (where Fibonacci is the name of the class)
// the output will be: 1, 1, 2, 3, 5.
package controling_execution;

public class Ex9 {

	public static void main(String[] args) {
		Fibonacci(60);
	}

	static void Fibonacci(int i) {
		if (i < 2) {
			System.out.println("Input must be 2 or greater.");
		}

		else {
			System.out.print("1, 1");
			long previous = 1;
			long nextToPrevious = 1;
			for (int j = 3; j <= i; j++) {
				long current = previous + nextToPrevious;
				System.out.print(", " + current);
				nextToPrevious = previous;
				previous = current;
				
			}
		}
	}

}
