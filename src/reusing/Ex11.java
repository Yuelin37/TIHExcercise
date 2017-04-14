// (3) Modify Detergent.java so that it uses delegation.
package reusing;

import static net.mindview.util.Print.print;

class Cleanser {
	private String s = "Cleanser";

	public void append(String a) {
		s += a;
	}

	public void dilute() {
		append(" dilute()");
	}

	public void apply() {
		append(" apply()");
	}

	public void scrub() {
		append(" scrub()");
	}

	public String toString() {
		return s;
	}

	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		print(x);
	}
}

public class Ex11 {

	private String name = "soap";
	private Cleanser cleanser = new Cleanser();
	
	public void dilute() {
		cleanser.append(" You don't need to dilute a piece of soap...");
	}

	public void apply() {
		cleanser.append(" apply()");
	}

	public void scrub() {
		cleanser.append(" scrub()");
	}
	
	// Add methods to the interface:
	public void foam() {
		cleanser.append(" foam()");
	}
	public String toString() {
		return cleanser.toString();
	}
	// Test the new class:
	public static void main(String[] args) {
		Ex11 x = new Ex11();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		print(x);
		print("Testing base class:");
		Cleanser.main(args);
	}
}