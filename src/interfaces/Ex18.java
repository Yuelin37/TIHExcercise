package interfaces;

interface Cycle {
	void pedal();
}

interface CycleFactory {
	Cycle getCycle();
}

class Unicycle implements Cycle {

	@Override
	public void pedal() {
		System.out.println("Pedalling my unicycle...");
	}
}

class Bicycle implements Cycle {

	@Override
	public void pedal() {
		System.out.println("Pedalling my bicycle...");
	}
}

class Tricycle implements Cycle {

	@Override
	public void pedal() {
		System.out.println("Pedalling my tricycle...");
	}
}

class UnicycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		return new Unicycle();
	}
}

class BicycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		return new Bicycle();
	}
}

class TricycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		return new Tricycle();
	}
}

public class Ex18 {

	static void rideCycle(CycleFactory cf) {
		Cycle cycle = cf.getCycle();
		cycle.pedal();
	}

	public static void main(String[] args) {
		rideCycle(new UnicycleFactory());
		rideCycle(new BicycleFactory());
		rideCycle(new TricycleFactory());
	}
}

// Exercise 18: (2) Create a Cycle interface, with implementations Unicycle,
// Bicycle and Tricycle. Create factories for each type of Cycle, and code that
// uses these factories.