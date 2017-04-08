// (2) Write a program that includes and calls the storage( ) method
// defined as a code fragment in this chapter.
package object;

public class Ex6 {

	String s = "Hello World!";
	String s1 = new String("Another String...");
	public static void main(String[] args) {
		Ex6 myEx6 = new Ex6();
		System.out.println(myEx6.storage(myEx6.s));
		System.out.println(myEx6.storage(myEx6.s1));
	}

	int storage(String s) {
		return s.length() * 2;
	}
}
