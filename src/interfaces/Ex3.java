package interfaces;

public class Ex3 {

	public static void main(String[] args) {
		InkPrinter inkPrt = new InkPrinter();
		inkPrt.print();
	}

}

abstract class Printer {
	public abstract void print();

	public Printer() {
		print();
	}
}

class InkPrinter extends Printer {
	int id = 6;

	public void print() {
		System.out.println("id: " + id);
	}
}
// Ex3 (2) Create a base class with an abstract print( ) method that is
// overridden in a derived class. The overridden version of the method prints
// the value of an int variable defined in the derived class. At the point of
// definition of this variable, give it a nonzero value. In the base-class
// constructor, call this method. In main( ), create an object of the derived
// type, and then call its print( ) method. Explain the results.