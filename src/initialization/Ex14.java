// (1) Create a class with a static String field that is initialized at the point of definition,
// and another one that is initialized by the static block.
// Add a static method that prints both fields and demonstrates that
// they are both initialized before they are used.
package initialization;

public class Ex14 {

	public static void main(String[] args) {
//		LC lc = new LC();
		LC.printInfo();
	}

}

class LC {
	static int cylenders = 8;
	static int speakers;
	static {
		speakers = 15;
	}
	static void printInfo(){
		System.out.println("Cylenders: " + cylenders);
		System.out.println("Speakers: " + speakers);
	}
}