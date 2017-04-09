// (2) Write a program that generates 25 random int values.
// For each value, use an if-else statement to classify it as greater than,
// less than, or equal to a second randomly generated value.
package controling_execution;

public class Ex2 {

	public static void main(String[] args) {
		double std = Math.random();
		for (int i = 0; i <= 25; i++) {
			double rand = Math.random();
			System.out.println("i = " + i + ": ");
			if (rand < std)
				System.out.println(rand + " < " + std);
			else if (rand > std)
				System.out.println(rand + " > " + std);
			else
				System.out.println(rand + " = " + std);
		}
	}

}
