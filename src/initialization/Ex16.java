// (1) Create an array of String objects and assign a String to each element.
// Print the array by using a for loop.
package initialization;

public class Ex16 {

	public static void main(String[] args) {
//		String[] strArr = {"hello", "world"};
//		String[] strArr = new String[] {"hello", "world"};
		String[] strArr = new String[2];
		strArr[0] = "hello";
		strArr[1] = "world";
		for(String str:strArr){
			System.out.println(str);
		}
	}

}
