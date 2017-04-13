// (2) Create a class with public, private, protected, and package-access fields and method members.
// Create an object of this class and see what kind of compiler messages
// you get when you try to access all the class members.
// Be aware that classes in the same directory are part of the “default” package.
package access;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCase tc = new TestCase();
		tc.id = 123;
		tc.priority=2;
		tc.product="New Pro";
	}

}
