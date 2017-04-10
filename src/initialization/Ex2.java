// (2) Create a class with a String field that is initialized at the point of definition,
// and another one that is initialized by the constructor.
// What is the difference between the two approaches?
package initialization;

public class Ex2 {

	public static void main(String[] args) {
		StringClass sc1 = new StringClass("world");
		System.out.println(sc1.str1);
		System.out.println(sc1.str2);
	}

}

class StringClass {
	public String str1 = "hello";
	public String str2;
	
	public StringClass(String str){
		System.out.println(str1 + " " + str);
	}
}