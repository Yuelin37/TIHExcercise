// (3) Create a base class with two methods. In the first method,
// call the second method. Inherit a class and override the second method.
// Create an object of the derived class, upcast it to the base type,
// and call the first method. Explain what happens.

package polymorphism;

public class Ex10 {

	public static void main(String[] args) {
		Computer p50 = new Laptop();
		p50.output("Thinking in Java...");
	}

}

class Computer {
	void output(String msg) {
		System.out.println(format(msg));
	}

	String format(String msg) {
		return ("Formatted: " + msg);
	}
}

class Laptop extends Computer {
	@Override
	String format(String msg) {
		return ("Laptop Formatted: " + msg);
	}
}