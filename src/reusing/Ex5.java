// (1) Create two classes, A and B, with default constructors
// (empty argument lists) that announce themselves.
// Inherit a new class called C from A, and create a member of class B inside C.
// Do not create a constructor for C. Create an object of class C and observe the results.

// Ex5
//public class Ex5 {
//
//	public static void main(String[] args) {
//		C c = new C();
//	}
//
//}
//
//class A {
//	public A() {
//		System.out.println("A constructed...");
//	}
//}
//
//class B {
//	public B() {
//		System.out.println("B constructed...");
//	}
//}
//
//class C extends A {
//	B b = new B();
//}

// Ex7 (1) Modify Exercise 5 so that A and B have constructors with arguments instead of default constructors.
// Write a constructor for C and perform all initialization within C’s constructor.
package reusing;

// Ex7
public class Ex5 {

	public static void main(String[] args) {
		C c = new C(3);
	}

}

class A {
	public A(int i) {
		System.out.println("A constructed...");
	}
}

class B {
	public B(int i) {
		System.out.println("B constructed...");
	}
}

class C extends A {
	B b = new B(2);
	public C(int i){
		super(i);
	}
}

