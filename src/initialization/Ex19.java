// (2) Write a method that takes a vararg String array.
// Verify that you can pass either a comma-separated list of Strings or a String[] into this method.
package initialization;

public class Ex19 {

	static void printInfo(String... strings) {
		for (String str : strings) {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		String[] strs = { "hello", "world", ";" };
		printInfo(strs);
		printInfo("Hello", "World", "!");
	}

}
