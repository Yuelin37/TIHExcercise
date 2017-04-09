// (3) Write a method that takes two String arguments and uses
// all the boolean comparisons to compare the two Strings and print the results.
// For the == and !=, also perform the equals( ) test.
// In main( ), call your method with some different String objects.

package operators;

public class Ex14 {

	public static void main(String[] args) {
		String str1 = "hellohellohellohellohellohellohellohello";
		String str2 = "worldworldworldworldworldworldworldworld";
		String str3 = "world";
//		testString(str1, str2);
		str2 = "hellohellohellohellohellohellohellohello";
		testString(str1, str2);

	}

	static void testString(String str1, String str2) {
		if (str1 == str2) {
			System.out.println("str1 == str2");
		}
		if (str1 != str2) {
			System.out.println("str1 != str2");
		}
		
		if(str1.equals(str2)){
			System.out.println("str1 equals str2");
		}
	}
}
