// (2) Create a class with a method that is overloaded three times.
// Inherit a new class, add a new overloading of the method,
// and show that all four methods are available in the derived class.

package reusing;

public class Ex13 {
	public static void main(String args[]) {
		MeanDog spot = new MeanDog();
		spot.bark();
		spot.bark(3);
		spot.bark("Good morning.");
		spot.bark(true);
	}
}

class Dog {
	public void bark() {
		System.out.println("hello...");
	}

	public void bark(int i) {
		for (int j = 0; j < i; j++) {
			System.out.println("hello, hello...");
		}
	}

	public void bark(String msg) {
		System.out.println(msg);
	}
}

class MeanDog extends Dog {
	public void bark(boolean bite) {
		if (bite)
			System.out.println("I'll bite you...");
		else
			System.out.println("...");
	}
}