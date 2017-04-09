// (1) Create a class containing a float and use it to demonstrate aliasing during method calls.
package operators;

public class Ex3 {
	static void f(FloatClass fl) {
		fl.flt = 100;
	}

	public static void main(String[] args) {
		FloatClass fc1 = new FloatClass();
		FloatClass fc2 = new FloatClass();

		f(fc1);
		System.out.println("fc1.flt: " + fc1.flt);

	}

}