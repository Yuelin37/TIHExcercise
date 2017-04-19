package interfaces;

interface BeCreative {
	void crate();
}

interface CanDraw {
	void draw();
}

interface CanSing {
	void sing();
}

interface CanCode {
	void code();
}

interface Gifted extends BeCreative, CanDraw, CanSing, CanCode {
	void cook();
}

// Ex 14
// class Rich {
// int Savings = 10000000;
//
// public String toString() {
// return ("I'm rich. I have $" + Savings + ".");
// }
// }

// Ex 15
abstract class Rich {
	protected int Savings = 10000000;

	public abstract String toString();
}

class Genius extends Rich implements Gifted {

	@Override
	public void crate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub

	}

	@Override
	public void code() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cook() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		{
			return ("I'm rich. I have $" + Savings + ".");
		}
	}

}

public class Ex14 {
	public static void a(BeCreative x) {
		x.crate();
	}

	public static void b(CanDraw x) {
		x.draw();
	}

	public static void c(CanSing x) {
		x.sing();
	}

	public static void d(CanCode x) {
		x.code();
	}

	public static void e(Gifted x) {
		x.cook();
	}

	public static void main(String[] args) {
		Genius ge = new Genius();
		a(ge);
		b(ge);
		c(ge);
		d(ge);
		e(ge);
		System.out.println(ge.toString());
	}

}

// Exercise 14: (2) Create three interfaces, each with two methods. Inherit a
// new interface that combines the three, adding a new method. Create a class by
// implementing the new interface and also inheriting from a concrete class. Now
// write four methods, each of which takes one of the four interfaces as an
// argument. In main( ), create an object of your class and pass it to each of
// the methods.

// Exercise 15 (2) Modify the previous exercise by creating an abstract class
// and inheriting that into the derived class.