package innerclasses;

class Outer {
	private String secret;

	public Outer(String msg) {
		secret = msg;
	}

	class Inner {
		public String toString() {
			return secret;
		}
	}

	public Inner getInner() {
		return new Inner();
	}
}

public class Ex1 {

	public static void main(String[] args) {
		Outer outer = new Outer("It's a secret.");
		Outer.Inner refInner = outer.getInner();
		System.out.println(refInner.toString());
	}

}

// Exercise 1: (1) Write a class named Outer that contains an inner class named
// Inner. Add a method to Outer that returns an object of type Inner. In main(
// ), create and initialize a reference to an Inner.

// Exercise 3: (1) Modify Exercise 1 so that Outer has a private String field
// (initialized by the constructor), and Inner has a toString( ) that displays
// this field. Create an object of type Inner and display it.