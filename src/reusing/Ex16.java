// (2) Create a class called Amphibian. From this, inherit a class called Frog.
// Put appropriate methods in the base class.
// In main( ), create a Frog and upcast it to Amphibian and demonstrate that all the methods still work.
package reusing;

public class Ex16 {

	public static void main(String[] args) {
		Frog frog = new Frog();
		Amphibian.move(frog);
	}

}

class Amphibian {
	public void swim() {
		System.out.println("I'm swimming...");
	}

	public void walk() {
		System.out.println("I'm walking...");
	}

	public static void move(Amphibian am) {
		am.walk();
		am.swim();
	}
}

class Frog extends Amphibian {
	// Ex17 (1) Modify Exercise 16 so that Frog overrides
	// the method definitions from the base class (provides new definitions
	// using the same method signatures).
	// Note what happens in main( ).
	// @Override
	// public void walk() {
	// System.out.println("I'm jumpping...");
	// }
}