// (2) Create a class with a finalize( ) method that prints a message.
// In main( ), create an object of your class. Explain the behavior of your program.
package initialization;

public class Ex10 {

	public static void main(String[] args) {
		Problem p1 = new Problem();
		// p1.fixed = true;
		new Problem();
		new Problem();
		new Problem();
		new Problem();
		new Problem();
		new Problem();
		new Problem();
		new Problem();
		new Problem();
		System.gc();
	}

}

class Problem {
	boolean fixed = false;

	protected void finalize() {
		if (fixed)
			System.out.println("Finalizing...");
		else {
			System.out.println("It's not fixed yet...");
			System.out.println(this);
		}
		// System.out.println("Finalizing...");
	}
}