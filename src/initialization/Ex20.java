// (1) Create a main( ) that uses varargs instead of the ordinary main( ) syntax.
// Print all the elements in the resulting args array.
// Test it with various numbers of command-line arguments.
package initialization;

public class Ex20 {

	public static void main(String... args) {
		for (String arg : args) {
			System.out.println(arg);
		}
	}
}
