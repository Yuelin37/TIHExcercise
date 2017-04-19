// (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
// Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.
package polymorphism;

public class Ex1 {

	public static void ride(Cycle cycle) {
		System.out.println("Paddling...");
		System.out.println(cycle.wheels() + " wheels.");
		cycle.ride();
	}

	public static void main(String[] args) {
		Cycle bike = new Bicycle();
		ride(bike);
		Cycle tri = new Tricycle();
		ride(tri);

		Cycle[] cycles = { new Unicycle(), new Bicycle(), new Tricycle() };
		((Unicycle) cycles[0]).balance();
		((Bicycle) cycles[1]).balance();
		// ((Tricycle)cycles[2]).balance();
	}

}

class Cycle {

	public void ride() {
		System.out.println("Riding...");
	}

	public int wheels() {
		return 0;
	}
}

class Unicycle extends Cycle {
	public void ride() {
		System.out.println("Hard to ride...");
	}

	public int wheels() {
		return 1;
	}

	public void balance() {
		System.out.println("Very hard to balance...");
	}
}

class Bicycle extends Cycle {
	public void ride() {
		System.out.println("Eaiser to ride...");
	}

	public int wheels() {
		return 2;
	}

	public void balance() {
		System.out.println("Hard to balance...");
	}
}

class Tricycle extends Cycle {
	public void ride() {
		System.out.println("Easy to ride... Sometimes...");
	}

	public int wheels() {
		return 3;
	}
}

// Ex5 (1) Starting from Exercise 1, add a wheels( ) method in Cycle,
// which returns the number of wheels.
// Modify ride( ) to call wheels( ) and verify that polymorphism works.

// Ex17 (2) Using the Cycle hierarchy from Exercise 1, add a balance( ) method
// to
// Unicycle and Bicycle, but not to Tricycle. Create instances of all three
// types and upcast them to an array of Cycle. Try to call balance( ) on each
// element of the array and observe the results. Downcast and call balance( )
// and observe what happens.