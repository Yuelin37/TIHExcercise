package interfaces;

//: polymorphism/Sandwich.java

//Order of constructor calls.

import static net.mindview.util.Print.*;

class Meal {
	Meal() {
		print("Meal()");
	}
}

class Bread {
	Bread() {
		print("Bread()");
	}
}

class Cheese {
	Cheese() {
		print("Cheese()");
	}
}

class Lettuce {
	Lettuce() {
		print("Lettuce()");
	}
}

class Pickle {
	Pickle() {
		print("Pickle()");
	}
}

class Lunch extends Meal {
	Lunch() {
		print("Lunch()");
	}
}

class PortableLunch extends Lunch {
	PortableLunch() {
		print("PortableLunch()");
	}
}

interface FastFood {
	void fastcook();
}

public class Ex8 extends PortableLunch implements FastFood {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	private Pickle p = new Pickle();

	public Ex8() {
		print("Sandwich()");
	}

	public static void main(String[] args) {
		new Ex8().fastcook();;
	}

	@Override
	public void fastcook() {
		System.out.println("Made a sandwich...");
	}
} /*
	 * Output: Meal() Lunch() PortableLunch() Bread() Cheese() Lettuce()
	 * Sandwich()
	 */// :~

// Ex8 (2) In polymorphism.Sandwich.java, create an interface called FastFood
// (with appropriate methods) and change Sandwich so that it also implements
// FastFood.
