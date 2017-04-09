// (3) Following Exercise 5, create a new Dog reference and assign it to spot’s object.
// Test for comparison using == and equals( ) for all references.
package operators;

public class Ex6 {
	
	
	public static void main(String args[]){
		Dog spot = new Dog("spot", "Ruff!");
		Dog scruffy = new Dog("scruffy", "Wurf!");
		Dog xiaosha = spot;
		
		System.out.println(spot == xiaosha);
		System.out.println(spot.equals(xiaosha));
	}

	
}
