// (2) Create a switch statement that prints a message for each case,
// and put the switch inside a for loop that tries each case.
// Put a break after each case and test it, then remove the breaks and see what happens.
package controling_execution;

public class Ex8 {
	public static void main(String args[]) {
		for (int i = 0; i < 128; i++) {
			switch ((char) i) {
			case 'a':
				System.out.println("i: " + i + " ==== char a");
				break;
			case 'z':
				System.out.println("i: " + i + " ==== char z");
				break;
			case 'A':
				System.out.println("i: " + i + " ==== char A");
				break;
			case 'Z':
				System.out.println("i: " + i + " ==== char Z");
				break;
			}
		}
	}
}
