// (1) Create a class with a default constructor (one that takes no arguments)
// that prints a message. Create an object of this class.
package initialization;

public class Ex3 {

	public static void main(String[] args) {
		Tree tree = new Tree();

	}

}

class Tree {
	public Tree() {
		System.out.println("Planting a tree...");
	}

	public Tree(String msg) {
		System.out.println("Planting a tree and want to say: " + msg);
	}
}
