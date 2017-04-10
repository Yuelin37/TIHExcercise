// (1) Create a class containing an uninitialized String reference.
// Demonstrate that this reference is initialized by Java to null.
package initialization;

public class Ex1 {

	public static void main(String[] args) {
		NullString myNullString = new NullString();
		System.out.println(myNullString.nullString);
	}

}

class NullString {
	public String nullString;
}