// Ex9 (3) Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc.
// In the base class, provide methods that are common to all Rodents,
// and override these in the derived classes to perform different behaviors
// depending on the specific type of Rodent. Create an array of Rodent,
// fill it with different specific types of Rodents,
// and call your base-class methods to see what happens.

package polymorphism;

import static net.mindview.util.Print.print;

public class Ex9 {
	public static void main(String args[]) {
		Mainframe mainframe = new Mainframe();
		Rodent[] rodents = { new Mouse(), new Gerbil(), new Hamster() };
		for (Rodent rodent : rodents) {
			mainframe.login();
			rodent.code();
			System.out.println("I'm a " + rodent.getDegree());
		}
		for (Rodent rodent : rodents) {
			mainframe.logout();
			mainframe.reboot();
		}
	}
}

class Degree {
	private String degree;

	public Degree(String degree) {
		this.degree = degree;
	}

	public String getDegree() {
		return degree;
	}
}

class Mainframe {
	private int logincount = 0;
	private static long counter = 0;
	private final long id = counter++;

	public Mainframe() {
		print("Creating " + this);
	}

	public void login() {
		logincount++;
		System.out.println("login()...");
		System.out.println("logincount: " + logincount);
	}

	protected void logout() {
		if (--logincount == 0)
			print("logout " + this);
		System.out.println("logincount: " + logincount);
	}

	public String toString() {
		return "Mainframe " + id;
	}

	public void reboot() {
		if (logincount != 0)
			System.out.println(this + " is still in use...");
		else
			System.out.println(this + " is being rebooted.");
	}

	protected void finalize() {
		if (logincount != 0)
			System.out.println(this + " is still in use...");
		// Normally, you'll also do this:
		// super.finalize(); // Call the base-class version
	}
}

class Rodent {
	private Degree degree;

	public Rodent() {
		System.out.println("Rodent()");
		degree = new Degree("Drop Off");
	}

	void code() {
		System.out.println("Hello World!");
	}

	public String getDegree() {
		return degree.getDegree();
	}
}

class Mouse extends Rodent {
	private Degree degree;

	public Mouse() {
		System.out.println("Mouse()");

	}

	void code() {
		System.out.println("Hello Java!");
		degree = new Degree("Bachelor");
	}

	public String getDegree() {
		return degree.getDegree();
	}
}

class Gerbil extends Rodent {
	private Degree degree;

	public Gerbil() {
		System.out.println("Gerbil()");
		degree = new Degree("Master");
	}

	void code() {
		System.out.println("Hello Node.js!");
	}

	public String getDegree() {
		return degree.getDegree();
	}
}

class Hamster extends Rodent {
	private Degree degree;

	public Hamster() {
		System.out.println("Hamster()");
		degree = new Degree("Doctor");
	}

	void code() {
		System.out.println("Hello Python!");
	}

	public String getDegree() {
		return degree.getDegree();
	}
}

// EX12 (3) Modify Exercise 9 so that it demonstrates the order of
// initialization of the base classes and derived classes. Now add member
// objects to both the base and derived classes and show the order in which
// their initialization occurs during construction.

// Ex14 (4) Modify Exercise 12 so that one of the member objects is a shared
// object with reference counting, and demonstrate that it works properly.