// (1) Create a class with protected data.
// Create a second class in the same file with a method that manipulates the protected data in the first class.
package access;

public class Ex6 {
	public static void main(String args[]) {
		AnotherClass ac = new AnotherClass();
		ac.id = 123;
		System.out.println(ac.id);
	}
}

class AnotherClass {
	protected int id = 0;
}