// (3) Write a program that uses two nested for loops and the modulus operator (%)
// to detect and print prime numbers (integral numbers
// that are not evenly divisible by any other numbers except for themselves and 1).
package controling_execution;

public class Ex4 {
	public static void main(String args[]) {
		for (int i = 1; i < 1000000; i++) {
			if (isPrime(i))
				System.out.println("Prime: " + i);
		}

	}

	static boolean isPrime(int num) {
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return isPrime;
	}
}
