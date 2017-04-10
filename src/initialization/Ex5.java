// (2) Create a class called Dog with an overloaded bark( ) method.
// This method should be overloaded based on various primitive data types,
// and print different types of barking, howling, etc.,
// depending on which overloaded version is called.
// Write a main( ) that calls all the different versions.
package initialization;

public class Ex5 {

	public static void main(String[] args) {
		Dog xiaosha = new Dog();
		xiaosha.bark();
		xiaosha.bark(5);
		xiaosha.bark("Good Morning!", 3);
	}

}

class Dog {
	public void bark() {
		System.out.println("bark, bark, bark...");
	}

	public void bark(int i) {
		System.out.println("bark " + i + " times...");
	}

	public void bark(String msg, int n) {
		for (int i = 0; i < n; i++)
			System.out.println("Barking...: " + msg);
	}

	public void bark(int n, String msg) {
		for (int i = 0; i < n; i++)
			System.out.println("Barking... Reverse: " + msg);
	}
}
