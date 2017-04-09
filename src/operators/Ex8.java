// (2) Show that hex and octal notations work with long values.
// Use Long.toBinaryString( ) to display the results.
package operators;

public class Ex8 {

	public static void main(String[] args) {
		long l1 = 0xff;
		long l2 = 077;
		
		System.out.println(Long.toBinaryString(l1));
		System.out.println(Long.toBinaryString(l2));

	}

}
