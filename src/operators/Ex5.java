// (2) Create a class called Dog containing two Strings: name and says.
// In main( ), create two dog objects with names “spot” (who says, “Ruff!”)
// and “scruffy” (who says, “Wurf!”). Then display their names and what they say.

package operators;

public class Ex5 {

	public static void main(String[] args) {
		Dog spot = new Dog("spot", "Ruff!");
		Dog scruffy = new Dog("scruffy", "Wurf!");
		System.out.println(spot.name + ": " + spot.says);
		System.out.println(scruffy.name + ": " + scruffy.says);

	}

}

class Dog{
	String name;
	String says;
	
	public Dog(String name, String says){
		this.name=name;
		this.says = says;
	}
}