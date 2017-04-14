// (2) Create a class called Root that contains an instance of each of
// the classes (that you also create) named Component1, Component2, and Component3.
// Derive a class Stem from Root that also contains an instance of each “component.”
// All classes should have default constructors that print a message about that class.
package reusing;

//public class Ex9 {
//
//	public static void main(String[] args) {
//		Root rt = new Root();
//		Stem st = new Stem();
//	}
//
//}
//
//class Component1 {
//	public Component1() {
//		System.out.println("Component1 created.");
//	}
//}
//
//class Component2 {
//	public Component2() {
//		System.out.println("Component2 created.");
//	}
//}
//
//class Component3 {
//	public Component3() {
//		System.out.println("Component3 created.");
//	}
//}
//
//class Root {
//	Component1 cmp1 = new Component1();
//	Component2 cmp2 = new Component2();
//	Component3 cmp3 = new Component3();
//
//	public Root() {
//		System.out.println("Root created.");
//	}
//}
//
//class Stem extends Root {
//	Component1 cmp1 = new Component1();
//	Component2 cmp2 = new Component2();
//	Component3 cmp3 = new Component3();
//
//	public Stem() {
//		System.out.println("Stem created.");
//	}
//}

// (1) Modify the previous exercise so that each class only has non-default constructors.
public class Ex9 {

	public static void main(String[] args) {
		Root rt = new Root(1);
		Stem st = new Stem(1);
	}

}

class Component1 {
	public Component1(int i) {
		System.out.println("Component1 created. --- " + i);
	}
}

class Component2 {
	public Component2(int i) {
		System.out.println("Component2 created. --- " + i);
	}
}

class Component3 {
	public Component3(int i) {
		System.out.println("Component3 created. --- " + i);
	}
}

class Root {
	Component1 cmp1 = new Component1(1);
	Component2 cmp2 = new Component2(1);
	Component3 cmp3 = new Component3(1);

	public Root(int i) {
		System.out.println("Root created. --- " + i);
	}
}

class Stem extends Root {
	Component1 cmp1 = new Component1(2);
	Component2 cmp2 = new Component2(2);
	Component3 cmp3 = new Component3(2);

	public Stem(int i) {
		super(i);
		System.out.println("Stem created. --- " + i);
	}
}