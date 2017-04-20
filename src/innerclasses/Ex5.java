package innerclasses;

public class Ex5 {
	public static void main(String args[]) {
		Outer outer = new Outer("Outer");
		Outer.Inner inner = outer.new Inner();
		System.out.println(inner);
	}
}

// Exercise 5: (1) Create a class with an inner class. In a separate class, make
// an instance of the inner class.
