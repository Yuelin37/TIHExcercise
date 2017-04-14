// (2) Create a class with a blank final reference to an object.
// Perform the initialization of the blank final inside all constructors.
// Demonstrate the guarantee that the final must be initialized before use,
// and that it cannot be changed once initialized.

package reusing;

public class Ex19 {
	private final Dummy d1;

	public Ex19() {
		d1 = new Dummy();
	}

	public static void main(String[] args) {
		Ex19 ex19 = new Ex19();
		System.out.println(ex19.d1.i);
		// ex19.d1 = new Dummy();
	}

}

class Dummy {
	int i = 0;
}