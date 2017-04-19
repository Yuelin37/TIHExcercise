package interfaces;

import static net.mindview.util.Print.print;

public class Ex1 {
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

// abstract class Rodent {
//
// public Rodent() {
// System.out.println("Rodent()");
// }
//
// abstract void code();
//
// public abstract String getDegree();
// }
//
// class Mouse extends Rodent {
// private Degree degree;
//
// public Mouse() {
// System.out.println("Mouse()");
//
// }
//
// void code() {
// System.out.println("Hello Java!");
// degree = new Degree("Bachelor");
// }
//
// public String getDegree() {
// return degree.getDegree();
// }
// }
//
// class Gerbil extends Rodent {
// private Degree degree;
//
// public Gerbil() {
// System.out.println("Gerbil()");
// degree = new Degree("Master");
// }
//
// void code() {
// System.out.println("Hello Node.js!");
// }
//
// public String getDegree() {
// return degree.getDegree();
// }
// }
//
// class Hamster extends Rodent {
// private Degree degree;
//
// public Hamster() {
// System.out.println("Hamster()");
// degree = new Degree("Doctor");
// }
//
// void code() {
// System.out.println("Hello Python!");
// }
//
// public String getDegree() {
// return degree.getDegree();
// }
// }

// (1) Modify Exercise 9 in the previous chapter so that Rodent is an abstract
// class. Make the methods of Rodent abstract whenever possible.

interface Rodent {

	void code();

	String getDegree();
}

class Mouse implements Rodent {
	private Degree degree;

	public Mouse() {
		System.out.println("Mouse()");

	}

	public void code() {
		System.out.println("Hello Java!");
		degree = new Degree("Bachelor");
	}

	public String getDegree() {
		return degree.getDegree();
	}
}

class Gerbil implements Rodent {
	private Degree degree;

	public Gerbil() {
		System.out.println("Gerbil()");
		degree = new Degree("Master");
	}

	public void code() {
		System.out.println("Hello Node.js!");
	}

	public String getDegree() {
		return degree.getDegree();
	}
}

class Hamster implements Rodent {
	private Degree degree;

	public Hamster() {
		System.out.println("Hamster()");
		degree = new Degree("Doctor");
	}

	public void code() {
		System.out.println("Hello Python!");
	}

	public String getDegree() {
		return degree.getDegree();
	}
}
// Ex7 (1) Change Exercise 9 in the Polymorphism chapter so that Rodent is an
// interface.