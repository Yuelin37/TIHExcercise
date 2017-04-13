// (2) Create a class with a constructor that takes a String argument.
// During construction, print the argument.
// Create an array of object references to this class,
// but don’t actually create objects to assign into the array.
// When you run the program, notice whether the initialization
// messages from the constructor calls are printed.
package initialization;

public class Ex17 {

	public static void main(String[] args) {
		Laptop[] laptops = new Laptop[5];
		// Ex18
		for(int i=0; i<laptops.length; i++){
			laptops[i] = new Laptop("LT-"+i);
		}
		for(Laptop lt:laptops){
			System.out.println(lt.model);
		}
	}

}

class Laptop {
	String model;

	public Laptop(String model) {
		this.model = model;
		System.out.println("Craete a " + model);
	}
}