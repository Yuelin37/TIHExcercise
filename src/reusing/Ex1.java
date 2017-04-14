// (2) Create a simple class. Inside a second class,
// define a reference to an object of the first class.
// Use lazy initialization to instantiate this object.
package reusing;

public class Ex1 {

	public static void main(String[] args) {
		Lazy lz = null;
		if (lz == null) {
			lz = new Lazy();
		}
		System.out.println("lz --- " + lz);

	}

}

class Lazy {
	int lazinessIndex = 100;

	public String toString() {
		return ("My laziness index is: " + lazinessIndex);
	}
}