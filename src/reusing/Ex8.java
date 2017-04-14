// (1) Create a base class with only a non-default constructor,
// and a derived class with both a default (no-arg) and non-default constructor.
// In the derived-class constructors, call the base-class constructor.
package reusing;

public class Ex8 {

	public static void main(String[] args) {
		Child chd = new Child("Yan");
		Child chd1 = new Child();
	}

}

class Parent {
	String familyName = "";

	public Parent(String fn) {
		familyName = fn;
		System.out.println("Family: " + fn + " created.");
	}
}

class Child extends Parent {
	public Child() {
		super("Anonymous");
		System.out.println("Child created");
	}

	public Child(String fn) {
		super(fn);
		System.out.println("Child of family " + fn + " created.");
	}
}