// (1) Modify the previous exercise so that two of the overloaded methods
// have two arguments (of two different types),
// but in reversed order relative to each other. Verify that this works.

package initialization;

public class Ex6 {

	public static void main(String[] args) {
		Dog xiaosha = new Dog();
		xiaosha.bark();
		xiaosha.bark(5);
		xiaosha.bark("Good Morning!", 3);
		xiaosha.bark(2, "Good Morning!");
	}

}
