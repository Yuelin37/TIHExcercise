// (2) Prove that class loading takes place only once.
// Prove that loading may be caused by either the creation of the first
// instance of that class or by the access of a static member.

package reusing;

public class Ex23 extends MyBase {
	public static void main(String[] args) {
//		new MyBase();
//		new MyBase();
	}
}

// public class Ex23 {
// public static void main(String[] args) {
// new MyBase();
// new MyBase();
// }
// }

class MyBase {
	static int x1 = printInit("static MyBase.x1 initialized");

	static int printInit(String s) {
		System.out.println(s);
		return 37;
	}

	MyBase() {
		System.out.println("MyBase Constructer...");
	}
}