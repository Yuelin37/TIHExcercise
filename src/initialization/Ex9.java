// (1) Create a class with two (overloaded) constructors.
// Using this, call the second constructor inside the first one.
package initialization;

public class Ex9 {

	public static void main(String[] args) {
		Golf myGolf = new Golf(2, true);
		System.out.println(myGolf.doors + " doors, " + (myGolf.gti ? "GTI." : "Non GTI."));
		Golf myAnotherGolf = new Golf();
		System.out.println(myAnotherGolf.doors + " doors, " + (myAnotherGolf.gti ? "GTI." : "Non GTI."));
	}

}

class Golf {
	int doors = 4;
	boolean gti = false;

	public Golf() {
		System.out.println("You found a golf...");
	}

	public Golf(int doors, boolean gti) {
		this();
		this.doors = doors;
		this.gti = gti;
	}
}

